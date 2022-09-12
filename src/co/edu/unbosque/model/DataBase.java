package co.edu.unbosque.model;

import java.util.ArrayList;

/**
 * <h2>DataBase</h2>
 * La base de datos es un ArrayList que almacena los productos.
 * Tiene funcionalidades implementadas del AppDAO (Interfaces, abstracción y sobrescritura).
 * @author CryptedSec Team
 *
 */

public class DataBase implements AppDAO{
	
	private ArrayList<Producto> DataBase = new ArrayList<>();

	@Override
	public void Agregar(Producto x) {
		DataBase.add(x);
		
	}

	@Override
	public String Eliminar(String noLote) {
		String res = null;
		for(Producto x : DataBase) {
			if(x.getLote().equals(noLote)) {
				DataBase.remove(x);
				res = x.getClass().getSimpleName(); //Retornar el tipo para saber a cual producto restarle 1 en pProductos
				return res;
				//return true;
			}
		}
		return res;
		//return false;
		
	}

	@Override
	public void Modificar(Producto target, String fechaEnv, String fechaVen, String newLote, String newPais) {
		target.setFechaEnvasado(fechaEnv);
		target.setFechaVencimiento(fechaVen);
		target.setLote(newLote);
		target.setPais(newPais);
		
	}

	@Override
	public Producto BuscarPorLote(String noLote) {
		Producto res = null;
		for(Producto x : DataBase) {
			if(x.getLote().equals(noLote)){
				res = x;
				return res;
			}
		}
		return res;
		
	}

	@Override
	public ArrayList<Producto> BuscarPorFecha(String fechaBuscada) { //Fecha de vencimiento
		ArrayList<Producto> returnableData = new ArrayList<>(); //Arraylist para guardar todas las posibles coincidencias
		//Producto returnableData = null;
		for(Producto x : DataBase) {
			if(x.getFechaVencimiento().equals(fechaBuscada)) {
				returnableData.add(x);
			}
		}
		return returnableData;
		
	}

}
