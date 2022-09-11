package co.edu.unbosque.model;

public class CongeladoNitrogeno extends Congelado{
	
	private String metodoCongelacion;
	private String tiempoExposicionNitrogeno;

	public CongeladoNitrogeno(String fechaVencimiento, String lote, String fechaEnvasado, String pais, String codInvima,
			String temperatura, String metodoCongelacion, String tiempoExposicionNitrogeno) {
		super(fechaVencimiento, lote, fechaEnvasado, pais, codInvima, temperatura);
		this.metodoCongelacion = metodoCongelacion;
		this.tiempoExposicionNitrogeno = tiempoExposicionNitrogeno;
	}
	
	public String getMetodoCongelacion() {
		return metodoCongelacion;
	}

	public void setMetodoCongelacion(String metodoCongelacion) {
		this.metodoCongelacion = metodoCongelacion;
	}

	public String getTiempoExposicionNitrogeno() {
		return tiempoExposicionNitrogeno;
	}

	public void setTiempoExposicionNitrogeno(String tiempoExposicionNitrogeno) {
		this.tiempoExposicionNitrogeno = tiempoExposicionNitrogeno;
	}

	@Override
	public String toString() {
		return super.toString() + 
				"\nMétodo Congelacion: " + metodoCongelacion + 
				"\ntiempo de exposicion de nitrógeno: " + tiempoExposicionNitrogeno +
				"\nSubcategoría: Congelado nitrógeno";
	}

}
