package edu.tecjerez.topicos.vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaInicio extends JFrame implements ActionListener{
	GridBagLayout gbl = new GridBagLayout(); 
	GridBagConstraints gbc = new GridBagConstraints(); 
	JButton circulo, triangulo, rectangulo, rombo, elipse, piramide, cono; 
	
	public VentanaInicio() {
		getContentPane().setLayout(gbl);
		setSize(300, 470); 
		setVisible(true);
		getContentPane().setBackground(new Color(112, 190, 204));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null); 
		setTitle("Figuras");
		
		JLabel txt1 = new JLabel("Selecciona la figura:"); 
		agregarComponentes(txt1, 1, 0, 2, 1);
		JLabel espacioVisual = new JLabel("              "); 
		agregarComponentes(espacioVisual, 1, 1, 2, 1); 
		
		Dimension btnDimensiones = new Dimension(120, 90); 
		
		circulo = new JButton("CIRCULO");
		circulo.setPreferredSize(btnDimensiones);
		agregarComponentes(circulo, 1, 2, 1, 1);
		circulo.addActionListener(this);
		
		triangulo = new JButton("TRIANGULO"); 
		triangulo.setPreferredSize(btnDimensiones);
		agregarComponentes(triangulo, 1, 3,  1, 1);
		triangulo.addActionListener(this);
		
		rectangulo = new JButton("RECTANGULO"); 
		rectangulo.setPreferredSize(btnDimensiones);
		agregarComponentes(rectangulo, 1,  4,  1,  1);
		rectangulo.addActionListener(this);
		
		rombo = new JButton("ROMBO"); 
		rombo.setPreferredSize(btnDimensiones);
		agregarComponentes(rombo, 1,  5,  1,  1);
		rombo.addActionListener(this);
		
		elipse = new JButton("ELIPSE"); 
		elipse.setPreferredSize(btnDimensiones);
		agregarComponentes(elipse, 2, 2, 1, 1);
		elipse.addActionListener(this);
		
		piramide = new JButton("PIRAMIDE"); 
		piramide.setPreferredSize(btnDimensiones);
		agregarComponentes(piramide, 2, 3, 1, 1);
		piramide.addActionListener(this);
		 
		cono = new JButton("CONO"); 
		cono.setPreferredSize(btnDimensiones);
		agregarComponentes(cono, 2, 4, 1, 1);
		cono.addActionListener(this);
	
		
		
		
	}
	
	public void agregarComponentes(JComponent componente, int x, int y, int w, int h) {
		gbc.gridx = x;
		gbc.gridy = y; 
		gbc.gridwidth = w; 
		gbc.gridheight = h;
		gbl.setConstraints(componente, gbc); 
		add(componente); 
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()== circulo) {
			VentanaCirculo ventanaCirulo = new  VentanaCirculo(); 
			
		}
		if(e.getSource()== triangulo) {
			VentanaTriangulo ventanaTriangulo = new VentanaTriangulo(); 
			
		}
		if(e.getSource()== rectangulo) {
			NuevaVentana ventanaRectangulo = new NuevaVentana("Rectangulo", false); 
			
		}
		if(e.getSource()== rombo) {
			NuevaVentana ventanaRombo = new NuevaVentana("Rombo", false); 
			
		}
		if(e.getSource()== elipse) {
			NuevaVentana ventanaElipse = new NuevaVentana("Elipse", false); 
			
		}
		if(e.getSource()== piramide) {
			NuevaVentana ventanaPiramide = new NuevaVentana("Piramide", true); 
			
		}
		if(e.getSource()== cono) {
			NuevaVentana ventanaCono = new NuevaVentana("Cono", true); 
			
		}
		
		
		
		
	}

}
