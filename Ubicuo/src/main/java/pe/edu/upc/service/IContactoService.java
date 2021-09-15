package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entities.Contacto;

public interface IContactoService 
{
	public void insert(Contacto co);
	
	public List<Contacto> list();
}
