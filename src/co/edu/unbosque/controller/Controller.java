package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Locale;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import co.edu.unbosque.model.CongeladoAgua;
import co.edu.unbosque.model.CongeladoAire;
import co.edu.unbosque.model.CongeladoNitrogeno;
import co.edu.unbosque.model.DataBase;
import co.edu.unbosque.model.Fresco;
import co.edu.unbosque.model.Producto;
import co.edu.unbosque.model.Refrigerado;
import co.edu.unbosque.view.VistaPrincipal;
import co.edu.unbosque.view.VistaVentana;

public class Controller implements ActionListener{
	
	VistaPrincipal vistaPrincipal; //JFrame
	VistaVentana VV; //Ventana emergente
	
	DataBase DB; //Base de datos, donde está el ArrayList que almacena los productos
	
	
	
	public Controller() {
		vistaPrincipal = new VistaPrincipal();
		VV = new VistaVentana();
		DB = new DataBase();
		
		asignarOyentes();
	}
	
	public void asignarOyentes() {
		vistaPrincipal.getpBotones().getbAgregar().addActionListener(this);
		vistaPrincipal.getpBotones().getbEliminar().addActionListener(this);
		vistaPrincipal.getpBotones().getbModificar().addActionListener(this); //Listeners
		vistaPrincipal.getpBotones().getbBuscar().addActionListener(this);
		vistaPrincipal.getpBotones().getbSalir().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		switch(e.getActionCommand()) { //Cada botón tiene un ActionCommand configurado
		case "Agregar":
			String dato = VV.leerString("Agregar producto congelado, fresco o refrigerado");
			//System.out.println(dato); DEBUG
			String var_a = "";
			String var_b = "";
			String var_c = "";
			String var_d = "";
			String var_f = ""; //Variables que recogerán el valor de los text fields de las ventanas emergentes
			String var_g = "";
			String var_h = "";
			String var_i = "";
			String var_j = "";
			String var_k = "";
			Producto check = null;
			
		try {	//Por si el usuario presiona cancelar y no agrega nada
			switch(dato) {
			case "congelado":
				String opcionCongelado = VV.leerString("Congelado de agua, aire o nitrogeno");
				
				switch(opcionCongelado) {
				case "agua":
					var_a = VV.leerString("Fecha de vencimiento del producto");
					//var_a = "07-Jun-2022";
					//SimpleDateFormat fechaFormatter = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH); DEBUG
					//Date fecha = fechaFormatter.parse(var_a);
					var_b = VV.leerString("Lote del producto");
					check = DB.BuscarPorLote(var_b);
					if(check != null) { //Chequear si el lote ya existe, si check no es igual a null es porque la base de datos retornó un resultado en la búsqueda (por lote)
						VV.mostrarInfo("Error, ese lote ya existe");
						break;
					}else { //Si no está duplicado, continuar
						var_c = VV.leerString("Fecha envasado");
						var_d = VV.leerString("Pais");
						var_f = VV.leerString("Codigo INVIMA");
						var_g = VV.leerString("Temperatura");
						var_h = VV.leerString("Salinidad del agua");
						
						//Crear y guardar el producto en la base de datos
						CongeladoAgua congeladoAgua = new CongeladoAgua(var_a, var_b, var_c, var_d, var_f, var_g, var_h);
						DB.Agregar(congeladoAgua);
						vistaPrincipal.getpProductos().setLCongeladosValue("sumar", 1); //Sumarle 1 al valor del respectivo producto en pProductos
						VV.mostrarInfo(congeladoAgua.toString() + "\n¡Datos guardados!");
						break;
					}
					
				case "aire":
					var_a = VV.leerString("Fecha de vencimiento del producto");
					var_b = VV.leerString("Lote del producto");
					check = DB.BuscarPorLote(var_b);
					if(check != null) {
						VV.mostrarInfo("Error, ese lote ya existe");
						break;
					}else {
						var_c = VV.leerString("Fecha envasado");
						var_d = VV.leerString("Pais");
						var_f = VV.leerString("Codigo INVIMA");
						var_g = VV.leerString("Temperatura");
						var_h = VV.leerString("Porcentaje de nitrogeno");
						var_i = VV.leerString("Porcentaje de oxigeno");
						var_j = VV.leerString("Porcentaje de CO2");
						var_k = VV.leerString("Porcentaje de vapor de agua");
						
						CongeladoAire congeladoAire = new CongeladoAire(var_a, var_b, var_c, var_d, var_f, var_g, var_h, var_i, var_j, var_k);
						DB.Agregar(congeladoAire);
						vistaPrincipal.getpProductos().setLCongeladosValue("sumar", 1);
						VV.mostrarInfo(congeladoAire.toString() + "\n¡Datos guardados!");
						break;
					}
				case "nitrogeno":
					var_a = VV.leerString("Fecha de vencimiento del producto");
					var_b = VV.leerString("Lote del producto");
					check = DB.BuscarPorLote(var_b);
					if(check != null) {
						VV.mostrarInfo("Error, ese lote ya existe");
						break;
					}else {
						var_c = VV.leerString("Fecha envasado");
						var_d = VV.leerString("Pais");
						var_f = VV.leerString("Codigo INVIMA");
						var_g = VV.leerString("Temperatura");
						var_h = VV.leerString("Metodo de congelación");
						var_i = VV.leerString("Tiempo de exposición al nitrogeno");
						
						CongeladoNitrogeno congeladoNitrogeno = new CongeladoNitrogeno(var_a, var_b, var_c, var_d, var_f, var_g, var_h, var_i);
						DB.Agregar(congeladoNitrogeno);
						vistaPrincipal.getpProductos().setLCongeladosValue("sumar", 1);
						VV.mostrarInfo(congeladoNitrogeno.toString() + "\n¡Datos guardados!");
						break;
					}
				default:
					VV.mostrarInfo("Incorrecto, inténtelo de nuevo");
					break;
				
				}
				break;
			
			case "fresco":
				var_a = VV.leerString("Fecha de vencimiento del producto");
				var_b = VV.leerString("Lote del producto");
				check = DB.BuscarPorLote(var_b);
				if(check != null) {
					VV.mostrarInfo("Error, ese lote ya existe");
					break;
				}else {
					var_c = VV.leerString("Fecha envasado");
					var_d = VV.leerString("Pais");
					
					Fresco fresco = new Fresco(var_a, var_b, var_c, var_d);
					DB.Agregar(fresco);
					vistaPrincipal.getpProductos().setLFrescosValue("sumar", 1);
					VV.mostrarInfo(fresco.toString() + "\n¡Datos guardados!");
					break;
				}
			case "refrigerado":
				var_a = VV.leerString("Fecha de vencimiento");
				var_b = VV.leerString("Lote del producto");
				check = DB.BuscarPorLote(var_b);
				if(check != null) {
					VV.mostrarInfo("Error, ese lote ya existe");
					break;
				}else {
					var_c = VV.leerString("Fecha de envasado");
					var_d = VV.leerString("Pais");
					var_f = VV.leerString("Código INVIMA");
					var_g =	VV.leerString("Temperatura"); 
					
					Refrigerado refrigerado = new Refrigerado(var_a, var_b, var_c, var_d, var_f, var_g);
					DB.Agregar(refrigerado);
					vistaPrincipal.getpProductos().setLRefrigeradosValue("sumar", 1);
					VV.mostrarInfo(refrigerado.toString() + "\n¡Datos guardados!");
					break;
				}
			default:
				VV.mostrarInfo("Tipo de producto erróneo, inténtelo de nuevo");
				break;
				
			}
			
		}catch(NullPointerException ex) {
			break;
		}
			break;
			
		case "Eliminar":
			String res = VV.leerString("Qué producto desea eliminar (por numero de lote)");
			String resDB = DB.Eliminar(res);
			resDB = resDB.toLowerCase();
			System.out.println(resDB);
			switch(resDB) {
			case "congelado", "congeladoagua", "congeladoaire", "congeladonitrogeno":
				vistaPrincipal.getpProductos().setLCongeladosValue("resta", 1);
				VV.mostrarInfo("Eliminado correctamente");
				break;
			case "fresco":
				vistaPrincipal.getpProductos().setLFrescosValue("resta", 1);
				VV.mostrarInfo("Eliminado correctamente");
				break;
			case "refrigerado":
				vistaPrincipal.getpProductos().setLRefrigeradosValue("resta", 1);
				VV.mostrarInfo("Eliminado correctamente");
				break;
			}
			
			break;
		case "Modificar":
			String x = VV.leerString("Qué producto desea modificar (por numero de lote)");
			Producto target = DB.BuscarPorLote(x);
			if(target != null) {
				VV.mostrarInfo("Por favor ingrese los nuevos valores");
				String fechaEnv = VV.leerString("Fecha nueva de envasado:");
				String fechaVen = VV.leerString("Fecha nueva de vencimiento:");
				String newLote = VV.leerString("Nuevo lote:");
				String newPais = VV.leerString("Nuevo país:");
				DB.Modificar(target, fechaEnv, fechaVen, newLote, newPais);
				break;
			}else {
				VV.mostrarInfo("No se encontró el producto");
				break;
			}
		case "Buscar":
			String nLote = "";
			String fVencimiento = "";
			
			String busqueda = VV.leerString("¿Va a buscar por numero de lote o por fecha de vencimiento? (lote | fecha)");
			
			try { //Por si presiona cancelar
				Producto response = null;
			switch(busqueda) {
			
			case "lote":
				nLote = VV.leerString("Cuál es el número de lote del producto");
				response = DB.BuscarPorLote(nLote);
				if(response == null) {
					VV.mostrarInfo("Lo sentimos, no encontramos el producto");
					break;
				}else {
					VV.mostrarInfo(response.toString());
					break;
				}
			case "fecha": //Fecha podría retornar más de un elemento
				fVencimiento = VV.leerString("Cuál es la fecha de vencimiento del producto");
				ArrayList<Producto> responseArray = DB.BuscarPorFecha(fVencimiento);
				if(responseArray.size() == 0) { //Si el array llegó vacío, es porque no encontró nada en la base de datos
					VV.mostrarInfo("Lo sentimos, no encontramos el producto");
					break;
				}else {
					VV.mostrarInfo("Se encontraron varios productos");
					for(Producto y : responseArray) { //Mostrar el toString de producto por producto
						VV.mostrarInfo(y.toString());
					}
					break;
				}
			default:
				VV.mostrarInfo("Error, ingrese de esta forma: lote/fecha");
				break;	
			}
			}catch(NullPointerException ex) {
				break;
			}
			break;
		case "Salir":
			VV.mostrarInfo("Software realizado por:\nAndrés Beltrán\nMauricio Beltrán\nJohann Toncon");
			System.exit(0);
			break;
		}
		
	}

}
