package model;

import java.util.List;

public class Element {
	
	private String naziv;
	private List<Oblik> komponente;
	
	public Element(String naziv, List<Oblik> oblici){		
		this.komponente = oblici;
	}
	
	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public List<Oblik> getKomponente() {
		return komponente;
	}

	public void setKomponente(List<Oblik> komponente) {
		this.komponente = komponente;
	}
	
}
