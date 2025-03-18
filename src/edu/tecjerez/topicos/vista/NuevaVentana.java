package edu.tecjerez.topicos.vista;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class NuevaVentana extends JFrame{
	GridBagLayout gbl = new GridBagLayout(); 
	GridBagConstraints gbc = new GridBagConstraints(); 
	JComboBox<String> comboCalc; 
	
	
	public NuevaVentana(String nombre, boolean es3D) {
		getContentPane().setLayout(gbl);
		setSize(220, 220); 
		setVisible(true);
		setLocationRelativeTo(null); 
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle(nombre);
		
		comboCalc = new JComboBox<>(); 
		comboCalc.addItem("Elige una opción..."); 
		comboCalc.addItem("Perimetro");
		comboCalc.addItem("Area"); 
		
		if(es3D == true) {
			comboCalc.addItem("Volumen");
		}

		
		
		
		
		
		agregarComponentes(comboCalc, EXIT_ON_CLOSE, ABORT, WIDTH, HEIGHT);
		
	
	}
	
	public void agregarComponentes(JComponent componente, int x, int y, int w, int h) {
		gbc.gridx = x;
		gbc.gridy = y; 
		gbc.gridwidth = w; 
		gbc.gridheight = h;
		gbl.setConstraints(componente, gbc); 
		add(componente); 
		
	}


}
