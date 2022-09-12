package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

/**
 * <h2>PProductos</h2>
 * En esta clase se encuentra el panel que contiene la información de cantidad de cada producto.
 * Cada label está instanciado en el constructor y configurado en funcionar().
 * Todos los labels tienen el mismo estilo.
 * Gracias a los setters y getters se logran modificar los valores de las cantidades, cuando se agrega
 * o elimina un producto.  
 * 
 * @author Mauricio Beltrán
 *
 */

public class PProductos extends JPanel{

	private JLabel LMain;
	private JLabel LFrescos;
	private JLabel LFrescosValue; //Valor de los frescos (Variable)
	private JLabel LRefrigerados;
	private JLabel LRefrigeradosValue; //Valor de refrigerados (Variable)
	private JLabel LCongelados;
	private JLabel LCongeladosValue; //Valor de congelados (Variable)
	
	
	public PProductos() {
		
		setLayout(null);
		LMain = new JLabel("Inventario de productos");
		LFrescos = new JLabel("Frescos: ");
		LFrescosValue = new JLabel("0");
		LRefrigerados = new JLabel("Refrigerados: ");
		LRefrigeradosValue = new JLabel("0");
		LCongelados = new JLabel("Congelados: ");
		LCongeladosValue = new JLabel("0");
		funcionar();
		setVisible(true);
		
	}
	
	public void funcionar() {
		
		//Título
		LMain.setBounds(90, 20, 400, 30);
		LMain.setFont(new Font("Serif", Font.BOLD, 24));
		LMain.setForeground(Color.WHITE);
		add(LMain);
		
		//Frescos
		LFrescos.setBounds(40, 70, 300, 30);
		LFrescos.setFont(new Font("Serif", Font.BOLD, 24));
		LFrescos.setForeground(Color.WHITE);
		add(LFrescos);
		
		//FrescosValue
		LFrescosValue.setBounds(140, 72, 100, 30);
		LFrescosValue.setFont(new Font("Serif", Font.BOLD, 24));
		LFrescosValue.setForeground(Color.WHITE);
		add(LFrescosValue);
		
		//Refrigerados
		LRefrigerados.setBounds(40, 150, 300, 30);
		LRefrigerados.setFont(new Font("Serif", Font.BOLD, 24));
		LRefrigerados.setForeground(Color.WHITE);
		add(LRefrigerados);
		
		//RefrigeradosValue
		LRefrigeradosValue.setBounds(200, 152, 300, 30);
		LRefrigeradosValue.setFont(new Font("Serif", Font.BOLD, 24));
		LRefrigeradosValue.setForeground(Color.WHITE);
		add(LRefrigeradosValue);
		
		//Congelados
		LCongelados.setBounds(40, 240, 300, 30);
		LCongelados.setFont(new Font("Serif", Font.BOLD, 24));
		LCongelados.setForeground(Color.WHITE);
		add(LCongelados);
		
		//CongeladosValue
		LCongeladosValue.setBounds(190, 242, 300, 30);
		LCongeladosValue.setFont(new Font("Serif", Font.BOLD, 24));
		LCongeladosValue.setForeground(Color.WHITE);
		add(LCongeladosValue);
		
	}
	
	//Getters y setters de sólo los value

	public int getLFrescosValue() {
		return Integer.parseInt(LFrescosValue.getText());
	}

	public void setLFrescosValue(String operacion, int x) {
		operacion = operacion.toLowerCase();
		if(operacion.equals("sumar")) {
			int newValue = Integer.parseInt(LFrescosValue.getText()) + x;
			String castedValue = newValue + "";
			LFrescosValue.setText(castedValue);
		}
		else {
			int newValue = Integer.parseInt(LFrescosValue.getText()) - x;
			String castedValue = newValue + "";
			LFrescosValue.setText(castedValue);
		}
		
	}

	public int getLRefrigeradosValue() {
		return Integer.parseInt(LRefrigeradosValue.getText());
	}

	public void setLRefrigeradosValue(String operacion, int x) {
		operacion = operacion.toLowerCase();
		if(operacion.equals("sumar")) {
			int newValue = Integer.parseInt(LRefrigeradosValue.getText()) + x;
			String castedValue = newValue + "";
			LRefrigeradosValue.setText(castedValue);
		}
		else {
			int newValue = Integer.parseInt(LRefrigeradosValue.getText()) - x;
			String castedValue = newValue + "";
			LRefrigeradosValue.setText(castedValue);
		}
	}

	public int getLCongeladosValue() {
		return Integer.parseInt(LCongeladosValue.getText());
	}

	public void setLCongeladosValue(String operacion, int x) {
		operacion = operacion.toLowerCase();
		if(operacion.equals("sumar")) {
			int newValue = Integer.parseInt(LCongeladosValue.getText()) + x;
			String castedValue = newValue + "";
			LCongeladosValue.setText(castedValue);
		}
		else {
			int newValue = Integer.parseInt(LCongeladosValue.getText()) - x;
			String castedValue = newValue + "";
			LCongeladosValue.setText(castedValue);
		}
	}

}
