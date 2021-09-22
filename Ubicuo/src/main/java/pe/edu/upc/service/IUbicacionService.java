package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entities.Ubicacion;

public interface IUbicacionService 
{
	public void insert(Ubicacion ub);
	
	List<Ubicacion> list();
	public void eliminar(int cUbicacion);
	
	public void modificar(Ubicacion ubicacion);
	
	public List<Ubicacion> findByIdUbicacion(Ubicacion ubi);
}
