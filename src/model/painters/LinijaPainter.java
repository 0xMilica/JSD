package model.painters;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.List;

import model.Oblik;
import model.OblikPainter;
import model.elements.Linija;
import model.pozicija.GridPozicija;
import model.pozicija.KoordinatePozicija;
import model.pozicija.StraneSvetaPozicija;
import model.raspored.GridRaspored;
import model.raspored.KoordinateRaspored;
import model.raspored.Raspored;
import model.raspored.StraneSveta;
import model.raspored.StraneSvetaRaspored;

public class LinijaPainter extends OblikPainter {

	public LinijaPainter(Oblik oblik) {
		super(oblik);
	}

	@Override
	public void paint(Graphics2D g) {
		
		Linija linija = (Linija) oblik;
		
		int duzina = linija.getDuzina();
		
		if (linija.getColor() != null) {
			g.setColor(linija.getColor());
		} else {
			g.setColor(Color.BLUE);
		}
		
		g.rotate(Math.toRadians(linija.getUgao()));
		
		// u zavisnosti od rasporeda i pozicije, izracunaj tacke i iscrtaj oblik
		Raspored raspored = linija.getPozicija().getRaspored();
		if (raspored instanceof KoordinateRaspored) {
			
			KoordinatePozicija pozicija = (KoordinatePozicija) linija.getPozicija();
			
			int x1 = (int) pozicija.getX1();
			int y1 = (int) pozicija.getY1();
			
			int x2 = (int) pozicija.getX2();
			int y2 = (int) pozicija.getY2();
			
			KoordinateRaspored koordinate = (KoordinateRaspored) raspored;
			Point2D tacka1 = koordinate.getTacka(x1, y1);
			Point2D tacka2 = koordinate.getTacka(x2, y2);
			
			//System.out.println(tacka1 + " " + tacka2);
			
			Line2D line = new Line2D.Double(tacka1, tacka2);
			
			g.draw(line);	
			g.fill(line);
			
		} else if (raspored instanceof GridRaspored) {
			
			GridPozicija pozicija = (GridPozicija) linija.getPozicija();
			
			int brojReda = pozicija.getBrojReda();
			int brojKolone = pozicija.getBrojKolone();
			
			GridRaspored grid = (GridRaspored) raspored;
			Point2D tacka1 = grid.izracunajTackuZaCeliju(brojKolone, brojReda);
			
			int x2 = (int) (tacka1.getX() + duzina);
			int y2 = (int) tacka1.getY();
			
			Point2D tacka2 = new Point2D.Double(x2, y2);

			Line2D line = new Line2D.Double(tacka1, tacka2);
			
			g.draw(line);
			g.fill(line);			
		
		} else if (raspored instanceof StraneSvetaRaspored) {
			
			StraneSvetaPozicija pozicija = (StraneSvetaPozicija) linija.getPozicija();
			
			StraneSveta stranaSveta = pozicija.getStranaSveta();

			StraneSvetaRaspored straneSveta = (StraneSvetaRaspored) raspored;	
			
			List<Point2D> tacke = straneSveta.getTackeLinija(stranaSveta, linija);
			
			Point2D tacka1 = tacke.get(0);
			Point2D tacka2 = tacke.get(1);

			Line2D line = new Line2D.Double(tacka1, tacka2);
			
			g.draw(line);
			g.fill(line);
		}
		
	}

	@Override
	public boolean isElementAt(Point2D pos) {
		return false;
	}

}
