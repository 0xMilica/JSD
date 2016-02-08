package model.elements;

import java.awt.Color;
import java.awt.Stroke;
import java.awt.geom.Point2D;

import model.Oblik;
import model.painters.ZaobljeniPravougaonikPainter;

public class ZaobljeniPravougaonik extends Oblik {

	private Point2D lokacija;
	private double sirinaPravougaonika;
	private double visinaPravougaonika;
	private double sirinaLuka;
	private double visinaLuka;
	
	public ZaobljeniPravougaonik(Color color, Stroke stroke, double ugao,
			Point2D lokacija, double sirinaPravougaonika,
			double visinaPravougaonika, double sirinaLuka, double visinaLuka) {
		super(color, stroke, ugao);
		this.lokacija = lokacija;
		this.sirinaPravougaonika = sirinaPravougaonika;
		this.visinaPravougaonika = visinaPravougaonika;
		this.sirinaLuka = sirinaLuka;
		this.visinaLuka = visinaLuka;
		this.oblikPainter = new ZaobljeniPravougaonikPainter(this);
	}
	
	public Point2D getLokacija() {
		return lokacija;
	}
	
	public void setLokacija(Point2D lokacija) {
		this.lokacija = lokacija;
	}
	
	public double getSirinaPravougaonika() {
		return sirinaPravougaonika;
	}
	
	public void setSirinaPravougaonika(double sirinaPravougaonika) {
		this.sirinaPravougaonika = sirinaPravougaonika;
	}
	
	public double getVisinaPravougaonika() {
		return visinaPravougaonika;
	}
	
	public void setVisinaPravougaonika(double visinaPravougaonika) {
		this.visinaPravougaonika = visinaPravougaonika;
	}
	
	public double getSirinaLuka() {
		return sirinaLuka;
	}
	
	public void setSirinaLuka(double sirinaLuka) {
		this.sirinaLuka = sirinaLuka;
	}
	
	public double getVisinaLuka() {
		return visinaLuka;
	}
	
	public void setVisinaLuka(double visinaLuka) {
		this.visinaLuka = visinaLuka;
	}
	
}
