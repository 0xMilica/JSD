package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;




import model.Canvas;
import model.Kafic;
import model.raspored.GridRaspored;
import model.raspored.KoordinateRaspored;
import model.raspored.Raspored;
import model.raspored.StraneSvetaRaspored;

@SuppressWarnings("serial")
public class MainFrame extends JFrame{
	
	private Kafic kafic;
	private List<Canvas> listaNivoa;
	private JTabbedPane tabbedPane;
	
	public MainFrame(){
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int height = screenSize.height;
		int width = screenSize.width;
		setSize(width/2, height/2);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		listaNivoa = new ArrayList<Canvas>();
		kafic = new Kafic("Ime kafica", listaNivoa);
		
		GridRaspored grid = new GridRaspored(3, 3);
		GridRaspored grid2 = new GridRaspored(2, 2);
		KoordinateRaspored koordinate = new KoordinateRaspored();
		StraneSvetaRaspored straneSveta = new StraneSvetaRaspored();
		
		Canvas nivo1 = new Canvas("Ime prvog nivoa", 600, 600, Color.WHITE, grid, kafic);
		grid.setNivo(nivo1);
		
		Canvas nivo3 = new Canvas("Drugi sprat", 500, 600, Color.WHITE, koordinate, kafic);
		koordinate.setNivo(nivo3);
		
		Canvas nivo4 = new Canvas("Treci sprat", 600, 600, Color.WHITE, straneSveta, kafic);
		straneSveta.setNivo(nivo4);
		
		listaNivoa.add(nivo1);
		listaNivoa.add(nivo3);
		listaNivoa.add(nivo4);
		
		for(Canvas nivo : listaNivoa){
			JPanel panel = new JPanel();
			panel.add(nivo, BorderLayout.CENTER);
			tabbedPane.addTab(nivo.getNaziv(), panel);
		}
		
		setTitle(kafic.getNaziv());
		getContentPane().add(tabbedPane, BorderLayout.CENTER);		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}
	
	public Canvas getPanel(int index){		
		return listaNivoa.get(index);
	}
	
}
