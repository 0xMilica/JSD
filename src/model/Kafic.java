package model;

import java.util.List;

/**
 * Klasa predstavlja model kafica. Kafic je opisan nazivom i nivoima koje poseduje.
 *
 */
public class Kafic {
	
	private String naziv;
	private List<Canvas> listaNivoa;
	
	public Kafic(String naziv, List<Canvas> listaNivoa) {
		super();
		this.naziv = naziv;
		this.listaNivoa = listaNivoa;
	}
	
	public String getNaziv() {
		return naziv;
	}
	
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	
	public List<Canvas> getListaNivoa() {
		return listaNivoa;
	}
	
	public void setListaNivoa(List<Canvas> listaNivoa) {
		this.listaNivoa = listaNivoa;
	}
	
}
