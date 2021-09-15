package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entities.Cargo;

public interface ICargoDao 
{
	public void insert(Cargo ca);
	
	public List<Cargo> list();
	
}
