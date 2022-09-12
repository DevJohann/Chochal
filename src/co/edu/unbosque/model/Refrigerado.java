package co.edu.unbosque.model;

/**
 * 
 * @author CryptedSec Team
 *
 */

public class Refrigerado extends Producto{
	
	protected String codInvima;
	protected String temperatura;

	public Refrigerado(String fechaVencimiento, String lote, String fechaEnvasado, 
			String pais, String codInvima, String temperatura) {
		super(fechaVencimiento, lote, fechaEnvasado, pais);
		this.codInvima = codInvima;
		this.temperatura = temperatura;
	}

	public String getCodInvima() {
		return codInvima;
	}

	public void setCodInvima(String codInvima) {
		this.codInvima = codInvima;
	}

	public String getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(String temperatura) {
		this.temperatura = temperatura;
	}

	@Override
	public String toString() {
		return super.toString() + "\nCodigo Invima: " + codInvima + 
				"\nTemperatura: " + temperatura + 
				"\nCategoría: Refrigerado"; 
				
	}

}
