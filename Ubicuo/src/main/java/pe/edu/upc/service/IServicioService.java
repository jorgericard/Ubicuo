package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entities.Servicio;

public interface IServicioService 
{
	public void insert(Servicio se);
	
	public List<Servicio> list();
}
