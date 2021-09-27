package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entities.Contactos;

public interface IContactosService {

	public void insert(Contactos c);
	public void eliminar(int cContactos);
	public void modificar(Contactos contactos);

	public List<Contactos> list();

}
