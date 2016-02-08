package model.elements;

import java.awt.Color;
import java.awt.Paint;
import java.awt.Stroke;
import java.awt.geom.Point2D;

import model.Oblik;
import model.painters.PravougaonikPainter;
/**
 * Pravougaonik je modelovan pomocu gornje leve i donje desne tacke
 */
public class Pravougaonik extends Oblik {

	private Point2D pocetnaTacka;
	private Point2D krajnjaTacka;
	
	public Pravougaonik(Color color, Stroke stroke, double ugao, Point2D pocetnaTacka, Point2D krajnjaTacka) {
		super(color, stroke, ugao);
		this.pocetnaTacka = pocetnaTacka;
		this.krajnjaTacka = krajnjaTacka;
		oblikPainter = new PravougaonikPainter(this);
	}

	public Point2D getPocetnaTacka(){
		return pocetnaTacka;
	}
	
	public Point2D getKrajnjaTacka(){
		return krajnjaTacka;
	}
	
}
