package model.raspored;

import java.awt.GridLayout;

public class Grid extends GridLayout {

	private static final long serialVersionUID = 9187283898060376091L;
	
	private int brojKolona;
	private int brojRedova;
	private int razmakV;
	private int razmakH;
	
	public Grid(int brojRedova, int brojKolona) {
		super(brojRedova, brojKolona);
		this.brojRedova = brojRedova;
		this.brojKolona = brojKolona;
	}

	public Grid(int brojRedova, int brojKolona, int razmakH, int razmakV) {
		super(brojRedova, brojKolona, razmakH, razmakV);
		this.brojRedova = brojRedova;
		this.brojKolona = brojKolona;
		this.razmakH = razmakH;
		this.razmakV = razmakV;
	}
	
	public int getBrojKolona() {
		return brojKolona;
	}

	public void setBrojKolona(int brojKolona) {
		this.brojKolona = brojKolona;
	}

	public int getBrojRedova() {
		return brojRedova;
	}

	public void setBrojRedova(int brojRedova) {
		this.brojRedova = brojRedova;
	}

	public int getRazmakV() {
		return razmakV;
	}

	public void setRazmakV(int razmakV) {
		this.razmakV = razmakV;
	}

	public int getRazmakH() {
		return razmakH;
	}

	public void setRazmakH(int razmakH) {
		this.razmakH = razmakH;
	}
	
}
