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

/**<h2>Controller</h2>
 * Esta clase sirve para ser un pasamanos entre el paquete de modelo
 * (model) y el paquete de vista (view). En esta clase se maneja todo
 * lo que son los listeners de los botones (del JFrame y de los JPanels)
 * mediante ActionListener.
 * 
 * <b>Notas:</b> Estan presentes objetos de las clases: VistaPrincipal
 * (vistaPrincipal), VistaVentana (VV), DataBase (DB).
 * Cabe aclarar que la que llamamos DB es una base de datos local y
 * sencilla que almacena datos en un ArrayList.
 * VistaPrincipal contiene el JFrame en donde se ubican los demas paneles.
 * VistaVentana es la clase de donde se coordinan las ventanas emergentes.
 * 
 * @author CryptedSec Team
 * @see ActionListener
 *
 */

public class Controller implements ActionListener{
	
	VistaPrincipal vistaPrincipal; //JFrame
	VistaVentana VV; //Ventana emergente
	
	DataBase DB; //Base de datos, donde está el ArrayList que almacena los productos
	
	/**
	 * Usamos el constructor para instanciar las clases que seran
	 * necesarias para el manejo del GUI y la base de datos.
	 * 
	 */
	
	public Controller() {
		vistaPrincipal = new VistaPrincipal();
		VV = new VistaVentana();
		DB = new DataBase();
		
		asignarOyentes();
	}
	
	/**
	 * Este metodo lo que hace es agregar los ActionListener a cada
	 * uno de los botones del panel PBotones del paquete vista,
	 * gracias al objeto de vistaPrincipal.
	 * 
	 */
	
	public void asignarOyentes() {
		vistaPrincipal.getpBotones().getbAgregar().addActionListener(this);
		vistaPrincipal.getpBotones().getbEliminar().addActionListener(this);
		vistaPrincipal.getpBotones().getbModificar().addActionListener(this); //Listeners
		vistaPrincipal.getpBotones().getbBuscar().addActionListener(this);
		vistaPrincipal.getpBotones().getbSalir().addActionListener(this);
	}
	
	/**
	 * actionPerformed
	 * 
	 * Sobrescribimos el metodo actionPerformed que viene de la interfaz
	 * de ActionListener, dentro del cual se analiza cual de todos los botones
	 * fue presionado y asi poder mandar a actuar al modelo segun sea necesario.
	 * Es necesario aclarar que cada boton de pBotones tiene un ActionCommand 
	 * asignado, con lo que nos podemos valer para saber distinguir entre uno
	 * y otro (e.getActionCommand).
	 * 
	 * <b>Notas:</b>
	 * Usamos el manejo de excepciones para cuando por ejemplo, el usuario decide
	 * no continuar con el proceso luego de haber presionando un boton, presionando
	 * cancelar en la ventana emergente.
	 * Las variables "var_*" son usadas para almacenar los datos recogidos en las 
	 * ventanas emergentes. 
	 * Hay switch dentro de otros switch debido a que luego de presionar un boton,
	 * hay varias opciones disponibles, por ejemplo luego de elegir agregar, debemos
	 * saber cual producto de los antes mencionados quiere agregar.
	 * 
	 * <p><ul>
	 *	<li>
	 * Boton agregar:
	 * En el apartado del boton agregar, para cada uno de los productos, se recogen
	 * los datos pertinentes para la creacion del mismo, se valida que el lote no
	 * este repetido, se crea el objeto y se añade a la base de datos, y posteriormente
	 * se suma 1 al valor que se muestra en la ventana principal (pProductos) del
	 * respectivo producto.
	 * </li>
	 * <li>
	 * Boton eliminar:
	 * En el apartado del boton de eliminar, se busca el producto a eliminar mediante
	 * el lote unico, y en tal caso de no encontrarse, se lanza la excepcion y se muestra
	 * el mensaje de error, igual al presionar cancelar o ingresar caracteres no esperados.
	 * Si el producto existe, se ubicara en la base de datos y se eliminara, gracias a las
	 * acciones de la base de datos implementadas desde el DAO (Patron DAO).
	 * </li>
	 * <li>
	 * Boton modificar:
	 * Se ubicara el producto a buscar, y si existe, se le preguntara por los nuevos datos para
	 * remplazar, si no, o si se ingresan caracteres no esperados, mostrara que no se encontro
	 * el producto.
	 * </li>
	 * <li>  
	 * Boton buscar:
	 * Para buscar un producto se tienen dos opciones, por lote o por fecha de vencimiento. En los
	 * dos casos, se buscara el producto objetivo en la base de datos, y si existe, se mostrara
	 * el metodo toString() del producto. Si no existe (la base de datos retorna null), entonces
	 * se muestra el mensaje de que no se encontro el producto.
	 * Para el caso de buscar por fecha de vencimiento, hay la probabilidad de que se encuentre mas
	 * de un producto, para ello se guardan todas las coincidencias que encuentre la base de datos
	 * en un ArrayList, y posteriormente, mediante un for each, se mostrara el toString() de cada uno.
	 * </li> 
	 */

	@Override
	public void actionPerformed(ActionEvent e) {
		
		switch(e.getActionCommand()) { //Cada boton tiene un ActionCommand configurado
		case "Agregar":
			String dato = VV.leerString("Agregar producto congelado, fresco o refrigerado");
			//System.out.println(dato); DEBUG
			String var_a = "";
			String var_b = "";
			String var_c = "";
			String var_d = "";
			String var_f = ""; //Variables que recogeran el valor de los text fields de las ventanas emergentes
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
					}else { //Si no esta duplicado, continuar
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
			try {
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
			}catch(NullPointerException ex) {
				VV.mostrarInfo("Error");
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
			case "fecha": //Fecha podria retornar mas de un elemento
				fVencimiento = VV.leerString("Cuál es la fecha de vencimiento del producto");
				ArrayList<Producto> responseArray = DB.BuscarPorFecha(fVencimiento);
				if(responseArray.size() == 0) { //Si el array llego vacio, es porque no encontro nada en la base de datos
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
