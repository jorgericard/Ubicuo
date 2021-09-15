package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entities.Distrito;

public interface IDistritoService
{
	public void insert(Distrito di);
	
	public List<Distrito> list();
}
