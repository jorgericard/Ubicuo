package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entities.ListaContactos;

public interface IListaContactosDao 
{
	public void insert(ListaContactos li);
	
	public List<ListaContactos> list();
}
