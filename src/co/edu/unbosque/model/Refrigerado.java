package co.edu.unbosque.model;

public class Refrigerado extends Producto{
	
	protected String codInvima;
	protected int temperatura;

	public Refrigerado(String fechaVencimiento, String lote, String fechaEnvasado, 
			String pais, String codInvima, int temperatura) {
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

	public int getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}

	@Override
	public String toString() {
		return super.toString() + "\nCodigo Invima: " + codInvima + 
				"\ntemperatura:" + temperatura; 
				
	}

}
