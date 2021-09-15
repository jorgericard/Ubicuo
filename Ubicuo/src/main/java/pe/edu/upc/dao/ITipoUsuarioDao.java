package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entities.TipoUsuario;

public interface ITipoUsuarioDao 
{
	public void insert(TipoUsuario tiu);
	
	public List<TipoUsuario> list();
}
