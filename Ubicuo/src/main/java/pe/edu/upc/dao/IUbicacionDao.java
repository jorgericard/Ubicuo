package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entities.Ubicacion;

public interface IUbicacionDao 
{
	public void insert(Ubicacion ub);
	
	public List<Ubicacion> list();
	
	public void eliminar(int cUbicacion);
	
	public void modificar(Ubicacion ubicacion);
	
	public List<Ubicacion> findByIdUbicacion(Ubicacion ubi);
}
