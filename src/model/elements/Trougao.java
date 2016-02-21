package model.elements;

import java.awt.Color;
import java.awt.Stroke;
import java.awt.geom.Point2D;

import model.Oblik;
import model.Pozicija;
import model.painters.TrougaoPainter;

public class Trougao extends Oblik{

	private Point2D a;
	private Point2D b;
	private Point2D c;
	
	public Trougao(Color color, Stroke stroke, double ugao, Pozicija pozicija, 
			Point2D a, Point2D b, Point2D c) {
		super(color, stroke, ugao, pozicija);
		this.a = a;
		this.b = b;
		this.c = c;
		
		oblikPainter = new TrougaoPainter(this);
	}

	public Point2D getA(){
		return a;
	}
	
	public void setA(Point2D a) {
		this.a = a;
	}

	public Point2D getB(){
		return b;
	}

	public void setB(Point2D b) {
		this.b = b;
	}

	public Point2D getC(){
		return c;
	}

	public void setC(Point2D c) {
		this.c = c;
	}
	
	public double getSirina() {
		double minX = Double.MAX_VALUE;
		double maxX = -Double.MAX_VALUE;

		double[] tacke = new double[3];
		tacke[0] = a.getX();
		tacke[1] = b.getX();
		tacke[2] = c.getX();
		
		for(int i = 0; i < tacke.length; i++) {
		    double x = tacke[i];
		    minX = Math.min(minX, x);
		    maxX = Math.max(maxX, x); 
		}

		double sirina = maxX - minX;
		
		return sirina;
	}
	
	public double getVisina() {
		double minY = Double.MAX_VALUE;
		double maxY = -Double.MAX_VALUE;
		
		double[] tacke = new double[3];
		tacke[0] = a.getY();
		tacke[1] = b.getY();
		tacke[2] = c.getY();
		
		for(int i = 0; i < tacke.length; i++) {
		    double y = tacke[i];
		    minY = Math.min(minY, y);
		    maxY = Math.max(maxY, y);
		}
		
		double visina = maxY - minY;
		
		return visina;
	}
}
