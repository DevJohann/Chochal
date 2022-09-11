package co.edu.unbosque.model;

import java.util.ArrayList;

public class DataBase implements AppDAO{
	
	private ArrayList<Producto> DataBase = new ArrayList<>();

	@Override
	public void Agregar(Producto x) {
		DataBase.add(x);
		
	}

	@Override
	public Boolean Eliminar(String noLote) {
		for(Producto x : DataBase) {
			if(x.getLote().equals(noLote)) {
				DataBase.remove(x);
				return true;
			}
		}
		return false;
		
	}

	@Override
	public void Modificar(String noLote) {
		// TODO Auto-generated method stub
		
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
