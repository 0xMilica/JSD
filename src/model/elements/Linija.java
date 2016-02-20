package model.elements;

import java.awt.Color;
import java.awt.Paint;
import java.awt.Stroke;
import java.awt.geom.Point2D;

import model.Oblik;
import model.Pozicija;
import model.painters.LinijaPainter;

public class Linija extends Oblik {

	private Point2D pocetnaTacka;
	private Point2D krajnjaTacka;

	
	public Linija(Color color, Stroke stroke, double ugao, Pozicija pozicija, 
			Point2D pocetnaTacka, Point2D krajnjaTacka) {
		super(color, stroke, ugao, pozicija);
		this.pocetnaTacka = pocetnaTacka;
		this.krajnjaTacka = krajnjaTacka;
		oblikPainter = new LinijaPainter(this);
	}


	public Point2D getPocetnaTacka() {
		return pocetnaTacka;
	}


	public void setPocetnaTacka(Point2D pocetnaTacka) {
		this.pocetnaTacka = pocetnaTacka;
	}


	public Point2D getKrajnjaTacka() {
		return krajnjaTacka;
	}


	public void setKrajnjaTacka(Point2D krajnjaTacka) {
		this.krajnjaTacka = krajnjaTacka;
	}
	
	
}
