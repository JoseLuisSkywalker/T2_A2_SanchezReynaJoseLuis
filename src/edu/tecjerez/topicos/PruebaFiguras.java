package edu.tecjerez.topicos;

import javax.swing.SwingUtilities;

import edu.tecjerez.topicos.vista.VentanaInicio;


public class PruebaFiguras {

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new VentanaInicio(); 
			}
		}); 
	}

}
