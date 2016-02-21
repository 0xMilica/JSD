package model.elements;

import java.awt.Color;
import java.awt.Stroke;
import java.awt.geom.Point2D;

import model.Oblik;
import model.Pozicija;
import model.painters.PravougaonikPainter;
/**
 * Pravougaonik je modelovan pomocu gornje leve i donje desne tacke
 */
public class Pravougaonik extends Oblik {

	private Point2D pocetnaTacka;
	private Point2D krajnjaTacka;
	
	public Pravougaonik(Color color, Stroke stroke, double ugao, Pozicija pozicija, 
			Point2D pocetnaTacka, Point2D krajnjaTacka) {
		super(color, stroke, ugao, pozicija);
		this.pocetnaTacka = pocetnaTacka;
		this.krajnjaTacka = krajnjaTacka;
		oblikPainter = new PravougaonikPainter(this);
	}

	public Point2D getPocetnaTacka(){
		return pocetnaTacka;
	}
	
	public void setPocetnaTacka(Point2D pocetnaTacka) {
		this.pocetnaTacka = pocetnaTacka;
	}

	public Point2D getKrajnjaTacka(){
		return krajnjaTacka;
	}

	public void setKrajnjaTacka(Point2D krajnjaTacka) {
		this.krajnjaTacka = krajnjaTacka;
	}
	
	public double getSirina() {
		double minX = Double.MAX_VALUE;
		double maxX = -Double.MAX_VALUE;

		double[] tacke = new double[2];
		tacke[0] = pocetnaTacka.getX();
		tacke[1] = krajnjaTacka.getX();
		
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
		
		double[] tacke = new double[2];
		tacke[0] = pocetnaTacka.getY();
		tacke[1] = krajnjaTacka.getY();

		for(int i = 0; i < tacke.length; i++) {
		    double y = tacke[i];
		    minY = Math.min(minY, y);
		    maxY = Math.max(maxY, y);    
		}
		
		double visina = maxY - minY;
		
		return visina;
	}
	
	

}
