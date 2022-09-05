package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class PTitulo extends JPanel{
	
	private JLabel tituloP;
	
	public PTitulo() {
		
		setLayout(null);
		funcionar();
		setVisible(true);
		
	}
	
	public void funcionar() {
		
		
		/*TitledBorder bordeTitulo = new TitledBorder("Agroalimentos el chochal");
		bordeTitulo.setTitleFont(new Font("cooperBlack", 0, 20));
		((TitledBorder) bordeTitulo).setTitleColor(Color.red);
		setBorder(bordeTitulo);*/
		
		setBackground(Color.BLACK);
		tituloP = new JLabel("Agroalimentos el chochal");
		tituloP.setForeground(Color.WHITE);
		tituloP.setBounds(50, 10, 300, 50);
		tituloP.setFont(new Font("CooperBlack", Font.BOLD, 20));
		add(tituloP);

	}

	public JLabel getTituloP() {
		return tituloP;
	}

	public void setTituloP(JLabel tituloP) {
		this.tituloP = tituloP;
	}

}
