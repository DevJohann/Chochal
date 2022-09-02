package co.edu.unbosque.model;

public class CongeladoNitrogeno extends Congelado{
	
	private String metodoCongelacion;
	private int tiempoExposicionNitrogeno;

	public CongeladoNitrogeno(String fechaVencimiento, String lote, String fechaEnvasado, String pais, String codInvima,
			int temperatura, String metodoCongelacion, int tiempoExposicionNitrogeno) {
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

	public int getTiempoExposicionNitrogeno() {
		return tiempoExposicionNitrogeno;
	}

	public void setTiempoExposicionNitrogeno(int tiempoExposicionNitrogeno) {
		this.tiempoExposicionNitrogeno = tiempoExposicionNitrogeno;
	}

	@Override
	public String toString() {
		return super.toString() + 
				"\nMétodo Congelacion: " + metodoCongelacion + 
				"\ntiempo de exposicion de nitrogeno: " + tiempoExposicionNitrogeno;
	}

}
