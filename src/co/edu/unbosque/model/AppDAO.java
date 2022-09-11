package co.edu.unbosque.model;

import java.util.ArrayList;

public interface AppDAO {
	void Agregar(Producto x);
	Boolean Eliminar(String noLote);
	void Modificar(String noLote);
	Producto BuscarPorLote(String noLote);
	ArrayList<Producto> BuscarPorFecha(String noLote);
}
