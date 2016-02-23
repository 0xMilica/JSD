package model.painters;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

import model.Oblik;
import model.OblikPainter;
import model.elements.Pravougaonik;
import model.pozicija.GridPozicija;
import model.pozicija.KoordinatePozicija;
import model.pozicija.StraneSvetaPozicija;
import model.raspored.GridRaspored;
import model.raspored.KoordinateRaspored;
import model.raspored.Raspored;
import model.raspored.StraneSveta;
import model.raspored.StraneSvetaRaspored;

public class PravougaonikPainter extends OblikPainter {

	public PravougaonikPainter(Oblik oblik) {
		super(oblik);
	}

	@Override
	public void paint(Graphics2D g) {
		
		Pravougaonik pravougaonik = (Pravougaonik) oblik;
		
		int a = pravougaonik.getA();
		int b = pravougaonik.getB();
		
		if (pravougaonik.getColor() != null) {
			g.setColor(pravougaonik.getColor());
		} else {
			g.setColor(Color.BLUE);
		}
		
		g.rotate(Math.toRadians(pravougaonik.getUgao()));

		// u zavisnosti od rasporeda i pozicije, izracunaj tacke i iscrtaj oblik
		Raspored raspored = pravougaonik.getPozicija().getRaspored();
		if (raspored instanceof KoordinateRaspored) {
			
			KoordinatePozicija pozicija = (KoordinatePozicija) pravougaonik.getPozicija();
			
			int x1 = (int) pozicija.getX1();
			int y1 = (int) pozicija.getY1();
			
			int x2 = (int) pozicija.getX2();
			int y2 = (int) pozicija.getY2();
			
			int x3 = (int) pozicija.getX3();
			int y3 = (int) pozicija.getY3();
			
			int x4 = (int) pozicija.getX4();
			int y4 = (int) pozicija.getY4();
			
			KoordinateRaspored koordinate = (KoordinateRaspored) raspored;
			Point2D tacka1 = koordinate.getTacka(x1, y1);
			Point2D tacka2 = koordinate.getTacka(x2, y2);
			Point2D tacka3 = koordinate.getTacka(x3, y3);
			Point2D tacka4 = koordinate.getTacka(x4, y4);
			
			g.draw(new Line2D.Double(tacka1, tacka2));
			g.draw(new Line2D.Double(tacka2, tacka3));
			g.draw(new Line2D.Double(tacka3, tacka4));
			g.draw(new Line2D.Double(tacka4, tacka1));
			
			g.fillPolygon(new int[] { x1, x2, x3, x4 }, new int[] { y1, y2, y3, y4 }, 4);
			
		} else if (raspored instanceof GridRaspored) {
			
			GridPozicija pozicija = (GridPozicija) pravougaonik.getPozicija();
			
			int brojReda = pozicija.getBrojReda();
			int brojKolone = pozicija.getBrojKolone();
			
			GridRaspored grid = (GridRaspored) raspored;
			Point2D tacka = grid.izracunajTackuZaCeliju(brojKolone, brojReda);

			int x1 = (int) tacka.getX();
			int y1 = (int) tacka.getY();
			
			Rectangle2D rectangle = new Rectangle2D.Double(x1, y1, a, b);
			
			g.draw(rectangle);
			g.fill(rectangle);			
		
		} else if (raspored instanceof StraneSvetaRaspored) {
			
			StraneSvetaPozicija pozicija = (StraneSvetaPozicija) pravougaonik.getPozicija();		
			
			StraneSveta stranaSveta = pozicija.getStranaSveta();

			StraneSvetaRaspored straneSveta = (StraneSvetaRaspored) raspored;	
			
			Point2D tacka = straneSveta.getTackaPravougaonik(stranaSveta, pravougaonik);
			
			int x = (int) tacka.getX();
			int y = (int) tacka.getY();

			Rectangle2D rectangle = new Rectangle2D.Double(x, y, a, b);
			
			g.draw(rectangle);
			g.fill(rectangle);

		}
		
	}

	@Override
	public boolean isElementAt(Point2D pos) {
		return false;
	}

}
