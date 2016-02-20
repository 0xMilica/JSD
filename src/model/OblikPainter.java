package model;

import java.awt.Graphics2D;
import java.awt.geom.Point2D;

public abstract class OblikPainter {
	/* 
	 * Oblik koji se iscrtava
	 */
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
