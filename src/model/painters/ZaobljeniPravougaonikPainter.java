package model.painters;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import java.awt.geom.RoundRectangle2D;
import model.Oblik;
import model.OblikPainter;
import model.elements.ZaobljeniPravougaonik;

public class ZaobljeniPravougaonikPainter extends OblikPainter{
	
	public ZaobljeniPravougaonikPainter(Oblik oblik) {
		super(oblik);
	}

	@Override
	public void paint(Graphics2D g) {
		
		ZaobljeniPravougaonik pravougaonik = (ZaobljeniPravougaonik) oblik;

		if(pravougaonik.color == null) {
			g.setColor(Color.RED);
		} else {
			g.setColor(pravougaonik.getColor());
		}
		
		g.rotate(Math.toRadians(pravougaonik.getUgao()));
		
		if(getShape() == null) {
			RoundRectangle2D rectangle = new RoundRectangle2D.Double(
					pravougaonik.getLokacija().getX(),
					pravougaonik.getLokacija().getY(),
					pravougaonik.getVisinaPravougaonika(),
					pravougaonik.getSirinaPravougaonika(), 
					pravougaonik.getVisinaLuka(),
					pravougaonik.getSirinaLuka());
			g.draw(rectangle);
			g.fill(rectangle);
		} else {
			g.draw(getShape());
			g.draw(getShape());
		}	
	}
	
	@Override
	public boolean isElementAt(Point2D pos) {
		return false;
	}

}
