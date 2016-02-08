package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

import model.Canvas;

@SuppressWarnings("serial")
public class MainFrame extends JFrame{
	
	private Canvas canvas;

	public MainFrame(){
		setTitle("Kafic");
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int height = screenSize.height;
		int width = screenSize.width;
		setSize(width/2, height/2);
		
		canvas = new Canvas();
		getContentPane().add(canvas, BorderLayout.CENTER);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}
	
	public Canvas getPanel(){
		
		return canvas;
	}
	
}
