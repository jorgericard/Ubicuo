package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entities.Alerta;

public interface IAlertaService 
{
	public void insert(Alerta al);
	
	public void eliminar(int idal);
	
	public void modificar(Alerta al);
	
	public List<Alerta> list();
	
}
