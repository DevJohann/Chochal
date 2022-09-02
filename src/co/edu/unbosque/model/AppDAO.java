package co.edu.unbosque.model;

import java.util.ArrayList;

public interface AppDAO {
	void Agregar(ArrayList<Producto> DB, Producto x);
	void Eliminar(ArrayList<Producto> DB, String noLote);
	void Modificar(ArrayList<Producto> DB, String noLote);
	void BuscarPorLote(ArrayList<Producto> DB, String noLote);
	void BuscarPorFecha(ArrayList<Producto> DB, String noLote);
}
