package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entities.Estados;

public interface IEstadosDao 
{
	public void insert(Estados es);
	
	public List<Estados> list();
	
	public void eliminar(int Cestados);
	
	public List<Estados> finByNameEstados(Estados es);
}
