package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.view.VistaPrincipal;

public class Controller implements ActionListener {
	
	VistaPrincipal vistaPrincipal;
	
	public Controller() {
		vistaPrincipal = new VistaPrincipal();
		
		asignarOyentes();
	}
	
	public void asignarOyentes() {
		vistaPrincipal.getpBotones().getbAgregar().addActionListener(this);
		vistaPrincipal.getpBotones().getbEliminar().addActionListener(this);
		vistaPrincipal.getpBotones().getbModificar().addActionListener(this);
		vistaPrincipal.getpBotones().getbBuscar().addActionListener(this);
		vistaPrincipal.getpBotones().getbSalir().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		switch(e.getActionCommand()) {
		case "Agregar":
			//System.out.println("Agregar presionado");
			break;
		case "Eliminar":
			//System.out.println("Eliminar presionado");
			break;
		case "Modificar":
			//System.out.println("Modificar presionado");
			break;
		case "Buscar":
			//System.out.println("Buscar presionado");
			break;
		case "Salir":
			//System.out.println("Salir presionado");
			System.exit(0);
			break;
		}
		
	}

}
