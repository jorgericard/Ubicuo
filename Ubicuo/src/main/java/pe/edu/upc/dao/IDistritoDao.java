package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entities.Distrito;

public interface IDistritoDao
{
	public void insert(Distrito di);
	
	public List<Distrito> list();
}
