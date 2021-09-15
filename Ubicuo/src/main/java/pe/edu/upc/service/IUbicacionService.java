package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entities.Ubicacion;

public interface IUbicacionService 
{
	public void insert(Ubicacion ub);
	
	public List<Ubicacion> list();
}
