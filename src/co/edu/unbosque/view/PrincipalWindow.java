package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class PrincipalWindow extends JFrame {

	private JButton start;
	private JLabel title;
	private JTextArea info;

	public PrincipalWindow() {
		initComponents();
		setVisible(true);
	}

	public void initComponents() {
		// CONFIGURACION DE LA VENTANA
		this.setTitle("Lucky j3");
		this.setBounds(250, 30, 900, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLayout(null);
		this.getContentPane().setBackground(Color.decode("#CDBBFC"));

	}

}
