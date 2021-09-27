package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entities.TipoServicio;

public interface ITipoServicioService 
{
	public void insert(TipoServicio tis);
	
	public void delete(int idTipoServicio);
	
	public void update(TipoServicio tis);
	
	List<TipoServicio> list();
	
	List<TipoServicio> finByNameTipoServicio(TipoServicio tis);
}