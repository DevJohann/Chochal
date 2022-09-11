package co.edu.unbosque.model;

public class CongeladoAgua extends Congelado{
	
	private String salinidadAgua;

	
	public CongeladoAgua(String fechaVencimiento, String lote, String fechaEnvasado, String pais, String codInvima,
			String temperatura, String salinidadAgua) {
		super(fechaVencimiento, lote, fechaEnvasado, pais, codInvima, temperatura);
		this.salinidadAgua = salinidadAgua;
	}

	public String getSalinidadAgua() {
		return salinidadAgua;
	}

	public void setSalinidadAgua(String salinidadAgua) {
		this.salinidadAgua = salinidadAgua;
	}

	@Override
	public String toString() {
		return super.toString() + 
				"\nSalinidad del agua: " + salinidadAgua +
				"\nSubcategoría: Congelado agua";
	}
	

}
