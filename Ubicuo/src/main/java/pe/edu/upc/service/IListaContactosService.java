package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entities.ListaContactos;

public interface IListaContactosService 
{
	public void insert(ListaContactos li);
	
	public List<ListaContactos> list();
}
