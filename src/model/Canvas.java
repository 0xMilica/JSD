package model;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.ArrayList;

import javax.swing.JPanel;

import model.raspored.Raspored;


/**
 * Klasa predstavlja model nivoa. Nivo je opisan sirinom, visinom, nazivom, raspored
 *
 */
public class Canvas extends JPanel {

	private static final long serialVersionUID = 7525332486738555913L;
	
	private String naziv;
	private int sirina;
	private int visina;
	private Color bojaPodloge;
	private Raspored raspored;
	private Kafic kafic;
	private ArrayList<Element> grafickiElementi = new ArrayList<Element>();

	public Canvas(String naziv, int sirina, int visina, Color bojaPodloge, Raspored raspored, Kafic kafic){
		this.naziv = naziv;
		this.sirina = sirina;
		this.visina = visina;
		this.bojaPodloge = bojaPodloge;
		this.raspored = raspored;
		this.kafic = kafic;
		setPreferredSize(new Dimension(sirina, visina));
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

		//g2.drawLine(0, 300, 600, 300);
		//g2.drawLine(300, 0, 300, 600);
		//g2.drawLine(0, 400, 300, 400);	
		//g2.drawLine(400, 0, 400, 600);
		
		// ovde iscrtavamo sve elemente koji su na canvasu, bez obzira na tip
		for (int i=0; i<grafickiElementi.size(); i++){
			
			for(Oblik oblik : grafickiElementi.get(i).getKomponente()){
				
				final Graphics2D gT = (Graphics2D) g2.create();
			    try {
			    	oblik.getOblikPainter().paint(gT);
					
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

	public int getVisina() {
		return visina;
	}

	public void setVisina(int visina) {
		this.visina = visina;
	}

	public Color getBojaPodloge() {
		return bojaPodloge;
	}

	public void setBojaPodloge(Color boja) {
		this.bojaPodloge = boja;
	}
	
	public Raspored getRaspored() {
		return raspored;
	}

	public void setRaspored(Raspored raspored) {
		this.raspored = raspored;
	}

	public Kafic getKafic() {
		return kafic;
	}

	public void setKafic(Kafic kafic) {
		this.kafic = kafic;
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
