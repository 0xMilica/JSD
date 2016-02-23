package model.painters;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.RoundRectangle2D;
import java.util.List;

import model.elements.ZaobljeniPravougaonik;
import model.pozicija.GridPozicija;
import model.pozicija.KoordinatePozicija;
import model.pozicija.StraneSvetaPozicija;
import model.raspored.GridRaspored;
import model.raspored.KoordinateRaspored;
import model.raspored.Raspored;
import model.raspored.StraneSveta;
import model.raspored.StraneSvetaRaspored;
import model.Oblik;
import model.OblikPainter;

public class ZaobljeniPravougaonikPainter extends OblikPainter {

	public ZaobljeniPravougaonikPainter(Oblik oblik) {
		super(oblik);
	}

	@Override
	public void paint(Graphics2D g) {
		
		ZaobljeniPravougaonik pravougaonik = (ZaobljeniPravougaonik) oblik;
		
		int a = pravougaonik.getA();
		int b = pravougaonik.getB();
		int visinaLuka = pravougaonik.getVisinaLuka();
		int sirinaLuka = pravougaonik.getSirinaLuka();
		
		if (pravougaonik.getColor() != null) {
			g.setColor(pravougaonik.getColor());
		} else {
			g.setColor(Color.BLUE);
		}
		
		g.rotate(Math.toRadians(pravougaonik.getUgao()));
		
		// u zavisnosti od rasporeda i pozicije, izracunaj tacke i iscrtaj element
		Raspored raspored = pravougaonik.getPozicija().getRaspored();
		if (raspored instanceof KoordinateRaspored) {
			
			KoordinatePozicija pozicija = (KoordinatePozicija) pravougaonik.getPozicija();
			
			int x = (int) pozicija.getX1();
			int y = (int) pozicija.getY1();

			KoordinateRaspored koordinate = (KoordinateRaspored) raspored;
			Point2D tacka = koordinate.getTacka(x, y);
			
			int x1 = (int) tacka.getX();
			int y1 = (int) tacka.getY();
			
			RoundRectangle2D roundRectangle = new RoundRectangle2D.Double(x1, y1, a, b, visinaLuka, sirinaLuka);
			
			g.draw(roundRectangle);
			g.fill(roundRectangle);
		
		} else if (raspored instanceof GridRaspored) {
			
			GridPozicija pozicija = (GridPozicija) pravougaonik.getPozicija();
			
			int brojReda = pozicija.getBrojReda();
			int brojKolone = pozicija.getBrojKolone();
			
			GridRaspored grid = (GridRaspored) raspored;
			Point2D tacka = grid.izracunajTackuZaCeliju(brojKolone, brojReda);
			
			int x = (int) tacka.getX();
			int y = (int) tacka.getY();
			
			RoundRectangle2D roundRectangle = new RoundRectangle2D.Double(x, y, a, b, visinaLuka, sirinaLuka);
			
			g.draw(roundRectangle);
			g.fill(roundRectangle);
			
		} else if (raspored instanceof StraneSvetaRaspored) {
			
			StraneSvetaPozicija pozicija = (StraneSvetaPozicija) pravougaonik.getPozicija();
			
			StraneSveta stranaSveta = pozicija.getStranaSveta();

			StraneSvetaRaspored straneSveta = (StraneSvetaRaspored) raspored;	
			
			Point2D tacka = straneSveta.getTackaZaobljeniPravougaonik(stranaSveta, pravougaonik);
			
			int x = (int) tacka.getX();
			int y = (int) tacka.getY();

			RoundRectangle2D roundRectangle = new RoundRectangle2D.Double(x, y, a, b, visinaLuka, sirinaLuka);
			
			g.draw(roundRectangle);
			g.fill(roundRectangle);

		}
	}

	@Override
	public boolean isElementAt(Point2D pos) {
		return false;
	}

}
