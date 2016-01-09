package model.painters;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;

import model.Oblik;
import model.OblikPainter;
import model.elements.Elipsa;

public class ElipsaPainter extends OblikPainter{

	private boolean isColorSet;
	
	public ElipsaPainter(Oblik oblik) {
		super(oblik);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void paint(Graphics2D g) {
		// TODO Auto-generated method stub
		
		Elipsa elipsa = (Elipsa) oblik;
		
		if(elipsa.paint == null){
			g.setPaint(Color.BLACK);
		}
		else{
			g.setPaint(elipsa.getPaint());
		}
		//g.setStroke(linija.getStroke());
		if(getShape() == null){
			
			g.draw(new Ellipse2D.Double(elipsa.getGornjiLeviUgao().getX(), elipsa.getGornjiLeviUgao().getY(), elipsa.getSirina(), elipsa.getVisina()));
		
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

	
}
