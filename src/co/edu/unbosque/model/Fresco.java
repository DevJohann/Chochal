package co.edu.unbosque.model;

/**
 * 
 * @author CryptedSec Team
 *
 */

public class Fresco extends Producto{

	public Fresco(String fechaVencimiento, String lote, String fechaEnvasado, String pais) {
		super(fechaVencimiento, lote, fechaEnvasado, pais);
	}

	@Override
	public String toString() {
		return super.toString() + "\nCategoría: Fresco";
	}

	

}
