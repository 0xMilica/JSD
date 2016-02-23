package model.raspored;

import model.Canvas;


/**
 * Potrebna apstraktna klasa koju nasledjuju svi rasporedi. 
 *
 */
public abstract class Raspored {

	public Canvas nivo;
	
	public Raspored() {
		super();
	}

	public Raspored(Canvas nivo) {
		super();
		this.nivo = nivo;
	}

	public Canvas getNivo() {
		return nivo;
	}

	public void setNivo(Canvas nivo) {
		this.nivo = nivo;
	}

}
