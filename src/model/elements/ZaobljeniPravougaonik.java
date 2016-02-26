package model.elements;

import java.awt.Color;

import model.Oblik;
import model.painters.ZaobljeniPravougaonikPainter;
import model.pozicija.Pozicija;
import model.Oblik;
import model.OblikPainter;
import model.Element;



/**
 * Klasa predstavlja model zaobljenog pravougaonika. Odredjen je stranicama a i b, i lukovima koji predstavljaju ivice.
 *
 */
public class ZaobljeniPravougaonik extends Oblik {
	
	private int a;
	private int b;
	private int visinaLuka;
	private int sirinaLuka;
	
	public ZaobljeniPravougaonik(Pozicija pozicija, Element element, Color color, double ugao, int a, int b,
			int visinaLuka, int sirinaLuka) {
		super(pozicija, element, color, ugao);
		this.a = a;
		this.b = b;
		this.visinaLuka = visinaLuka;
		this.sirinaLuka = sirinaLuka;
		this.oblikPainter = new ZaobljeniPravougaonikPainter(this);
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

	public int getVisinaLuka() {
		return visinaLuka;
	}

	public void setVisinaLuka(int visinaLuka) {
		this.visinaLuka = visinaLuka;
	}

	public int getSirinaLuka() {
		return sirinaLuka;
	}

	public void setSirinaLuka(int sirinaLuka) {
		this.sirinaLuka = sirinaLuka;
	}

}
