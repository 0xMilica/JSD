package model.elements;

import java.awt.Color;

import model.Oblik;
import model.painters.PravougaonikPainter;
import model.pozicija.Pozicija;
import model.Oblik;
import model.Element;



/**
 * Klasa predstavlja model pravougaonika. Pravougaonik je opisan duzinom stranica a i b.
 *
 */
public class Pravougaonik extends Oblik {
	
	private int a;
	private int b;
	
	public Pravougaonik(Pozicija pozicija, Element element, Color color, double ugao, int a, int b) {
		super(pozicija, element, color, ugao);
		this.a = a;
		this.b = b;
		this.oblikPainter = new PravougaonikPainter(this);
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

}
