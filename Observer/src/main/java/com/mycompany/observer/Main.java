package com.mycompany.observer;

import java.awt.Button;
import java.awt.Color;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class Main extends JFrame implements ActionListener {
	private static JFrame ventana;
	private static Button b1;
	private static Button b2;
	private static Button b3;
	private static Panel g;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		crearVentana();	
	}
	public static void crearVentana() {
		
		ventana = new JFrame("Ventana");
		ventana.setSize(500,500);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
		g = new Panel();
		ventana.add(g);
		b1 = new Button();
		b1.setSize(100,50);
		b1.setLocation(200, 100);
		b2= new Button();
		b2.setSize(100,50);
		b2.setLocation(200,200);
		b3= new Button();
		b3.setSize(100,50);
		b3.setLocation(200,300);
		ActionListener ac = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==b1) {
					g.setBackground(Color.red);
				}else if(e.getSource()==b2) {
					g.setBackground(Color.cyan);
				}else {
					g.setBackground(Color.green);
				}
				
			}
			
		};
		b1.addActionListener(ac);
		b2.addActionListener(ac);
		b3.addActionListener(ac);
		b1.setLabel("Rojo");
		b2.setLabel("Celeste");
		b3.setLabel("Verde");
		g.add(b1);
		g.add(b2);
		g.add(b3);
		
		
	}
	@Override
	public void actionPerformed(ActionEvent evento) {
		if(evento.getSource()==b1) {
			g.setBackground(Color.red);
		}
		
	}
	

}
