package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entities.Servicio;

public interface IServicioDao 
{
	public void insert(Servicio se);
	
	public List<Servicio> list();
}
