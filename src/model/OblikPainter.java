package model;

import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Point2D;

public abstract class OblikPainter {
	/* 
	 * Oblik koji se iscrtava
	 */
	protected Oblik oblik;
	private Shape shape;
	
	public OblikPainter(Oblik oblik){
		
		this.oblik = oblik;
	}
	
	
	public abstract void paint(Graphics2D g);
	
	public abstract boolean isElementAt(Point2D pos);	

	public Shape getShape(){
		return shape;
	}

	public void setShape(Shape shape){
		this.shape = shape;
	}
}
