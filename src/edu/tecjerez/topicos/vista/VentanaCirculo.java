package edu.tecjerez.topicos.vista;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JTextField;

import edu.tecjerez.topicos.figuras.Circulo;

public class VentanaCirculo extends JFrame implements ActionListener{
	JComboBox<String> comboCalc; 
	JTextField radio, resultado;  
	JButton btnResultado; 
	
	
	public VentanaCirculo() {
		getContentPane().setLayout(new FlowLayout());
		setSize(200, 200); 
		setVisible(true);
		setLocationRelativeTo(null); 
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setBackground(new Color(173, 216, 230));
		setTitle("Circulo");
		
		comboCalc = new JComboBox<>();  
		comboCalc.addItem("Perimetro");
		comboCalc.addItem("Area");  				//(EXIT_ON_CLOSE, ABORT, WIDTH, HEIGHT);
		add(comboCalc); 
		comboCalc.addActionListener(this);
		
		JLabel radiotxt = new JLabel("Ingresa el radio:"); 
		add(radiotxt); 
		
		radio = new JTextField(12); 
		add(radio); 
		
		btnResultado = new JButton("Resultado");
		add(btnResultado); 
		btnResultado.addActionListener(this); 
		
		resultado = new JTextField(12); 
		add(resultado); 
	
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == btnResultado) {
			String rad = radio.getText(); 
			
			try {
				double radConvertido = Double.parseDouble(rad); 
				Circulo circulo = new Circulo(); 
				
				String comboOpcion = (String) comboCalc.getSelectedItem(); 
				
				if(comboOpcion.equals("Perimetro")) {
					double perimetro  = circulo.perimetro(radConvertido); 
					String perimetroConvertido = Double.toString(perimetro); 
					resultado.setText(perimetroConvertido);
				}
				if(comboOpcion.equals("Area")) {
					double area = circulo.area(radConvertido);
					String areaConvertida = Double.toString(area); 
					resultado.setText(areaConvertida);
					
				}
			} catch (NumberFormatException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				JOptionPane.showMessageDialog(this, "¡ERROR! Ingrese solo valores numéricos.");
			}
			
		}
		
		
		
		
		
	}
}
