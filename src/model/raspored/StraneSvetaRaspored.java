package model.raspored;

import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;

import model.elements.Elipsa;
import model.elements.Linija;
import model.elements.Pravougaonik;
import model.elements.Trougao;
import model.elements.ZaobljeniPravougaonik;
import model.Oblik;
import model.Canvas;
import model.Element;

public class StraneSvetaRaspored extends Raspored {

	public StraneSvetaRaspored() {
		super();
	}

	public StraneSvetaRaspored(Canvas nivo) {
		super(nivo);
	}

	public List<Point2D> getTackeLinija(StraneSveta stranaSveta, Oblik oblik) {
		
		int sirinaNivoa = getNivo().getSirina();
		int visinaNivoa = getNivo().getVisina();
		
		Linija linija = (Linija) oblik;
		List<Point2D> tackeLinije = new ArrayList<Point2D>();
		Point2D tacka1 = null;
		Point2D tacka2 = null;
		
		int duzina = linija.getDuzina();
		int x1 = 0;
		int y1 = 0;
		
		int x2 = 0;
		int y2 = 0;
		
		switch (stranaSveta) {
		case sever:
			x1 = sirinaNivoa / 2 - duzina / 2;
			x2 = sirinaNivoa / 2 + duzina / 2;
			break;
		case severozapad:
			x2 = duzina;
			break;
		case severoistok:
			x1 = sirinaNivoa - duzina;
			x2 = sirinaNivoa;
			break;
		case zapad:
			y1 = visinaNivoa / 2;
			x2 = duzina;
			y2 = visinaNivoa / 2;
			break;
		case centar:
			x1 = sirinaNivoa / 2 - duzina / 2;
			y1 = visinaNivoa / 2;
			x2 = sirinaNivoa / 2 + duzina / 2;
			y2 = visinaNivoa / 2;
			break;
		case istok:
			x1 = sirinaNivoa - duzina;
			y1 = visinaNivoa / 2;
			x2 = sirinaNivoa;
			y2 = visinaNivoa / 2;
			break;
		case jugozapad:
			y1 = visinaNivoa;
			x2 = duzina;
			y2 = visinaNivoa;
			break;
		case jug:
			x1 = sirinaNivoa / 2 - duzina / 2;
			y1 = visinaNivoa - 1 ;               // minus 1 dodato da bi se videla linija (ode ispod okvira)
			x2 = sirinaNivoa / 2 + duzina / 2;
			y2 = visinaNivoa - 1;				 // minus 1 dodato da bi se videla linija (ode ispod okvira)
			break;
		case jugoistok:
			x1 = sirinaNivoa - duzina;
			y1 = visinaNivoa - 1;
			x2 = sirinaNivoa;
			y2 = visinaNivoa - 1;
			break;
		default:
			break;	
		}
		
		tacka1 = new Point2D.Double(x1, y1);	
		tacka2 = new Point2D.Double(x2, y2);
		
		tackeLinije.add(tacka1);
		tackeLinije.add(tacka2);
		
		return tackeLinije;
	}
	
	public List<Point2D> getTackeTrougao(StraneSveta stranaSveta, Oblik oblik) {
		
		int sirinaNivoa = getNivo().getSirina();
		int visinaNivoa = getNivo().getVisina();
		
		Trougao trougao = (Trougao) oblik;
		List<Point2D> tackeTrougla = new ArrayList<Point2D>();
		
		Point2D tacka1 = null;
		Point2D tacka2 = null;
		Point2D tacka3 = null;
		
		int a = trougao.getA();
		int b = trougao.getB();
		int c = trougao.getC();
		
		int x1 = 0;
		int y1 = 0;		
		int x2 = 0;
		int y2 = 0;		
		int x3 = 0;
		int y3 = 0;
		
		switch (stranaSveta) {
		case sever:
			x1 = sirinaNivoa / 2 - a / 2;
			y1 = 0;
			x2 = sirinaNivoa / 2 + a / 2;
			y2 = 0;
			x3 = x1;
			y3 = y1 + c;
			break;
		case severozapad:
			x2 = x1 + a;	
			x3 = x1;
			y3 = y1 + c;
			break;
		case severoistok:
			x1 = sirinaNivoa - a;
			y1 = 0;
			x2 = x1 + a;
			y2 = 0;
			x3 = x1;
			y3 = y1 + c;
			break;
		case zapad:
			x1 = 0;
			y1 = visinaNivoa / 2 - c / 2;
			x2 = a;
			y2 = y1;
			x3 = x1;
			y3 = y1 + c;
			break;
		case centar:
			x1 = sirinaNivoa / 2 - a / 2;
			y1 = visinaNivoa / 2 - c / 2;
			x2 = x1 + a;
			y2 = y1;
			x3 = x1;
			y3 = y1 + c;
			break;
		case istok:
			x1 = visinaNivoa - a;
			y1 = visinaNivoa /2 - c / 2;
			x2 = x1 + a;
			y2 = y1;
			x3 = x1;
			y3 = y1 + c;
			break;
		case jugozapad:
			x1 = 0;
			y1 = visinaNivoa - c;
			x2 = x1 + a;
			y2 = y1;
			x3 = x1;
			y3 = y1 + c;
			break;
		case jug:
			x1 = sirinaNivoa / 2 - a / 2;
			y1 = visinaNivoa - c;
			x2 = x1 + a;
			y2 = y1;
			x3 = x1;
			y3 = y1 + c;
			break;
		case jugoistok:
			x1 = sirinaNivoa - a;
			y1 = visinaNivoa - c;
			x2 = x1 + a;
			y2 = y1;
			x3 = x1;
			y3 = y1 + c;
			break;
		default:
			break;	
		}
		
		tacka1 = new Point2D.Double(x1, y1);	
		tacka2 = new Point2D.Double(x2, y2);
		tacka3 = new Point2D.Double(x3, y3);
		
		tackeTrougla.add(tacka1);
		tackeTrougla.add(tacka2);
		tackeTrougla.add(tacka3);
		
		return tackeTrougla;
	}

