package co.edu.unbosque.view;

import javax.swing.JOptionPane;

/**
 * <h2>VistaVentana</h2>
 * Aqui se crean y configuran las ventanas emergentes.
 * Las hay para mostrar informacion util, y para solicitar datos.
 * Se usan al presionar un boton.
 * 
 * @author Mauricio Beltran
 *
 */

public class VistaVentana {//Clase de herramientas JOptionPane 
	
	public VistaVentana() {
		
	}
	
	//Metodo para mostrar ventana emergente de informacion
	public void mostrarInfo(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje, "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
	}
	
	//Metodo para pedir datos tipo String
	public String leerString(String mensaje) {
		String dato = null;
		try {
			dato = JOptionPane.showInputDialog(mensaje);
			dato = dato.toLowerCase(); //Para poderlo analizar sin tener en cuenta como lo haya escrito el usuario
		}catch(NullPointerException e) {
			return dato;
		}
		return dato;
		
		
		

	}
	
	//Metodo para pedir datos tipo int
	public int leerInt(String mensaje) {
		String aux = JOptionPane.showInputDialog(mensaje);
		int dato = Integer.parseInt(aux);
		return dato;
	}

}
