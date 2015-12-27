package model.painters;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

import model.Oblik;
import model.OblikPainter;
import model.elements.Trougao;

public class TrougaoPainter extends OblikPainter{

	public TrougaoPainter(Oblik oblik) {
		super(oblik);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void paint(Graphics2D g) {
		// TODO Auto-generated method stub
		Trougao trougao = (Trougao) oblik;
		if(trougao.paint == null){
			g.setPaint(Color.BLACK);
		}
		else{
			g.setPaint(trougao.getPaint());
		}
		//g.setStroke(linija.getStroke());
		
		if(getShape() == null){
			
			g.draw(new Line2D.Double(trougao.getA(), trougao.getB()));
			g.draw(new Line2D.Double(trougao.getB(), trougao.getC()));
			g.draw(new Line2D.Double(trougao.getC(), trougao.getA()));
		
		}
		else {
			g.draw(getShape());
		}
	}

	@Override
	public boolean isElementAt(Point2D pos) {
		// TODO Auto-generated method stub
		return false;
	}

	
}
