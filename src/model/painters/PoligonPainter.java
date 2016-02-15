package model.painters;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.geom.Point2D;

import model.Oblik;
import model.OblikPainter;
import model.elements.Poligon;

public class PoligonPainter extends OblikPainter {

	public PoligonPainter(Oblik oblik) {
		super(oblik);
	}

	@Override
	public void paint(Graphics2D g) {
		Poligon poligon = (Poligon) oblik;

		if(poligon.color == null) {
			g.setColor(Color.RED);
		} else {
			g.setColor(poligon.getColor());
		}
		
		g.rotate(Math.toRadians(poligon.getUgao()));
		
		if(getShape() == null) {
			Polygon polygon = new Polygon(
					poligon.getxTacke(),  
					poligon.getyTacke(), 
					poligon.getBrojIvica());
			g.draw(polygon);
			g.fill(polygon);
		} else {
			g.draw(getShape());
			g.draw(getShape());
		}
		
	}

	@Override
	public boolean isElementAt(Point2D pos) {
		return false;
	}

}
