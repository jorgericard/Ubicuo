package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entities.Cargo;

public interface ICargoService 
{
	public void insert(Cargo ca);
	
	public List<Cargo> list();
	
}
