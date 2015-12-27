package model;

import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.ArrayList;

import javax.swing.JPanel;

public class Canvas extends JPanel {

	private static final long serialVersionUID = 7525332486738555913L;
	private ArrayList<Element> grafickiElementi = new ArrayList<Element>();
	

	public Canvas(){
		super();
	}
	

	@Override
	public void paintComponent(Graphics g) {
		//super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D) g;
		// Ukljucujemo omeksavanje ivica (antialiasing)
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		// Postavljanje transparencije
		g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.8f));

		// ovde iscrtavamo sve elemente koji su na canvasu, bez obzira na tip
		for (int i=0; i<grafickiElementi.size(); i++){
			
			for(Oblik oblik : grafickiElementi.get(i).getKomponente()){
				oblik.getPainter().paint(g2);
			}
		}
	}
	
	public ArrayList<Element> getGrafickiElementi(){
		
		return grafickiElementi;
	}
	
	public void addElementToCanvas(Element element){
		
		grafickiElementi.add(element);
	}
	
	public boolean removeElementFromCanvas(Element element){
		if(grafickiElementi.contains(element)){
			grafickiElementi.remove(element);
			return true;
		}
		return false;
	}
}
