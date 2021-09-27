package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entities.TipoUsuario;

public interface ITipoUsuarioService 
{
	public void insert(TipoUsuario tiu);
	
	public void delete(int ctipousuario);
	
	public void update(TipoUsuario tipousuario);
	
	List<TipoUsuario> list();
}