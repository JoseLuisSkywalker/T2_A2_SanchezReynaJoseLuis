package edu.tecjerez.topicos.vista;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

import edu.tecjerez.topicos.figuras.Triangulo;

public class VentanaTriangulo extends JFrame implements ActionListener{
	JComboBox<String> comboCalc; 
	JTextField lado1, lado2, lado3, lado4, resultado, base, altura;  
	JButton btnResultado; 
	
	public VentanaTriangulo() {
		getContentPane().setLayout(new FlowLayout());
		setVisible(true);
		setSize(220, 350);
		setLocationRelativeTo(null); 
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setBackground(new Color(173, 216, 230));
		setTitle("Triangulo");
		
		comboCalc = new JComboBox<String>();
		comboCalc.addItem("Area");
		comboCalc.addItem("Perimetro");
		add(comboCalc);
		comboCalc.addActionListener(this);
		
		JLabel basetxt = new JLabel("Ingresa la base: "); 
		add(basetxt); 
		
		
		
		
		JLabel alturatxt = new JLabel("Ingresa la altura: "); 
		add(alturatxt); 
		
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()== comboCalc) {
		
		
			String opcion = (String)comboCalc.getSelectedItem(); 
			Triangulo triangulo = new Triangulo(); 
			
			getContentPane().removeAll();
			add(comboCalc); 
			
			
			if(opcion.equals("Perimetro")) {
		
			JLabel instruccionesLabel = new JLabel("Ingresa lo siguiente:   "); 
			add(instruccionesLabel); 
			
			add(new JLabel("Lado 1: "));
            lado1 = new JTextField(8); 
            add(lado1);

            add(new JLabel("Lado 2: "));
            lado2 = new JTextField(8);
            add(lado2);

            add(new JLabel("Lado 3: "));
            lado3 = new JTextField(8);
            add(lado3);

            btnResultado = new JButton("Calcular        ");
            add(btnResultado);
            btnResultado.addActionListener(this);
            
            resultado = new JTextField(5); 
            add(resultado); 
            
			
            String lado_1 = lado1.getText(); 
            double lado_1Convertido = Double.parseDouble(lado_1); 
            
            String lado_2 = lado2.getText(); 
            double lado_2Convertido = Double.parseDouble(lado_2); 
            
            String lado_3 = lado3.getText(); 
            double lado_3Convertido = Double.parseDouble(lado_3); 
            
            double perimetro = triangulo.perimetro(lado_1Convertido, lado_2Convertido, lado_3Convertido); 
            String perimetroConvertido = Double.toString(perimetro); 

            resultado.setText(perimetroConvertido);
            
            setSize(getWidth(), 300);
            
            
			}
			
			if(opcion.equals("Area")) {
			setSize(getWidth(), 200); 
			
			}
			
			
			pack();
		}
	}
	
	

}
