package model.painters;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

import model.Oblik;
import model.OblikPainter;
import model.elements.Linija;

public class LinijaPainter extends OblikPainter {

	public LinijaPainter(Oblik oblik) {
		super(oblik);
	}

	@Override
	public void paint(Graphics2D g) {

		Linija linija = (Linija) oblik;
		
		if (linija.color == null) {
			g.setPaint(Color.red);
		} else {
			g.setPaint(linija.getColor());
		}
		// g.setStroke(linija.getStroke());

		g.draw(new Line2D.Double(linija.getPocetnaTacka(), linija .getKrajnjaTacka()));

	}

	@Override
	public boolean isElementAt(Point2D pos) {
		// TODO Auto-generated method stub
		return false;
	}
}
