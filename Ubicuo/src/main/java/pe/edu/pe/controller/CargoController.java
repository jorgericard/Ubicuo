package pe.edu.pe.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Cargo;
import pe.edu.upc.service.ICargoService;

@Named
@RequestScoped
public class CargoController 
{
	@Inject
	private ICargoService caservice;
	
	//ATRIBUTOS
	private Cargo cargo;
	List<Cargo> listacargo;
	
	//CONSTRUCTOR
	@PostConstruct
	public void init()
	{
		cargo=new Cargo();
		listacargo=new ArrayList<Cargo>();
		list();
	}
	
	//METODOS PERSONALIZADOS
	public String newCargo() 
	{
        this.setCargo(new Cargo());
        return "vaccination.xhtml";
    }

    public void insert() 
    {
        caservice.insert(cargo);
        list();
    }

    public void list() 
    {
        listacargo = caservice.list();
    }
    
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
