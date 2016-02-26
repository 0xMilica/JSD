package model.raspored;

import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Canvas;

public class GridRaspored extends Raspored {

	private int brojKolona;
	private int brojRedova;

	public GridRaspored(int brojKolona, int brojRedova) {
		super();
		this.brojKolona = brojKolona;
		this.brojRedova = brojRedova;
		
		setBrojKolona(brojKolona);
		setBrojRedova(brojRedova);
	}

	public GridRaspored(int brojRedova, int brojKolona, Canvas nivo) {
		super(nivo);
		this.brojRedova = brojRedova;
		this.brojKolona = brojKolona;
		
		setBrojKolona(brojKolona);
		setBrojRedova(brojRedova);
	}

	private int getSirinaCelije(int sirinaNivoa) {
		return sirinaNivoa / brojKolona;
	}

	private int getVisinaCelije(int visinaNivoa) {
		return visinaNivoa / brojRedova;
	}

	public List<Point2D> izracunajTacke(int sirinaNivoa, int visinaNivoa) {
		List<Point2D> listaTacaka = new ArrayList<Point2D>();
		Point2D tacka = null;

		for (int i = 0; i < brojKolona; i++) {
			for (int j = 0; j < brojRedova; j++) {
				tacka = new Point2D.Double(
						5 + i * getSirinaCelije(sirinaNivoa), 
						5 + j * getVisinaCelije(visinaNivoa));
				listaTacaka.add(tacka);
			}
		}

		for (Point2D i : listaTacaka) {
			System.out.println(i);
		}

		return listaTacaka;
	}

	public Point2D izracunajTackuZaCeliju(int brojKolone, int brojReda) {
		int visinaNivoa = getNivo().getVisina();
		int sirinaNivoa = getNivo().getSirina();
		
		Point2D tacka = null;

		for (int i = 0; i < brojKolona; i++) {
			for (int j = 0; j < brojRedova; j++) {
				if (i == brojKolone && j == brojReda) { 
					tacka = new Point2D.Double(
						0 + i * getSirinaCelije(sirinaNivoa), 
						0 + j * getVisinaCelije(visinaNivoa));
				}
			}
		}
		//System.out.println(tacka);
		return tacka;
	}
	
	public int getBrojKolona() {
		return brojKolona;
	}

	public void setBrojKolona(int brojKolona) {
		if (brojKolona < 1) {
			brojKolona = 1;
		}
		this.brojKolona = brojKolona;
	}

	public int getBrojRedova() {
		return brojRedova;
	}

	public void setBrojRedova(int brojRedova) {
		if (brojRedova < 1) {
			brojRedova = 1;
		}
		this.brojRedova = brojRedova;
	}

	@Override
	public String toString() {
		return "GridRaspored ["+ brojKolona + ","+ brojRedova + "]";
	}
	
	
}
