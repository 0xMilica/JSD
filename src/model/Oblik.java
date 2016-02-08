package model;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Paint;
import java.awt.Stroke;

public abstract class Oblik {

	public String naziv;
	public Color color;
	public Stroke stroke;
	public double ugao;
	public OblikPainter oblikPainter;

	public final static BasicStroke dashed =
	        new BasicStroke(1.0f,
	                        BasicStroke.CAP_BUTT,
	                        BasicStroke.JOIN_MITER,
	                        10.0f, new float[]{10.0f}, 0.0f);
	
	/**
	 * @param stroke - debljina i tip linije za iscrtavanje
	 * @param color - boja i tip - farbanje
	 * @param ugao - ugao za koji se oblik rotira
	 */
	public Oblik(Color color, Stroke stroke, double ugao){		
		this.color = color;
		this.stroke = stroke;
		this.ugao = ugao;
	}
	
	public OblikPainter getPainter(){
		return oblikPainter;
	}

	public Stroke getStroke() {
		return stroke;
	}
	
	public void setStroke(Stroke stroke) {
		this.stroke = stroke;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public double getUgao() {
		return ugao;
	}

	public void setUgao(double ugao) {
		this.ugao = ugao;
	}

}
