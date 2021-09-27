package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entities.Alerta;

public interface IAlertaService 
{
	public void insert(Alerta al);
	
	List<Alerta> list();
	
}