	public Point2D getTackaZaobljeniPravougaonik(StraneSveta stranaSveta, Oblik oblik) {
		int sirinaNivoa = getNivo().getSirina();
		int visinaNivoa = getNivo().getVisina();
		
		ZaobljeniPravougaonik p = (ZaobljeniPravougaonik) oblik;

		Point2D tacka = null;
		
		int sirina = p.getA();
		int visina = p.getB();
		int x = 0;
		int y = 0;
		
		switch (stranaSveta) {
		case sever:
			x = sirinaNivoa / 2 - sirina / 2;
			break;
		case severozapad:
			break;
		case severoistok:
			x = sirinaNivoa - sirina;
			break;
		case zapad:
			y = visinaNivoa / 2 - visina / 2;
			break;
		case centar:
			x = sirinaNivoa / 2 - sirina / 2;
			y = visinaNivoa / 2 - visina / 2;
			break;
		case istok:
			x = sirinaNivoa - sirina;
			y = visinaNivoa / 2 - visina / 2;
			break;
		case jugozapad:
			y = visinaNivoa - visina;
			break;
		case jug:
			x = sirinaNivoa / 2  - sirina / 2;
			y = visinaNivoa - visina;
			break;
		case jugoistok:
			x = sirinaNivoa - sirina;
			y = visinaNivoa - visina;
			break;
		default:
			break;	
		}
		
		tacka = new Point2D.Double(x, y);
		
		return tacka;
	}
	
	public Point2D getTackaElipsa(StraneSveta stranaSveta, Oblik oblik) {
		int sirinaNivoa = getNivo().getSirina();
		int visinaNivoa = getNivo().getVisina();
		
		Elipsa elipsa = (Elipsa) oblik;

		Point2D tacka = null;
		
		int sirina = elipsa.getPrecnik1();
		int visina = elipsa.getPrecnik2();
		int x = 0;
		int y = 0;
		
		switch (stranaSveta) {
		case sever:
			if (sirina == visina) {
				x = sirinaNivoa / 2 - sirina / 2 + (sirina - visina) / 2;
			} else {
				x = sirinaNivoa / 2 - sirina / 2;
			}			
			break;
		case severozapad:
			break;
		case severoistok:
			x = sirinaNivoa - sirina;
			break;
		case zapad:
			y = visinaNivoa / 2 - visina / 2;
			break;
		case centar:
			x = sirinaNivoa / 2 - sirina / 2;
			y = visinaNivoa / 2 - visina / 2;
			break;
		case istok:
			x = sirinaNivoa - sirina;
			y = visinaNivoa / 2 - visina / 2;
			break;
		case jugozapad:
			y = visinaNivoa - visina;
			break;
		case jug:
			x = sirinaNivoa / 2  - sirina / 2;
			y = visinaNivoa - visina;
			break;
		case jugoistok:
			x = sirinaNivoa - sirina;
			y = visinaNivoa - visina;
			break;
		default:
			break;	
		}
		
		tacka = new Point2D.Double(x, y);
		
		return tacka;
	}
	
	public Point2D getTackaPravougaonik(StraneSveta stranaSveta, Oblik oblik) {
		int sirinaNivoa = getNivo().getSirina();
		int visinaNivoa = getNivo().getVisina();
		
		Pravougaonik pravougaonik = (Pravougaonik) oblik;

		Point2D tacka = null;
		
		int sirina = pravougaonik.getA();
		int visina = pravougaonik.getB();
		int x = 0;
		int y = 0;
		
		switch (stranaSveta) {
		case sever:
			x = sirinaNivoa / 2 - sirina / 2;
			break;
		case severozapad:
			break;
		case severoistok:
			x = sirinaNivoa - sirina;
			break;
		case zapad:
			y = visinaNivoa / 2 - visina / 2;
			break;
		case centar:
			x = sirinaNivoa / 2 - sirina / 2;
			y = visinaNivoa / 2 - visina / 2;
			break;
		case istok:
			x = sirinaNivoa - sirina;
			y = visinaNivoa / 2 - visina / 2;
			break;
		case jugozapad:
			y = visinaNivoa - visina;
			break;
		case jug:
			x = sirinaNivoa / 2  - sirina / 2;
			y = visinaNivoa - visina;
			break;
		case jugoistok:
			x = sirinaNivoa - sirina;
			y = visinaNivoa - visina;
			break;
		default:
			break;	
		}
		
		tacka = new Point2D.Double(x, y);
		
		return tacka;
	}

	@Override
	public String toString() {
		return "StraneSvetaRaspored";
	}
	
}
