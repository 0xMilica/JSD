package model.pozicija;

import model.raspored.Raspored;

public abstract class Pozicija {
	
	private Raspored raspored;

	public Pozicija(Raspored raspored) {
		super();
		this.raspored = raspored;
	}

	public Raspored getRaspored() {
		return raspored;
	}

	public void setRaspored(Raspored raspored) {
		this.raspored = raspored;
	}

}
