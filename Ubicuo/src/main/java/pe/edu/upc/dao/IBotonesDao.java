package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entities.Botones;

public interface IBotonesDao 
{
	public void insert(Botones bo);
	
	public List<Botones> list();
	
}
