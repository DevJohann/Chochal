package co.edu.unbosque.model;

import java.util.ArrayList;

public interface AppDAO {
	void Agregar(Producto x);
	String Eliminar(String noLote);
	void Modificar(Producto x, String a, String b, String c, String d);
	Producto BuscarPorLote(String noLote);
	ArrayList<Producto> BuscarPorFecha(String noLote);
}
