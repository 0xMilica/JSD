package model;

import java.awt.Color;

import model.pozicija.Pozicija;


public abstract class Oblik {

	public Color color;
	public double ugao;
	public Pozicija pozicija;
	public OblikPainter oblikPainter;
	public Element element;
	
	public Oblik(Pozicija pozicija, Element element, Color color, double ugao) {
		super();
		this.color = color;
		this.ugao = ugao;
		this.pozicija = pozicija;
		this.element = element;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public double getUgao() {
		return ugao;
	}

	public void setUgao(double ugao) {
		this.ugao = ugao;
	}

	public Pozicija getPozicija() {
		return pozicija;
	}

	public void setPozicija(Pozicija pozicija) {
		this.pozicija = pozicija;
	}

	public OblikPainter getOblikPainter() {
		return oblikPainter;
	}

	public void setOblikPainter(OblikPainter oblikPainter) {
		this.oblikPainter = oblikPainter;
	}

	public Element getElement() {
		return element;
	}

	public void setElement(Element element) {
		this.element = element;
	}
	
}
