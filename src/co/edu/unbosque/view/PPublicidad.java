package co.edu.unbosque.view;

import java.awt.Color;

import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * <h2>PPublicidad</h2>
 * Información de contacto, las imágenes están almacenadas en la carpeta del proyecto. 
 * @author Mauricio Beltrán
 *
 */

public class PPublicidad extends JPanel{
	
	private JLabel instagram;
	private JLabel telefono;
	private JLabel adicion;
	
	//Para poner las imagenes ahí
	private JLabel imagenIG;
	private JLabel imagenTel;
	private JLabel imagenAdicion;

	//Acá se traen las imagenes 
	private ImageIcon IIInstagram;
	private ImageIcon IITel;
	private ImageIcon IIAdicion;
	
	public PPublicidad() {
		
		setLayout(null);
		funcionar();
		setVisible(true);
		
	}
	
	public void funcionar() {
		setBackground(Color.orange);
		
		//Imagen instagram
		IIInstagram = new ImageIcon("InstagramBN.PNG");
		imagenIG = new JLabel();
		imagenIG.setIcon(new ImageIcon(IIInstagram.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH)));
		imagenIG.setBounds(60, 90, 30, 30);
		add(imagenIG);
		
		//Etiqueta instagram
		instagram = new JLabel("@agroalimentos chochal");
		instagram.setBounds(7, 105, 200, 50);
		add(instagram);
		
		//Imagen telefono
		IITel = new ImageIcon("Telefono.PNG");
		imagenTel = new JLabel();
		imagenTel.setIcon(new ImageIcon(IITel.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH)));
		imagenTel.setBounds(60, 150, 30, 30);
		add(imagenTel);
		
		//Etiqueta telefono
		telefono = new JLabel("Tel: 3504165311");
		telefono.setBounds(30, 165, 120, 50);
		add(telefono);
		
		//Imagen adicion
		IIAdicion = new ImageIcon("AdicionBN.PNG");
		imagenAdicion = new JLabel();
		imagenAdicion.setIcon(new ImageIcon(IIAdicion.getImage().getScaledInstance(130, 130, Image.SCALE_SMOOTH)));
		imagenAdicion.setBounds(10, 260, 130, 130);
		add(imagenAdicion);
		
		//Etiqueta adicion
		adicion = new JLabel("¡Siempre para servirles!");
		adicion.setBounds(7, 225, 190, 50);
		add(adicion);
	}

}
