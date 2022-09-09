package co.edu.unbosque.view;

import javax.swing.*;

public class PBotones extends JPanel{
	
	private JButton bAgregar;
	private JButton bEliminar; //Atributos
	private JButton bModificar;
	private JButton bBuscar;
	private JButton bSalir;
	
	public PBotones() {
		
		//Configuración del JPanel
		setLayout(null);
		funcionar();
		setVisible(true);
		
	}
	
	public void funcionar() {
		
		//Configuración de botones
		bAgregar = new JButton("Agregar");
		bAgregar.setBounds(30, 10, 80, 20);
		bAgregar.setActionCommand("Agregar");
		add(bAgregar);
		
		bEliminar = new JButton("Eliminar");
		bEliminar.setBounds(140, 10, 80, 20);
		bEliminar.setActionCommand("Eliminar");
		add(bEliminar);
		
		bModificar = new JButton("Modificar");
		bModificar.setBounds(250, 10, 90, 20);
		bModificar.setActionCommand("Modificar");
		add(bModificar);
		
		bBuscar = new JButton("Buscar");
		bBuscar.setBounds(370, 10, 80, 20);
		bBuscar.setActionCommand("Buscar");
		add(bBuscar);
		
		bSalir = new JButton("Salir");
		bSalir.setBounds(480, 10, 80, 20);
		bSalir.setActionCommand("Salir");
		add(bSalir);
	}

	public JButton getbAgregar() {
		return bAgregar;
	}

	public void setbAgregar(JButton bAgregar) {
		this.bAgregar = bAgregar;
	}

	public JButton getbEliminar() {
		return bEliminar;
	}

	public void setbEliminar(JButton bEliminar) {
		this.bEliminar = bEliminar;
	}

	public JButton getbModificar() {
		return bModificar;
	}

	public void setbModificar(JButton bModificar) {
		this.bModificar = bModificar;
	}

	public JButton getbBuscar() {
		return bBuscar;
	}

	public void setbBuscar(JButton bBuscar) {
		this.bBuscar = bBuscar;
	}

	public JButton getbSalir() {
		return bSalir;
	}

	public void setbSalir(JButton bSalir) {
		this.bSalir = bSalir;
	}

}
