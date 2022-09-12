package co.edu.unbosque.controller;

/**
 * 
 * <h1><b>Agroalimentos El Chochal</b></h1>
 * Un software hecho para la administracion de productos
 * de la tienda, divididos en 3 categorias: Congelados,
 * frescos y refrigerados.
 * Presenta 5 botones con funcionalidades utiles para 
 * el que este encargado de la tarea, al presionar alguno
 * saldran ventanas emergentes que funcionaran para el
 * ingreso y la salida de datos.
 * <p>
 * <b>Notas:</b> 
 * El programa ingresa productos uno por
 * uno, asi que es practico para inventarios no muy
 * grandes.
 * El programa no cuenta con una base de datos persistente,
 * por lo que cerrar el programa eliminara la informacion
 * guardada.
 * La modificacion de productos solo se puede hacer con
 * algunas de sus propiedades.
 * Cada producto ingresado debe tener un unico numero de lote.
 * Se intento poner las fechas con formato, pero debido a la
 * complejidad se resolvio hacerlo con Strings.
 * Se intento realizar la organizacion del GUI con layouts, 
 * pero debido a su complejidad y nuestro poco conocimiento del
 * tema, determinamos hacerlo con setBounds.
 * </p>
 * 
 * @author CryptedSec Team (Mauricio Beltran, Andres Beltran, Johann Toncon)
 * @version 1.0
 *
 */

public class AplMain {
	
	/**
	 * <p>
	 * Punto de entrada a la aplicacion, usado para
	 * crear una nueva instancia de Controller.
	 * </p>
	 * 
	 * @param args
	 * @return nada.
	 */

	public static void main(String[] args) {
		
		Controller controller = new Controller();

	}

}
