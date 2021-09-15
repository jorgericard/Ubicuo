package pe.edu.pe.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import pe.edu.upc.entities.Cargo;
import pe.edu.upc.service.ICargoService;

@Named
@RequestScoped
public class CargoController 
{
	private ICargoService caservice;
	
	//ATRIBUTOS
	private Cargo cargo;
	private List<Cargo> listacargo;
	
	//CONSTRUCTOR
	@PostConstruct
	public void init()
	{
		this.cargo=new Cargo();
		this.listacargo=new ArrayList<Cargo>();
	}
	
	//METODOS PERSONALIZADOS
	
	//GETTERS AND SETTERS
	public Cargo getCargo() {
		return cargo;
	}
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public List<Cargo> getListacargo() {
		return listacargo;
	}
	public void setListacargo(List<Cargo> listacargo) {
		this.listacargo = listacargo;
	}
	
}
