package model.elements;

import java.awt.Color;
import java.awt.Stroke;

import model.Oblik;
import model.Pozicija;
import model.painters.PoligonPainter;

public class Poligon extends Oblik {
	
	private int[] xTacke;
	private int[] yTacke;
	private int brojIvica;
	
	public Poligon(Color color, Stroke stroke, double ugao, Pozicija pozicija,
			int[] xTacke, int[] yTacke, int brojIvica) {
		super(color, stroke, ugao, pozicija);
		this.xTacke = xTacke;
		this.yTacke = yTacke;
		this.brojIvica = brojIvica;
		this.oblikPainter = new PoligonPainter(this);
	}
	
	public int[] getxTacke() {
		return xTacke;
	}
	
	public void setxTacke(int[] xTacke) {
		this.xTacke = xTacke;
	}
	
	public int[] getyTacke() {
		return yTacke;
	}
	
	public void setyTacke(int[] yTacke) {
		this.yTacke = yTacke;
	}
	
	public int getBrojIvica() {
		return brojIvica;
	}
	
	public void setBrojIvica(int brojIvica) {
		this.brojIvica = brojIvica;
	}

}
