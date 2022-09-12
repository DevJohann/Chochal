package co.edu.unbosque.model;

import java.util.ArrayList;

/**
 * <h2>AppDAO</h2>
 * <p>
 * Haciendo uso del patrón DAO, creamos una interfaz con todas las
 * funcionalidades que tendrá la base de datos, mencionadas en el
 * documento de requerimientos.
 * </p>
 * 
 * @author CryptedSec Team
 * @see Patrón DAO
 */

public interface AppDAO {
	void Agregar(Producto x);
	String Eliminar(String noLote);
	void Modificar(Producto x, String a, String b, String c, String d);
	Producto BuscarPorLote(String noLote);
	ArrayList<Producto> BuscarPorFecha(String noLote);
}
