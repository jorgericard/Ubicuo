package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entities.Alerta;

public interface IAlertaDao 
{
	public void insert(Alerta al);
	
	public List<Alerta> list();
	
}
