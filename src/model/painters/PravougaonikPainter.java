package model.painters;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

import model.Oblik;
import model.OblikPainter;
import model.elements.Pravougaonik;

public class PravougaonikPainter extends OblikPainter{

	public PravougaonikPainter(Oblik oblik) {
		super(oblik);
	}

	@Override
	public void paint(Graphics2D g) {
		
		Pravougaonik pravougaonik = (Pravougaonik) oblik;
		if(pravougaonik.paint == null){
			g.setPaint(Color.BLACK);
		}
		else{
			g.setPaint(pravougaonik.getPaint());
		}
		//g.setStroke(linija.getStroke());
		
		if(getShape() == null){
			
			int ax = (int) pravougaonik.getPocetnaTacka().getX();
			int ay = (int) pravougaonik.getPocetnaTacka().getY();
			
			int bx = (int) pravougaonik.getKrajnjaTacka().getX();
			int by = (int) pravougaonik.getPocetnaTacka().getY();
			
			int cx = (int) pravougaonik.getPocetnaTacka().getX();
			int cy = (int) pravougaonik.getKrajnjaTacka().getY();
			
			int dx = (int) pravougaonik.getKrajnjaTacka().getX();
			int dy = (int) pravougaonik.getKrajnjaTacka().getY();
			
			g.draw(new Line2D.Double(new Point2D.Double(ax, ay), new Point2D.Double(cx, cy)));
			g.draw(new Line2D.Double(new Point2D.Double(cx, cy), new Point2D.Double(dx, dy)));
			g.draw(new Line2D.Double(new Point2D.Double(dx, dy), new Point2D.Double(bx, by)));
			g.draw(new Line2D.Double(new Point2D.Double(bx, by), new Point2D.Double(ax, ay)));
			
			g.fillPolygon(new int[]{ax, bx, dx, cx}, new int[]{ay, by, dy, cy}, 4);
		}
		else {
			g.draw(getShape());
		}
	}

	@Override
	public boolean isElementAt(Point2D pos) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Shape getShape() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setShape(Shape shape) {
		// TODO Auto-generated method stub
		
	}

}
