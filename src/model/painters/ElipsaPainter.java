package model.painters;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;

import model.Oblik;
import model.OblikPainter;
import model.elements.Elipsa;

public class ElipsaPainter extends OblikPainter {

	private boolean isColorSet;

	public ElipsaPainter(Oblik oblik) {
		super(oblik);
	}

	@Override
	public void paint(Graphics2D g) {

		Elipsa elipsa = (Elipsa) oblik;

		if (elipsa.color == null) {
			g.setColor(Color.BLACK);
		} else {
			g.setColor(elipsa.getColor());
		}

		if (elipsa.stroke != null) {
			g.setStroke(elipsa.getStroke());
		}

		Ellipse2D ellipse = new Ellipse2D.Double(
				elipsa.getGornjiLeviUgao().getX(), 
				elipsa.getGornjiLeviUgao().getY(), 
				elipsa.getSirina(),
				elipsa.getVisina());
		
		g.draw(ellipse);
		g.fill(ellipse);

	}

	@Override
	public boolean isElementAt(Point2D pos) {
		return false;
	}

}
