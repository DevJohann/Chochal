package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JFrame;

public class VistaPrincipal extends JFrame{
	
	private PTitulo pTitulo;
	private PProductos pProductos;
	private PPublicidad pPublicidad;
	private PBotones pBotones;
	
	public VistaPrincipal() {
		
		
		getContentPane().setLayout(null);
		getContentPane().setBackground(Color.green);
		setTitle("Tienda agroalimentos el chochal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		funcionar();
		
		setSize(600, 500);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		
	}
	
	public void funcionar() {
		pTitulo = new PTitulo();
		pTitulo.setBounds(150, 0, 450, 70);
		//pTitulo.setBackground(Color.black);
		getContentPane().add(pTitulo);
		
		pProductos = new PProductos();
		pProductos.setBounds(150, 70, 450, 345);
		pProductos.setBackground(Color.DARK_GRAY);
		getContentPane().add(pProductos);
		
		pPublicidad = new PPublicidad();
		pPublicidad.setBounds(0, 0, 150, 415);
		//pPublicidad.setBackground(Color.orange);
		getContentPane().add(pPublicidad);
	
		pBotones = new PBotones();
		pBotones.setBounds(0, 415, 600, 85);
		pBotones.setBackground(Color.BLACK);
		getContentPane().add(pBotones);
	}

	public PTitulo getpTitulo() {
		return pTitulo;
	}

	public void setpTitulo(PTitulo pTitulo) {
		this.pTitulo = pTitulo;
	}

	public PProductos getpProductos() {
		return pProductos;
	}

	public void setpProductos(PProductos pProductos) {
		this.pProductos = pProductos;
	}

	public PPublicidad getpPublicidad() {
		return pPublicidad;
	}

	public void setpPublicidad(PPublicidad pPublicidad) {
		this.pPublicidad = pPublicidad;
	}

	public PBotones getpBotones() {
		return pBotones;
	}

	public void setpBotones(PBotones pBotones) {
		this.pBotones = pBotones;
	}

}
