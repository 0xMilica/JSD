package model;

import java.util.ArrayList;

public class Element {
	
	private Pozicija pozicija;
	private ArrayList<Oblik> komponente;
	
	public Element(Pozicija pozicija, ArrayList<Oblik> komponente){		
		this.pozicija = pozicija;
		this.komponente = komponente;
	}
	
	public Pozicija getPozicija() {
		return pozicija;
	}

	public void setPozicija(Pozicija pozicija) {
		this.pozicija = pozicija;
	}

	public ArrayList<Oblik> getKomponente() {
		return komponente;
	}

	public void setKomponente(ArrayList<Oblik> komponente) {
		this.komponente = komponente;
	}
	
}
