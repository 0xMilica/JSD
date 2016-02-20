package model.elements;

import java.awt.Color;
import java.awt.Stroke;
import java.awt.geom.Point2D;

import model.Oblik;
import model.Pozicija;
import model.painters.ElipsaPainter;

public class Elipsa extends Oblik {

	private Point2D gornjiLeviUgao;
	private double visina;
	private double sirina;
	
	public Elipsa(Color color, Stroke stroke, double ugao, Pozicija pozicija, 
			Point2D gornjiLeviUgao, double visina, double sirina ) {
		super(color, stroke, ugao, pozicija);
		this.gornjiLeviUgao = gornjiLeviUgao;
		this.visina = visina;
		this.sirina = sirina;
		oblikPainter = new ElipsaPainter(this);
	}

	public Point2D getGornjiLeviUgao(){
		return gornjiLeviUgao;
	}

	public double getVisina(){
		return visina;
	}
	
	public double getSirina(){
		return sirina;
	}
}
