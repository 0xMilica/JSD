package model;

public class Pozicija {

	private int brojReda;
	private int brojKolone;
	
	public Pozicija(int brojReda, int brojKolone) {
		super();
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
