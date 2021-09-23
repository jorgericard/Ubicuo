package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entities.Servicio;

public interface IServicioService 
{
public void insert(Servicio se);
	
	public void eliminar(int idse);
	
	public void modificar(Servicio se);
	
	public List<Servicio> list();
}
