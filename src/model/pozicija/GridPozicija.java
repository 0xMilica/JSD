package model.pozicija;

import model.raspored.Raspored;

public class GridPozicija extends Pozicija {
	
	private int brojReda;
	private int brojKolone;
	
	public GridPozicija(int brojReda, int brojKolone, Raspored raspored) {
		super(raspored);
		this.brojReda = brojReda;
		this.brojKolone = brojKolone;
	}

	public int getBrojReda() {
		return brojReda;
	}

	public void setBrojReda(int brojReda) {
		this.brojReda = brojReda;
	}

	public int getBrojKolone() {
		return brojKolone;
	}

	public void setBrojKolone(int brojKolone) {
		this.brojKolone = brojKolone;
	}

}
