package test;

import java.awt.Color;
import java.awt.geom.Point2D;
import java.util.ArrayList;

import model.Canvas;
import model.Element;
import model.Oblik;
import model.Pozicija;
import model.elements.Elipsa;
import model.elements.Linija;
import model.elements.Poligon;
import model.elements.Pravougaonik;
import model.elements.Trougao;
import model.elements.ZaobljeniPravougaonik;
import view.MainFrame;

public class MainTest {

	public static void main(String[] args) {

		MainFrame mejnfrejm = new MainFrame();
		mejnfrejm.setVisible(true);

		ArrayList<Oblik> oblici = new ArrayList<Oblik>();

		Element element = new Element(new Pozicija(1,1), oblici);
		
		Canvas canvas1 = mejnfrejm.getPanel(0);
		Canvas canvas2 = mejnfrejm.getPanel(1);
		
		canvas1.addElementToCanvas(element);
		canvas2.addElementToCanvas(element);
		
		Linija linija = new Linija(Color.GREEN, null, 0, new Point2D.Double(300,50), new Point2D.Double(600,50));
		
		Pravougaonik pravougaonik = new Pravougaonik(
				null, Oblik.dashed, -10, new Point2D.Double(255, 55), new Point2D.Double(155, 200));
		
		ZaobljeniPravougaonik zaobljeniPravougaonik = new ZaobljeniPravougaonik(
				null, Oblik.dashed, 30, new Point2D.Double(180,100), 120, 120, 10,10);

		Elipsa elipsa = new Elipsa (Color.BLUE, null, 0, new Point2D.Double(270,170), 100, 100);
		
		Trougao trougao = new Trougao(
				Color.PINK, null, 90, new Point2D.Double(10,15), new Point2D.Double(20, 70), new Point2D.Double(30,30));
		
		Poligon poligon = new Poligon(Color.BLUE, null, 0,  new int[]{0,30,30,20,20,0}, new int[] {0,0,40,40,10,10}, 6 );
		
		oblici.add(linija);
		oblici.add(pravougaonik);
		oblici.add(zaobljeniPravougaonik);
		oblici.add(elipsa);
		oblici.add(trougao);
		oblici.add(poligon);
	}

}
