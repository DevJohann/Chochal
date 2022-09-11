package co.edu.unbosque.model;

public class Congelado extends Refrigerado{

	public Congelado(String fechaVencimiento, String lote, String fechaEnvasado, String pais, String codInvima,
			String temperatura) {
		super(fechaVencimiento, lote, fechaEnvasado, pais, codInvima, temperatura);
	}

	@Override
	public String toString() {
		return super.toString();
	}
	

}
