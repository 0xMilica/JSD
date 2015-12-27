package view;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import model.Canvas;

@SuppressWarnings("serial")
public class MainFrame extends JFrame{
	
	private Canvas canvas;

	public MainFrame(){
		setTitle("Kafic");
		setSize(300, 400);
		
		canvas = new Canvas();
		getContentPane().add(canvas, BorderLayout.CENTER);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public Canvas getPanel(){
		
		return canvas;
	}
	
}
