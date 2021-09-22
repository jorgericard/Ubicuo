package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entities.Distrito;

public interface IDistritoService
{
	public void insert(Distrito di);
	
	public void eliminar(int cDistrito);
	
	List<Distrito> list();
	
	public void modificar(Distrito distrito);
	
	public List<Distrito> findByNameDistrito(Distrito dis);
}
