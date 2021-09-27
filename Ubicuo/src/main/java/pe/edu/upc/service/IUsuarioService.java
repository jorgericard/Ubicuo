package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entities.Usuario;

public interface IUsuarioService 
{
	public void insert(Usuario u);

	public void delete(int idUsuario);

	public void update(Usuario u);

	public List<Usuario> list();

}
