package model.pozicija;

import model.pozicija.Pozicija;
import model.raspored.Raspored;
import model.raspored.StraneSveta;

public class StraneSvetaPozicija extends Pozicija {

	private StraneSveta stranaSveta;

	public StraneSvetaPozicija(StraneSveta stranaSveta, Raspored raspored) {
		super(raspored);
		this.stranaSveta = stranaSveta;
	}

	public StraneSveta getStranaSveta() {
		return stranaSveta;
	}

	public void setStranaSveta(StraneSveta stranaSveta) {
		this.stranaSveta = stranaSveta;
	}
	
}
