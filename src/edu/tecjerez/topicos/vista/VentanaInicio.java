package edu.tecjerez.topicos.vista;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;

public class VentanaInicio extends JFrame{
	GridBagLayout gbl = new GridBagLayout(); 
	GridBagConstraints gbc = new GridBagConstraints(); 
	
	
	public VentanaInicio() {
		getContentPane().setLayout(gbl);
		setSize(400, 400); 
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		
	}

}
