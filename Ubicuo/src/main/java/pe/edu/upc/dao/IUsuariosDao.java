package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entities.Usuarios;

public interface IUsuariosDao 
{
	public void insert(Usuarios us);
	
	public List<Usuarios> list();
}
