package model;

import java.awt.Graphics2D;
import java.awt.geom.Point2D;


/**
 * Apstraktna klasa koju nasledjuju svi konkretni painteri.
 *
 */
public abstract class OblikPainter {

	protected Oblik oblik;
	
	public OblikPainter(Oblik oblik){		
		this.oblik = oblik;
	}	
	
	public abstract void paint(Graphics2D g);
	
	public abstract boolean isElementAt(Point2D pos);

	public Oblik getOblik() {
		return oblik;
	}

	public void setOblik(Oblik oblik) {
		this.oblik = oblik;
	}	
	
}
