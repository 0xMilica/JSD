package model.elements;

import java.awt.Color;

import model.Element;
import model.Oblik;
import model.painters.ElipsaPainter;
import model.pozicija.Pozicija;

/**
 * Klasa predstavlja model elipse. Elipsa je opisana precnicima, ako su jednaki radi se o krugu.
 *
 */
public class Elipsa extends Oblik {

	private int precnik1;
	private int precnik2;
	
	public Elipsa(Pozicija pozicija, Element element, Color color, double ugao, int precnik1,
			int precnik2) {
		super(pozicija, element, color, ugao);
		this.precnik1 = precnik1;
		this.precnik2 = precnik2;
		this.oblikPainter = new ElipsaPainter(this);
	}

	public int getPrecnik1() {
		return precnik1;
	}

	public void setPrecnik1(int precnik1) {
		this.precnik1 = precnik1;
	}

	public int getPrecnik2() {
		return precnik2;
	}

	public void setPrecnik2(int precnik2) {
		this.precnik2 = precnik2;
	}
	
}
