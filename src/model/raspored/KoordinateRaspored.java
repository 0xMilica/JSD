package model.raspored;

import java.awt.geom.Point2D;

import model.Canvas;


/**
 * Klasa opisuje jednostavan raspored, koji na osnovu prosledjenih x i y tacaka kreira koordinatu za iscrtavanje.
 *
 */
public class KoordinateRaspored extends Raspored {

	public KoordinateRaspored() {
		super();
	}

	public KoordinateRaspored(Canvas nivo) {
		super(nivo);
	}

	public Point2D getTacka(int x, int y) {
		Point2D tacka = null;		
		tacka = new Point2D.Double(x, y);
		System.out.println(tacka);
		return tacka;	
	}

	@Override
	public String toString() {
		return "KoordinateRaspored";
	}
}
