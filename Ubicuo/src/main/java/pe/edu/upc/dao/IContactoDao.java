package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entities.Contacto;

public interface IContactoDao 
{
	public void insert(Contacto co);
	
	public List<Contacto> list();
}
