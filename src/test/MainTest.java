package test;

import java.awt.geom.Point2D;
import java.util.ArrayList;

import model.Canvas;
import model.Element;
import model.Oblik;
import model.elements.Elipsa;
import model.elements.Pravougaonik;
import model.elements.Trougao;
import view.MainFrame;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MainFrame mejnfrejm = new MainFrame();
		mejnfrejm.setVisible(true);
		

		
		ArrayList<Oblik> oblici = new ArrayList<Oblik>();
		
	
		
		Element element = new Element(oblici);
		
		Canvas canvas = mejnfrejm.getPanel();
		
		canvas.addElementToCanvas(element);
		
	//	Linija linija2 = new Linija(null, null, new Point2D.Double(12,12), new Point2D.Double(33,55));
	//	oblici.add(linija2);
		
		//test pravougaonika
		
		Pravougaonik pravougaonik = new Pravougaonik(null, Oblik.dashed, new Point2D.Double(55, 55), new Point2D.Double(155, 200));
		oblici.add(pravougaonik);
		
		Elipsa elipsa = new Elipsa (null, null, new Point2D.Double(70,70), 100, 100);
		
		oblici.add(elipsa);
		
		Trougao trougao = new Trougao(null, null, new Point2D.Double(10,15), new Point2D.Double(20, 70), new Point2D.Double(30,30));
		oblici.add(trougao);
	}

}
