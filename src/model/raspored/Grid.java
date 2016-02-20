package model.raspored;

import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;

/**
 * Klasa koja opisuje grid raspored. Grid je opisan brojem kolona i redova.
 * 
 */
public class Grid {

	private int brojKolona;
	private int brojRedova;

	public Grid(int brojRedova, int brojKolona) {
		this.brojRedova = brojRedova;
		this.brojKolona = brojKolona;
	}

	private int getSirinaCelije(int sirinaNivoa) {
		return sirinaNivoa / brojKolona;
	}

	private int getVisinaCelije(int visinaNivoa) {
		return visinaNivoa / brojRedova;
	}

	private List<Point2D> izracunajTacke(int sirinaNivoa, int visinaNivoa) {
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

}
