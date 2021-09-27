package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entities.Usuario;

public interface IUsuarioDao {

	public void insert(Usuario u);

	public void delete(int idUsuario);

	public void update(Usuario u);

	public List<Usuario> list();

}
