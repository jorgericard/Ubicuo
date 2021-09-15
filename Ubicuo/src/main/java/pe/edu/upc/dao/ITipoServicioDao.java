package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entities.TipoServicio;

public interface ITipoServicioDao 
{
	public void insert(TipoServicio tis);
	
	public List<TipoServicio> list();
}
