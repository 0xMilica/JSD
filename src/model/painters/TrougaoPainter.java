package model.painters;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.List;

import model.Oblik;
import model.OblikPainter;
import model.elements.Trougao;
import model.pozicija.GridPozicija;
import model.pozicija.KoordinatePozicija;
import model.pozicija.StraneSvetaPozicija;
import model.raspored.GridRaspored;
import model.raspored.KoordinateRaspored;
import model.raspored.Raspored;
import model.raspored.StraneSveta;
import model.raspored.StraneSvetaRaspored;

public class TrougaoPainter extends OblikPainter {

	public TrougaoPainter(Oblik oblik) {
		super(oblik);
	}

	@Override
	public void paint(Graphics2D g) {
		
		Trougao trougao = (Trougao) oblik;
		
		int a = trougao.getA();
		int b = trougao.getB();
		int c = trougao.getC();
		
		if (trougao.getColor() != null) {
			g.setColor(trougao.getColor());
		} else {
			g.setColor(Color.BLUE);
		}
		
		g.rotate(Math.toRadians(trougao.getUgao()));
		
		// u zavisnosti od rasporeda i pozicije, izracunaj tacke i iscrtaj oblik
		Raspored raspored = trougao.getPozicija().getRaspored();
		if(raspored instanceof KoordinateRaspored) {
			
			KoordinatePozicija pozicija = (KoordinatePozicija) trougao.getPozicija();
			
			KoordinateRaspored koordinate = (KoordinateRaspored) raspored;
			
			int x1 = (int) pozicija.getX1();
			int y1 = (int) pozicija.getY1();
			
			int x2 = (int) pozicija.getX2();
			int y2 = (int) pozicija.getY3();
			
			int x3 = (int) pozicija.getX3();
			int y3 = (int) pozicija.getY3();
					
			Point2D tacka1 = koordinate.getTacka(x1, y1);
			Point2D tacka2 = koordinate.getTacka(x2, y2);
			Point2D tacka3 = koordinate.getTacka(x3, y3);
			
			//System.out.println("Trougao koordinate: " + tacka1 + " " + tacka2 + " " + tacka3);
			
			g.draw(new Line2D.Double(tacka1, tacka2));
			g.draw(new Line2D.Double(tacka2, tacka3));
			g.draw(new Line2D.Double(tacka3, tacka1));
			
			g.fillPolygon(new int[] { x1, x2, x3 }, new int[] { y1, y2, y3 }, 3);
			
		} else if (raspored instanceof GridRaspored) {
			
			GridPozicija pozicija = (GridPozicija) trougao.getPozicija();
			
			int brojReda = pozicija.getBrojReda();
			int brojKolone = pozicija.getBrojKolone();
			
			GridRaspored grid = (GridRaspored) raspored;
			Point2D tacka = grid.izracunajTackuZaCeliju(brojKolone, brojReda);
			
			int x1 = (int) tacka.getX();
			int y1 = (int) tacka.getY();
			int x2 = x1 + a;
			int y2 = y1;		
			int x3 = x1;
			int y3 = y1 + c;
			
			Point2D tacka2 = new Point2D.Double(x2, y2);
			Point2D tacka3 = new Point2D.Double(x3, y3);
			
			g.draw(new Line2D.Double(tacka, tacka2));
			g.draw(new Line2D.Double(tacka2, tacka3));
			g.draw(new Line2D.Double(tacka3, tacka));
			
			g.fillPolygon(new int[] { x1, x2, x3 }, new int[] { y1, y2, y3 }, 3);
						
		} else if (raspored instanceof StraneSvetaRaspored) {
			
			StraneSvetaPozicija pozicija = (StraneSvetaPozicija) trougao.getPozicija();
			
			StraneSveta stranaSveta = pozicija.getStranaSveta();

			StraneSvetaRaspored straneSveta = (StraneSvetaRaspored) raspored;	
			
			List<Point2D> tacke = straneSveta.getTackeTrougao(stranaSveta, trougao);
			
			Point2D tacka = tacke.get(0);
			Point2D tacka2 = tacke.get(1);
			Point2D tacka3 = tacke.get(2);
			
			g.draw(new Line2D.Double(tacka, tacka2));
			g.draw(new Line2D.Double(tacka2, tacka3));
			g.draw(new Line2D.Double(tacka3, tacka));
			
			int x1 = (int) tacka.getX();
			int x2 = (int) tacka2.getX();
			int x3 = (int) tacka3.getX();
			
			int y1 = (int) tacka.getY();
			int y2 = (int) tacka2.getY();
			int y3 = (int) tacka3.getY();
			
			g.fillPolygon(new int[] { x1, x2, x3 }, new int[] { y1, y2, y3 }, 3);
		}
		
	}

	@Override
	public boolean isElementAt(Point2D pos) {
		return false;
	}

}
