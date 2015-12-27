package model;

import java.util.ArrayList;

public class Element {

	private ArrayList<Oblik> komponente;
	
	
	public Element(ArrayList<Oblik> komponente){
		
		this.komponente= komponente;
	}
	
	public ArrayList<Oblik> getKomponente() {
		return komponente;
	}
	
	
}
