package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entities.Cargo;

public interface ICargoDao 
{
	public void insert(Cargo ca);
	
	public void eliminar(int idca);
	
	public void modificar(Cargo ca);
	
	public List<Cargo> list();
	
}
