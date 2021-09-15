package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entities.Botones;

public interface IBotonesService 
{
	public void insert(Botones bo);
	
	public List<Botones> list();
	
}
