package model.painters;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

import model.Oblik;
import model.OblikPainter;
import model.elements.Trougao;

public class TrougaoPainter extends OblikPainter {

	public TrougaoPainter(Oblik oblik) {
		super(oblik);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void paint(Graphics2D g) {
		// TODO Auto-generated method stub
		Trougao trougao = (Trougao) oblik;
		if (trougao.color == null) {
			g.setPaint(Color.BLUE);
		} else {
			g.setPaint(trougao.getColor());
		}
		// g.setStroke(linija.getStroke());

		g.draw(new Line2D.Double(trougao.getA(), trougao.getB()));
		g.draw(new Line2D.Double(trougao.getB(), trougao.getC()));
		g.draw(new Line2D.Double(trougao.getC(), trougao.getA()));

	}

	@Override
	public boolean isElementAt(Point2D pos) {
		// TODO Auto-generated method stub
		return false;
	}

}
