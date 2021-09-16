package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entities.TipoServicio;

public interface ITipoServicioService 
{
	public void insert(TipoServicio tis);
	
	List<TipoServicio> list();
}
