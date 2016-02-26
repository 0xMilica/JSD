package test;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import model.elements.Elipsa;
import model.elements.Linija;
import model.elements.Pravougaonik;
import model.elements.Trougao;
import model.elements.ZaobljeniPravougaonik;
import model.raspored.GridRaspored;
import model.raspored.KoordinateRaspored;
import model.raspored.Raspored;
import model.raspored.StraneSveta;
import model.raspored.StraneSvetaRaspored;
import model.Canvas;
import model.Kafic;
import model.Oblik;
import model.Element;
import model.pozicija.GridPozicija;
import model.pozicija.KoordinatePozicija;
import model.pozicija.Pozicija;
import model.pozicija.StraneSvetaPozicija;
import view.MainFrame;

public class MainTest {

	public static void main(String[] args) {

		MainFrame mainFrame = new MainFrame();
		mainFrame.setVisible(true);

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
		
		List<Canvas>listaNivoa = new ArrayList<Canvas>();
		Kafic kafic = new Kafic("Ime kafica", listaNivoa);
		mainFrame.setTitle(kafic.getNaziv());
		
		GridRaspored raspored1 = new GridRaspored(3, 3);
		KoordinateRaspored raspored2 = new KoordinateRaspored();
		StraneSvetaRaspored  raspored4 = new StraneSvetaRaspored();
		
		Canvas canvas1 = new Canvas("Ime prvog nivoa", 600, 600, Color.WHITE, raspored1, kafic);
		raspored1.setNivo(canvas1);
		mainFrame.addTab(canvas1);
		
		Canvas canvas3 = new Canvas("Drugi sprat", 500, 600, Color.WHITE, raspored2, kafic);
		raspored2.setNivo(canvas3);
		mainFrame.addTab(canvas3);
		
		Canvas canvas4 = new Canvas("Treci sprat", 600, 600, Color.WHITE, raspored4, kafic);
		raspored4.setNivo(canvas4);
		mainFrame.addTab(canvas4);
		
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
		
		Elipsa elipsa1 = new Elipsa(pozicijaElipse1, elementElipsa1, Color.PINK, 0, 150, 100);		
		Elipsa elipsa2 = new Elipsa(pozicijaElipse2, elementElipsa2, Color.PINK, 0,200, 100);
		Elipsa elipsa3 = new Elipsa(pozicijaElipse3, elementElipsa3, Color.PINK, 0, 200, 200);
		
		Linija linija1 = new Linija(pozicijaLinije1, elementLinija1, Color.ORANGE, 0, 150);
		Linija linija2 = new Linija(pozicijaLinije2, elementLinija2, Color.ORANGE, 30, 100);
		Linija linija3 = new Linija(pozicijaLinije3, elementLinija3, Color.ORANGE, 0, 100);
		
		Pravougaonik pravougaonik1 = new Pravougaonik(pozicijaPravougaonik1, elementPravougaonik1, Color.YELLOW, 0, 160, 160);
		Pravougaonik pravougaonik2 = new Pravougaonik(pozicijaPravougaonik2, elementPravougaonik2, Color.GRAY, 0, 60, 60);
		Pravougaonik pravougaonik3 = new Pravougaonik(pozicijaPravougaonik3, elementPravougaonik3, Color.GRAY, 0, 100, 160);
		
		Trougao trougao1 = new Trougao(pozicijaTrougao2, elementTrougao1, Color.GREEN, 0, 100, 100, 100);
		Trougao trougao2 = new Trougao(pozicijaTrougao1, elementTrougao2, Color.GREEN, 0, 100, 100, 100);
		Trougao trougao3 = new Trougao(pozicijaTrougao3, elementTrougao3, Color.GREEN, 0, 100, 100, 100);
		
		ZaobljeniPravougaonik zaobPravougaonik1 = new ZaobljeniPravougaonik
				(pozicijaZaobPravougaonik1, elementZaobPravougaonik1, Color.CYAN, 0, 120, 180, 15, 15);
		
		ZaobljeniPravougaonik zaobPravougaonik2 = new ZaobljeniPravougaonik
				(pozicijaZaobPravougaonik2, elementZaobPravougaonik2, Color.CYAN, 0, 120, 180, 15, 15);
		
		ZaobljeniPravougaonik zaobPravougaonik3 = new ZaobljeniPravougaonik
				(pozicijaZaobPravougaonik3, elementZaobPravougaonik3, Color.CYAN, 0, 160, 160, 15, 15);
		
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