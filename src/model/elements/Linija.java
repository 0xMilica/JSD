package model.elements;

import java.awt.Color;

import model.Element;
import model.Oblik;
import model.painters.LinijaPainter;
import model.pozicija.Pozicija;


/**
 * Klasa predstavlja model linije. Linija je opisana duzinom linije.
 *
 */
public class Linija extends Oblik {

	private int duzina;

	public Linija(Pozicija pozicija, Element element, Color color, double ugao, int duzina) {
		super(pozicija, element,color, ugao);
		this.duzina = duzina;
		this.oblikPainter = new LinijaPainter(this);
	}

	public int getDuzina() {
		return duzina;
	}

	public void setDuzina(int duzina) {
		this.duzina = duzina;
	}

}
