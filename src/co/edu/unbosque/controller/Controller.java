package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.CongeladoAgua;
import co.edu.unbosque.model.CongeladoAire;
import co.edu.unbosque.model.CongeladoNitrogeno;
import co.edu.unbosque.model.Fresco;
import co.edu.unbosque.model.Producto;
import co.edu.unbosque.model.Refrigerado;
import co.edu.unbosque.view.VistaPrincipal;
import co.edu.unbosque.view.VistaVentana;

public class Controller implements ActionListener {
	
	VistaPrincipal vistaPrincipal;
	VistaVentana VV;
	
	public Controller() {
		vistaPrincipal = new VistaPrincipal();
		VV = new VistaVentana();
		
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
			String dato = VV.leerString("Agregar producto congelado, fresco o refrigerado");
			String a = "";
			String b = "";
			String c = "";
			String d = "";
			String f = "";
			String g = "";
			String h = "";
			String i = "";
			String j = "";
			String k = "";
			
			switch(dato) {
			case "congelado":
				String opcionCongelado = VV.leerString("Congelado de agua, aire o nitrogeno");
				
				switch(opcionCongelado) {
				case "agua":
					a = VV.leerString("Fecha de vencimiento del producto");
					b = VV.leerString("Lote del producto");
					c = VV.leerString("Fecha envasado");
					d = VV.leerString("Pais");
					f = VV.leerString("Codigo INVIMA");
					g = VV.leerString("Temperatura");
					h = VV.leerString("Salinidad del agua");
					CongeladoAgua congeladoAgua;
					congeladoAgua = new CongeladoAgua(a, b, c, d, f, g, h);
					VV.mostrarInfo(congeladoAgua.toString() + "\n¡Datos guardados!");
					break;
				case "aire":
					a = VV.leerString("Fecha de vencimiento del producto");
					b = VV.leerString("Lote del producto");
					c = VV.leerString("Fecha envasado");
					d = VV.leerString("Pais");
					f = VV.leerString("Codigo INVIMA");
					g = VV.leerString("Temperatura");
					h = VV.leerString("Porcentaje de nitrogeno");
					i = VV.leerString("Porcentaje de oxigeno");
					j = VV.leerString("Porcentaje de CO2");
					k = VV.leerString("Porcentaje de vapor de agua");
					CongeladoAire congeladoAire;
					congeladoAire = new CongeladoAire(a, b, c, d, f, g, h, i, j, k);
					VV.mostrarInfo(congeladoAire.toString() + "\n¡Datos guardados!");
					break;
				case "nitrogeno":
					a = VV.leerString("Fecha de vencimiento del producto");
					b = VV.leerString("Lote del producto");
					c = VV.leerString("Fecha envasado");
					d = VV.leerString("Pais");
					f = VV.leerString("Codigo INVIMA");
					g = VV.leerString("Temperatura");
					h = VV.leerString("Metodo de congelación");
					i = VV.leerString("Tiempo de exposición al nitrogeno");
					CongeladoNitrogeno congeladoNitrogeno;
					congeladoNitrogeno = new CongeladoNitrogeno(a, b, c, d, f, g, h, i);
					VV.mostrarInfo(congeladoNitrogeno.toString() + "\n¡Datos guardados!");
					break;
				default:
					VV.mostrarInfo("Escriba: agua, aire o nitrogeno en minusculas");
					break;
				
				}
				break;
			
			case "fresco":
				a = VV.leerString("Fecha de vencimiento del producto");
				b = VV.leerString("Lote del producto");
				c = VV.leerString("Fecha envasado");
				d = VV.leerString("Pais");
				Fresco fresco;
				fresco = new Fresco(a, b, c, d);
				VV.mostrarInfo(fresco.toString() + "\n¡Datos guardados!");
				break;
			case "refrigerado":
				a = VV.leerString("Fecha de vencimiento");
				b = VV.leerString("Lote del producto");
				c = VV.leerString("Fecha de envasado");
				d = VV.leerString("Pais");
				f = VV.leerString("Código INVIMA");
				g =	VV.leerString("Temperatura"); 
				Refrigerado refrigerado;
				refrigerado = new Refrigerado(a, b, c, d, f, g);
				VV.mostrarInfo(refrigerado.toString() + "\n¡Datos guardados!");
				break;
			default:
				VV.mostrarInfo("Escriba el tipo de producto en minusculas");
				break;
				
			}
			break;
		case "Eliminar":
			VV.leerString("Qué producto desea eliminar (por numero de lote)");
			break;
		case "Modificar":
			VV.leerString("Qué producto desea modificar (por numero de lote)");
			break;
		case "Buscar":
			String nLote = "";
			String fVencimiento = "";
			
			String busqueda = VV.leerString("¿Va a buscar por numero de lote o por fecha de vencimiento?");
			
			switch(busqueda) {
			case "numero de lote":
				nLote = VV.leerString("Cuál es el número de lote del producto");
				break;
			case "fecha de vencimiento":
				fVencimiento = VV.leerString("Cuál es la fecha de vencimiento del producto");
				break;
			default:
				VV.mostrarInfo("Debe indicar así: numero de lote o fecha de vencimiento (todo en minusculas).");
				break;	
			}
			break;
		case "Salir":
			VV.mostrarInfo("Hasta la próxima :(");
			System.exit(0);
			break;
		}
		
	}

}
