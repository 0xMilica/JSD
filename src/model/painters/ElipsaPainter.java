package model.painters;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import model.Oblik;
import model.OblikPainter;
import model.elements.Elipsa;
import model.pozicija.GridPozicija;
import model.pozicija.KoordinatePozicija;
import model.pozicija.StraneSvetaPozicija;
import model.raspored.GridRaspored;
import model.raspored.KoordinateRaspored;
import model.raspored.Raspored;
import model.raspored.StraneSveta;
import model.raspored.StraneSvetaRaspored;

public class ElipsaPainter extends OblikPainter {

	public ElipsaPainter(Oblik oblik) {
		super(oblik);
	}

	@Override
	public void paint(Graphics2D g) {
		
		Elipsa elipsa = (Elipsa) oblik;
		
		int precnik1 = elipsa.getPrecnik1();
		int precnik2 = elipsa.getPrecnik2();
		
		if (elipsa.getColor() != null) {
			g.setColor(elipsa.getColor());
		} else {
			g.setColor(Color.BLUE);
		}
		
		g.rotate(Math.toRadians(elipsa.getUgao()));
		
		// u zavisnosti od rasporeda i pozicije, izracunaj tacke i iscrtaj element
		
		Raspored raspored = elipsa.getPozicija().getRaspored();
		if (raspored instanceof KoordinateRaspored) {

			KoordinatePozicija pozicija = (KoordinatePozicija) elipsa.getPozicija();
			
			int x = (int) pozicija.getX1();
			int y = (int) pozicija.getY1();

			KoordinateRaspored koordinate = (KoordinateRaspored) raspored;
			Point2D tacka = koordinate.getTacka(x, y);
			
			int x1 = (int) tacka.getX();
			int y1 = (int) tacka.getY();
			
			Ellipse2D elipse = new Ellipse2D.Double(x1, y1, precnik1, precnik2);
			
			g.draw(elipse);
			g.fill(elipse);
		
		} else if (raspored instanceof GridRaspored) {
			
			GridPozicija pozicija = (GridPozicija) elipsa.getPozicija();
			
			int brojReda = pozicija.getBrojReda();
			int brojKolone = pozicija.getBrojKolone();
			
			GridRaspored grid = (GridRaspored) raspored;
			Point2D tacka = grid.izracunajTackuZaCeliju(brojKolone, brojReda);
			
			int x = (int) tacka.getX();
			int y = (int) tacka.getY();
			
			Ellipse2D elipse = new Ellipse2D.Double(x, y, precnik1, precnik2);
			
			g.draw(elipse);
			g.fill(elipse);
			
		} else if (raspored instanceof StraneSvetaRaspored) {
			
			StraneSvetaPozicija pozicija = (StraneSvetaPozicija) elipsa.getPozicija();
			
			StraneSveta stranaSveta = pozicija.getStranaSveta();

			StraneSvetaRaspored straneSveta = (StraneSvetaRaspored) raspored;	
			
			Point2D tacka = straneSveta.getTackaElipsa(stranaSveta, elipsa);
			
			int x = (int) tacka.getX();
			int y = (int) tacka.getY();

			Ellipse2D elipse = new Ellipse2D.Double(x, y, precnik1, precnik2);
			
			g.draw(elipse);
			g.fill(elipse);
		}
	}

	@Override
	public boolean isElementAt(Point2D pos) {
		return false;
	}

}
