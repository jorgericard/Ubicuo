package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entities.Estados;

public interface IEstadosService 
{
	public void insert(Estados es);
	
	public List<Estados> list();
}
