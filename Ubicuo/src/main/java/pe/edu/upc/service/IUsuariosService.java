package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entities.Usuarios;

public interface IUsuariosService 
{
	public void insert(Usuarios us);
	
	public List<Usuarios> list();
}
