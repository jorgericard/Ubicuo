package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entities.Estados;

public interface IEstadosService 
{
	public void insert(Estados es);
	
	List<Estados> list();
	
	public void eliminar(int Cestados);
	
	public List<Estados> finByNameEstados(Estados es);
}
