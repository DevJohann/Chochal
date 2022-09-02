package co.edu.unbosque.model;

public class CongeladoAire extends Congelado{
	
	private int porcentajeNitrogeno; 
	private int porcentajeOxigeno;
	private int porcentajeCO2;
	private int porcentajeVaporAgua;

	public CongeladoAire(String fechaVencimiento, String lote, String fechaEnvasado, String pais, String codInvima,
			int temperatura, int porcentajeNitrogeno, int porcentajeOxigeno, int porcentajeCO2, int porcentajeVaporAgua) {
		super(fechaVencimiento, lote, fechaEnvasado, pais, codInvima, temperatura);
		this.porcentajeNitrogeno = porcentajeNitrogeno;
		this.porcentajeOxigeno = porcentajeOxigeno;
		this.porcentajeCO2 = porcentajeCO2;
		this.porcentajeVaporAgua = porcentajeVaporAgua;
	}

	public int getPorcentajeNitrogeno() {
		return porcentajeNitrogeno;
	}

	public void setPorcentajeNitrogeno(int porcentajeNitrogeno) {
		this.porcentajeNitrogeno = porcentajeNitrogeno;
	}

	public int getPorcentajeOxigeno() {
		return porcentajeOxigeno;
	}

	public void setPorcentajeOxigeno(int porcentajeOxigeno) {
		this.porcentajeOxigeno = porcentajeOxigeno;
	}

	public int getPorcentajeCO2() {
		return porcentajeCO2;
	}

	public void setPorcentajeCO2(int porcentajeCO2) {
		this.porcentajeCO2 = porcentajeCO2;
	}

	public int getPorcentajeVaporAgua() {
		return porcentajeVaporAgua;
	}

	public void setPorcentajeVaporAgua(int porcentajeVaporAgua) {
		this.porcentajeVaporAgua = porcentajeVaporAgua;
	}

	@Override
	public String toString() {
		return super.toString() +
				"\nPorcentaje de nitrogeno: " + porcentajeNitrogeno + 
				"\nporcentaje de oxigeno: " + porcentajeOxigeno + 
				"\nporcentaje de CO2: " + porcentajeCO2 + 
				"\nporcentaje vapor de agua: " + porcentajeVaporAgua;
	}

}
