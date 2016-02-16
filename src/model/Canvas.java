package model;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.ArrayList;

import javax.swing.JPanel;

public class Canvas extends JPanel {

	private static final long serialVersionUID = 7525332486738555913L;
	
	private String naziv;
	private int sirina;
	private int duzina;
	private Color bojaPodloge;
	private ArrayList<Element> grafickiElementi = new ArrayList<Element>();

	public Canvas(String naziv, int sirina, int duzina, Color bojaPodloge){
		this.sirina = sirina;
		this.naziv = naziv;
		this.duzina = duzina;
		this.bojaPodloge = bojaPodloge;
		
		setPreferredSize(new Dimension(sirina, duzina));
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		setBackground(bojaPodloge);
		
		Graphics2D g2 = (Graphics2D) g;
		// Ukljucujemo omeksavanje ivica (antialiasing)
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		// Postavljanje transparencije
		g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.8f));

		// ovde iscrtavamo sve elemente koji su na canvasu, bez obzira na tip
		for (int i=0; i<grafickiElementi.size(); i++){
			
			for(Oblik oblik : grafickiElementi.get(i).getKomponente()){
				
				final Graphics2D gT = (Graphics2D) g2.create();
			    try {
			    	oblik.getPainter().paint(gT);
					
			    } finally {
			    	// za resetovanje svih nedefault-nih propertija Graphic2D objekta
			    	gT.dispose();
			    }
				
			}
		}
	}
	
	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public int getSirina() {
		return sirina;
	}

	public void setSirina(int sirina) {
		this.sirina = sirina;
	}

	public int getDuzina() {
		return duzina;
	}

	public void setDuzina(int duzina) {
		this.duzina = duzina;
	}

	public Color getBoja() {
		return bojaPodloge;
	}

	public void setBoja(Color boja) {
		this.bojaPodloge = boja;
	}

	public ArrayList<Element> getGrafickiElementi(){	
		return grafickiElementi;
	}
	
	public void setGrafickiElementi(ArrayList<Element> grafickiElementi) {
		this.grafickiElementi = grafickiElementi;
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
