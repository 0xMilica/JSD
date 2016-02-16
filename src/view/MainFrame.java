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
		
		Canvas nivo1 = new Canvas("Ime prvog nivoa", 200, 200, Color.RED);
		Canvas nivo2 = new Canvas("Ime drugog nivoa", 500, 400, Color.RED);
		
		listaNivoa.add(nivo1);
		listaNivoa.add(nivo2);
		
		kafic = new Kafic("Ime kafica", listaNivoa);
		setTitle(kafic.getNaziv());
		
		for(Canvas nivo : listaNivoa){
			JPanel panel = new JPanel();
			panel.add(nivo, BorderLayout.CENTER);
			tabbedPane.addTab(nivo.getNaziv(), panel);
		}
		
		getContentPane().add(tabbedPane, BorderLayout.CENTER);		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}
	
	public Canvas getPanel(int index){		
		return listaNivoa.get(index);
	}
	
}
