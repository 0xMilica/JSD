package model;

import java.util.List;

/**
 * Klasa predstavlja model elementa. Element je opisan nazivom i listom oblika.
 *
 */
public class Element {
	
	private String naziv;
	private List<Oblik> komponente;
	private Canvas nivo;
	
	public Element(String naziv, List<Oblik> oblici, Canvas nivo){		
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

	public Canvas getNivo() {
		return nivo;
	}

	public void setNivo(Canvas nivo) {
		this.nivo = nivo;
	}

}
