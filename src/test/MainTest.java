package test;

import java.awt.Color;
import java.util.ArrayList;

import model.elements.Elipsa;
import model.elements.Linija;
import model.elements.Pravougaonik;
import model.elements.Trougao;
import model.elements.ZaobljeniPravougaonik;
import model.raspored.Raspored;
import model.raspored.StraneSveta;
import model.Canvas;
import model.Oblik;
import model.Element;
import model.pozicija.GridPozicija;
import model.pozicija.KoordinatePozicija;
import model.pozicija.Pozicija;
import model.pozicija.StraneSvetaPozicija;
import view.MainFrame;

public class MainTest {

	public static void main(String[] args) {

		MainFrame mejnfrejm = new MainFrame();
		mejnfrejm.setVisible(true);

		// linije
		ArrayList<Oblik> oblikLinija1 = new ArrayList<Oblik>();
		ArrayList<Oblik> oblikLinija2 = new ArrayList<Oblik>();
		ArrayList<Oblik> oblikLinija3 = new ArrayList<Oblik>();
		
		// trougao
		ArrayList<Oblik> oblikTrougao1 = new ArrayList<Oblik>();
		ArrayList<Oblik> oblikTrougao2 = new ArrayList<Oblik>();
		ArrayList<Oblik> oblikTrougao3 = new ArrayList<Oblik>();
		
		// pravougaonik
		ArrayList<Oblik> oblici5 = new ArrayList<Oblik>();
		ArrayList<Oblik> oblici6 = new ArrayList<Oblik>();
		ArrayList<Oblik> oblici15 = new ArrayList<Oblik>();
		
		// elipsa		
		ArrayList<Oblik> oblici7 = new ArrayList<Oblik>();
		ArrayList<Oblik> oblici8 = new ArrayList<Oblik>();
		ArrayList<Oblik> oblici13 = new ArrayList<Oblik>();
			
		// zaob prav		
		ArrayList<Oblik> oblici9 = new ArrayList<Oblik>();
		ArrayList<Oblik> oblici10 = new ArrayList<Oblik>();
		ArrayList<Oblik> oblici12 = new ArrayList<Oblik>();
		
		Canvas canvas1 = mejnfrejm.getPanel(0);

		Canvas canvas3 = mejnfrejm.getPanel(1);
		Canvas canvas4 = mejnfrejm.getPanel(2);
		
		Raspored raspored1 = canvas1.getRaspored();

		Raspored raspored2 = canvas3.getRaspored();

		Raspored raspored4 = canvas4.getRaspored();
		
		Pozicija pozicijaElipse1 = new GridPozicija(0, 0, raspored1);
		Pozicija pozicijaElipse2 = new KoordinatePozicija(150, 150, raspored2);
		Pozicija pozicijaElipse3 = new StraneSvetaPozicija(StraneSveta.jug, raspored4);
		
		Pozicija pozicijaLinije1 = new GridPozicija(0, 1, raspored1);
		Pozicija pozicijaLinije2 = new KoordinatePozicija(100, 100, 233, 120, raspored2);
		Pozicija pozicijaLinije3 = new StraneSvetaPozicija(StraneSveta.centar, raspored4);
		
		Pozicija pozicijaTrougao2 = new GridPozicija(0, 2, raspored1);
		Pozicija pozicijaTrougao1 = new KoordinatePozicija(50, 50, 150, 50, 50, 100, raspored2);
		Pozicija pozicijaTrougao3 = new StraneSvetaPozicija(StraneSveta.jugozapad, raspored4);
		
		Pozicija pozicijaPravougaonik1 = new GridPozicija(2, 2, raspored1);
		Pozicija pozicijaPravougaonik2 = new KoordinatePozicija(100, 360, 200, 360, 200, 450, 100, 450, raspored2);
		Pozicija pozicijaPravougaonik3 = new StraneSvetaPozicija(StraneSveta.istok, raspored4);
		
		Pozicija pozicijaZaobPravougaonik1 = new GridPozicija(1, 1, raspored1);
		Pozicija pozicijaZaobPravougaonik2 = new KoordinatePozicija(300, 300, raspored2);
		Pozicija pozicijaZaobPravougaonik3 = new StraneSvetaPozicija(StraneSveta.jugoistok, raspored4);
		
		Element elementElipsa1 = new Element("elementElipsa1", oblici7, canvas1);	
		Element elementElipsa2 = new Element("elementElipsa2", oblici8, canvas3);
		Element elementElipsa3 = new Element("elementElipsa2", oblici13, canvas4);
		
		Element elementLinija1 = new Element("elementLinija1", oblikLinija1, canvas1);
		Element elementLinija2 = new Element("elementLinija2", oblikLinija2, canvas3);
		Element elementLinija3 = new Element("elementLinija3", oblikLinija3, canvas4);
		
		Element elementTrougao1 = new Element("elementTrougao1", oblikTrougao1, canvas1);	
		Element elementTrougao2 = new Element("elementTrougao2", oblikTrougao2, canvas3);
		Element elementTrougao3 = new Element("elementTrougao3", oblikTrougao3, canvas4);
		
		Element elementPravougaonik1 = new Element("elementPravougaonik1", oblici5, canvas1);
		Element elementPravougaonik2 = new Element("elementPravougaonik1", oblici6, canvas3);
		Element elementPravougaonik3 = new Element("elementPravougaonik3", oblici15, canvas4);
		
		Element elementZaobPravougaonik1 = new Element("elementZaobPravougaonik1", oblici9, canvas1);
		Element elementZaobPravougaonik2 = new Element("elementZaobPravougaonik2", oblici10, canvas3);
		Element elementZaobPravougaonik3 = new Element("elementZaobPravougaonik3", oblici12, canvas4);
		
		Elipsa elipsa1 = new Elipsa(Color.PINK, 0, pozicijaElipse1, elementElipsa1, 150, 100);		
		Elipsa elipsa2 = new Elipsa(Color.PINK, 0, pozicijaElipse2, elementElipsa2, 200, 100);
		Elipsa elipsa3 = new Elipsa(Color.PINK, 0, pozicijaElipse3, elementElipsa3, 200, 200);
		
		Linija linija1 = new Linija(Color.ORANGE, 0, pozicijaLinije1, elementLinija1, 150);
		Linija linija2 = new Linija(Color.ORANGE, 30, pozicijaLinije2, elementLinija2, 100);
		Linija linija3 = new Linija(Color.ORANGE, 0, pozicijaLinije3, elementLinija3, 100);
		
		Pravougaonik pravougaonik1 = new Pravougaonik(Color.YELLOW, 0, pozicijaPravougaonik1, elementPravougaonik1, 160, 160);
		Pravougaonik pravougaonik2 = new Pravougaonik(Color.GRAY, 0, pozicijaPravougaonik2, elementPravougaonik2, 60, 60);
		Pravougaonik pravougaonik3 = new Pravougaonik(Color.GRAY, 0, pozicijaPravougaonik3, elementPravougaonik3, 100, 160);
		
		Trougao trougao1 = new Trougao(Color.GREEN, 0, pozicijaTrougao2, elementTrougao1, 100, 100, 100);
		Trougao trougao2 = new Trougao(Color.GREEN, 0, pozicijaTrougao1, elementTrougao2, 100, 100, 100);
		Trougao trougao3 = new Trougao(Color.GREEN, 0, pozicijaTrougao3, elementTrougao3, 100, 100, 100);
		
		ZaobljeniPravougaonik zaobPravougaonik1 = new ZaobljeniPravougaonik
				(Color.CYAN, 0, pozicijaZaobPravougaonik1, elementZaobPravougaonik1, 120, 180, 15, 15);
		
		ZaobljeniPravougaonik zaobPravougaonik2 = new ZaobljeniPravougaonik
				(Color.CYAN, 0, pozicijaZaobPravougaonik2, elementZaobPravougaonik2, 120, 180, 15, 15);
		
		ZaobljeniPravougaonik zaobPravougaonik3 = new ZaobljeniPravougaonik
				(Color.CYAN, 0, pozicijaZaobPravougaonik3, elementZaobPravougaonik3, 160, 160, 15, 15);
		
		oblikLinija1.add(linija1);
		oblikLinija2.add(linija2);
		
		oblikTrougao1.add(trougao1);
		oblikTrougao2.add(trougao2);
		
		oblici5.add(pravougaonik1);
		oblici6.add(pravougaonik2);
		
		oblici7.add(elipsa1);
		oblici8.add(elipsa2);
		
		oblici9.add(zaobPravougaonik1);
		oblici10.add(zaobPravougaonik2);

		oblikLinija3.add(linija3);
		oblici12.add(zaobPravougaonik3);
		
		oblici12.add(elipsa3);
		oblikTrougao3.add(trougao3);
		oblici15.add(pravougaonik3);
			
		canvas1.addElementToCanvas(elementTrougao1);
		canvas1.addElementToCanvas(elementPravougaonik1);
		canvas1.addElementToCanvas(elementElipsa1);
		
		canvas1.addElementToCanvas(elementLinija1);
		canvas1.addElementToCanvas(elementZaobPravougaonik1);
		
		canvas3.addElementToCanvas(elementLinija2);
		canvas3.addElementToCanvas(elementTrougao2);
		canvas3.addElementToCanvas(elementPravougaonik2);
		canvas3.addElementToCanvas(elementElipsa2);
		canvas3.addElementToCanvas(elementZaobPravougaonik2);

		canvas4.addElementToCanvas(elementLinija3);
		canvas4.addElementToCanvas(elementZaobPravougaonik3);
		canvas4.addElementToCanvas(elementElipsa3);
		canvas4.addElementToCanvas(elementTrougao3);
		canvas4.addElementToCanvas(elementPravougaonik3);
		
	}

}
