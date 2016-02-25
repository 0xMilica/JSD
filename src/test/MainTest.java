
package test;

import java.awt.Color;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;
import model.Canvas;
import model.Element;
import model.Kafic;
import model.Oblik;
import model.elements.Elipsa;
import model.elements.Pravougaonik;
import model.elements.Trougao;
import model.elements.Linija;
import model.elements.ZaobljeniPravougaonik;
import view.MainFrame;


public class MainTest {

	public static void main(String[] args) {
		
		MainFrame mainFrame = new MainFrame();
		mainFrame.setVisible(true);
	
		List<Canvas> listaNivoa  = new ArrayList<Canvas>();
		Kafic kafic = new Kafic("Naziv Kafica", listaNivoa);
		mainFrame.setTitle(kafic.getNaziv());
		
		Canvas prizemlje = new Canvas("Prizemlje", 500, 500, Color.WHITE);
		listaNivoa.add(prizemlje);
		mainFrame.addTab(prizemlje);
		
		ArrayList<Oblik> oblici1 = new ArrayList<Oblik>();
		ArrayList<Oblik> oblici2 = new ArrayList<Oblik>();
		ArrayList<Oblik> oblici3 = new ArrayList<Oblik>();
		ArrayList<Oblik> oblici4 = new ArrayList<Oblik>();
		ArrayList<Oblik> oblici5 = new ArrayList<Oblik>();
		
		Linija linija = new Linija(Color.GREEN, null, 0, new Point2D.Double(300,50), new Point2D.Double(400,50));
		oblici1.add(linija);
		
		Pravougaonik pravougaonik = new Pravougaonik( 
				null, Oblik.dashed, -10, new Point2D.Double(255, 55), new Point2D.Double(155, 200));
		oblici2.add(pravougaonik);
		
		ZaobljeniPravougaonik zaobljeniPravougaonik = new ZaobljeniPravougaonik(
				null, Oblik.dashed, 30, new Point2D.Double(180,100), 120, 120, 10,10);
		oblici3.add(zaobljeniPravougaonik);
		
		Elipsa elipsa = new Elipsa (Color.BLUE, null, 0, new Point2D.Double(270,170), 100, 100);
		oblici4.add(elipsa);
		
		Trougao trougao = new Trougao(Color.PINK, null, 90,
				new Point2D.Double(10,15), new Point2D.Double(20, 70), new Point2D.Double(30,30));
		oblici5.add(trougao);
		
		Element element1 = new Element("element1", oblici1);
		Element element2 = new Element("element1", oblici2);
		Element element3 = new Element("element1", oblici3);
		Element element4 = new Element("element1", oblici4);
		Element element5 = new Element("element1", oblici5);
	
		prizemlje.addElementToCanvas(element1);		
		prizemlje.addElementToCanvas(element2);				
		prizemlje.addElementToCanvas(element3);	
		prizemlje.addElementToCanvas(element4);	
		prizemlje.addElementToCanvas(element5);	
	}

}