package model;

import java.awt.BasicStroke;
import java.awt.Paint;
import java.awt.Stroke;

public abstract class Oblik {

	public String naziv;
	public Paint paint;
	public Stroke stroke;
	public OblikPainter oblikPainter;

	public final static BasicStroke dashed =
	        new BasicStroke(1.0f,
	                        BasicStroke.CAP_BUTT,
	                        BasicStroke.JOIN_MITER,
	                        10.0f, new float[]{10.0f}, 0.0f);
	
	/**
	 * @param stroke - debljina i tip linije za iscrtavanje
	 * @param paint - boja i tip - farbanje
	 */
	public Oblik(Paint paint, Stroke stroke){
		
		this.stroke = stroke;
		this.paint = paint;
	}
	
	public OblikPainter getPainter(){
		return oblikPainter;
	}

	public Stroke getStroke() {
		return stroke;
	}
	
	public Paint getPaint(){
		return paint;
	}
}
