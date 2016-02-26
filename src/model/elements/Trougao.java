package model.elements;

import java.awt.Color;

import model.painters.TrougaoPainter;
import model.pozicija.Pozicija;
import model.Oblik;
import model.Element;


/**
 * Klasa predstavlja model trougla. Trougao je opisan duzinom stranica a, b i c.
 *
 */
public class Trougao extends Oblik {

	private int a;
	private int b;
	private int c;
	
	public Trougao(Pozicija pozicija, Element element, Color color, double ugao, int a, int b,
			int c) {
		super(pozicija, element, color, ugao);
		this.a = a;
		this.b = b;
		this.c = c;
		this.oblikPainter = new TrougaoPainter(this);
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}
	
}
