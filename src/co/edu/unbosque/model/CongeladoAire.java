package co.edu.unbosque.model;

public class CongeladoAire extends Congelado{
	
	private String porcentajeNitrogeno; 
	private String porcentajeOxigeno;
	private String porcentajeCO2;
	private String porcentajeVaporAgua;

	public CongeladoAire(String fechaVencimiento, String lote, String fechaEnvasado, String pais, String codInvima,
			String temperatura, String porcentajeNitrogeno, String porcentajeOxigeno, String porcentajeCO2, String porcentajeVaporAgua) {
		super(fechaVencimiento, lote, fechaEnvasado, pais, codInvima, temperatura);
		this.porcentajeNitrogeno = porcentajeNitrogeno;
		this.porcentajeOxigeno = porcentajeOxigeno;
		this.porcentajeCO2 = porcentajeCO2;
		this.porcentajeVaporAgua = porcentajeVaporAgua;
	}

	public String getPorcentajeNitrogeno() {
		return porcentajeNitrogeno;
	}

	public void setPorcentajeNitrogeno(String porcentajeNitrogeno) {
		this.porcentajeNitrogeno = porcentajeNitrogeno;
	}

	public String getPorcentajeOxigeno() {
		return porcentajeOxigeno;
	}

	public void setPorcentajeOxigeno(String porcentajeOxigeno) {
		this.porcentajeOxigeno = porcentajeOxigeno;
	}

	public String getPorcentajeCO2() {
		return porcentajeCO2;
	}

	public void setPorcentajeCO2(String porcentajeCO2) {
		this.porcentajeCO2 = porcentajeCO2;
	}

	public String getPorcentajeVaporAgua() {
		return porcentajeVaporAgua;
	}

	public void setPorcentajeVaporAgua(String porcentajeVaporAgua) {
		this.porcentajeVaporAgua = porcentajeVaporAgua;
	}

	@Override
	public String toString() {
		return super.toString() +
				"\nPorcentaje de nitrogeno: " + porcentajeNitrogeno + 
				"\nPorcentaje de oxigeno: " + porcentajeOxigeno + 
				"\nPorcentaje de CO2: " + porcentajeCO2 + 
				"\nPorcentaje vapor de agua: " + porcentajeVaporAgua;
	}

}
