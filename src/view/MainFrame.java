package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import model.Canvas;

@SuppressWarnings("serial")
public class MainFrame extends JFrame{
	
	private List<Canvas> listaNivoa;
	private JTabbedPane tabbedPane;
	
	public MainFrame(){
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int height = screenSize.height;
		int width = screenSize.width;
		setSize(width*3/4, height*3/4);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	
		getContentPane().add(tabbedPane, BorderLayout.CENTER);		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}
	
	public Canvas getPanel(int index){		
		return listaNivoa.get(index);
	}
		
	public void addTab(Canvas nivo) {
		JPanel panel = new JPanel();
		panel.add(nivo, BorderLayout.CENTER);
		tabbedPane.addTab(nivo.getNaziv(), panel);
	}
	
}
