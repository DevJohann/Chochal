package co.edu.unbosque.view;

import javax.swing.JOptionPane;

public class VistaVentana {//Clase de herramientas JOptionPane 
	
	public VistaVentana() {
		
	}
	
	//Método para mostrar ventana emergente de información
	public void mostrarInfo(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje, "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
	}
	
	//Método para pedir datos tipo String
	public String leerString(String mensaje) {
		String dato = null;
		try {
			dato = JOptionPane.showInputDialog(mensaje);
			dato = dato.toLowerCase(); //Para poderlo analizar sin tener en cuenta cómo lo haya escrito el usuario
		}catch(NullPointerException e) {
			return dato;
		}
		return dato;
		
		
		

	}
	
	//Método para pedir datos tipo int
	public int leerInt(String mensaje) {
		String aux = JOptionPane.showInputDialog(mensaje);
		int dato = Integer.parseInt(aux);
		return dato;
	}

}
