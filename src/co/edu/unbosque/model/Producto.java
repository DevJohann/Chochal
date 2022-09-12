package co.edu.unbosque.model;

/**
 * <h2>Producto<h2>
 * Los productos principales heredan de esta clase.
 * @author CryptedSec Team
 *
 */

public class Producto {
	
	protected String fechaVencimiento;
	protected String lote;
	protected String fechaEnvasado;
	protected String pais;
	
	public Producto(String fechaVencimiento, String lote, String fechaEnvasado, String pais) {
		this.fechaVencimiento = fechaVencimiento;
		this.lote = lote;
		this.fechaEnvasado = fechaEnvasado;
		this.pais = pais;
	}

	public String getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(String fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public String getLote() {
		return lote;
	}

	public void setLote(String lote) {
		this.lote = lote;
	}

	public String getFechaEnvasado() {
		return fechaEnvasado;
	}

	public void setFechaEnvasado(String fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	@Override
	public String toString() {
		return "Fecha de vencimiento: " + fechaVencimiento + 
				"\nLote: " + lote + 
				"\nFecha de envasado: " + fechaEnvasado + 
				"\nPais: " + pais;
	}

}
