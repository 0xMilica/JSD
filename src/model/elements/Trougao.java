package model.elements;

import java.awt.Color;
import java.awt.Paint;
import java.awt.Stroke;
import java.awt.geom.Point2D;

import model.Oblik;
import model.painters.TrougaoPainter;

public class Trougao extends Oblik{

	private Point2D a;
	private Point2D b;
	private Point2D c;
	
	public Trougao(Color color, Stroke stroke, double ugao, Point2D a, Point2D b, Point2D c) {
		super(color, stroke, ugao);
		this.a = a;
		this.b = b;
		this.c = c;
		
		oblikPainter = new TrougaoPainter(this);
	}

	public Point2D getA(){
		return a;
	}
	
	public Point2D getB(){
		return b;
	}
	
	public Point2D getC(){
		return c;
	}
}
