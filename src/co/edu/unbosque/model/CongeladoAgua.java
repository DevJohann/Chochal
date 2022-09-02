package co.edu.unbosque.model;

public class CongeladoAgua extends Congelado{
	
	private int salinidadAgua;

	
	public CongeladoAgua(String fechaVencimiento, String lote, String fechaEnvasado, String pais, String codInvima,
			int temperatura, int salinidadAgua) {
		super(fechaVencimiento, lote, fechaEnvasado, pais, codInvima, temperatura);
		this.salinidadAgua = salinidadAgua;
	}

	public int getSalinidadAgua() {
		return salinidadAgua;
	}

	public void setSalinidadAgua(int salinidadAgua) {
		this.salinidadAgua = salinidadAgua;
	}

	@Override
	public String toString() {
		return super.toString() + 
				"\nSalinidad de agua: " + salinidadAgua;
	}
	

}
