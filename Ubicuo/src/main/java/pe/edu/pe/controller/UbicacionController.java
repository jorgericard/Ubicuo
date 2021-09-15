package pe.edu.pe.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import pe.edu.upc.entities.Ubicacion;
import pe.edu.upc.service.IUbicacionService;

@Named
@RequestScoped
public class UbicacionController 
{
	private IUbicacionService ubservice;
	
	//ATRIBUTOS
	private Ubicacion ubicacion; 
	private List<Ubicacion> listaubicacion;
	
	//CONSTRUCTOR
	@PostConstruct
	public void init()
	{
		this.ubicacion=new Ubicacion();
		this.listaubicacion=new ArrayList<Ubicacion>();
	}
	
	//METODOS PERSONALIZADOS
	

	//GETTERS AND SETTERS
	public Ubicacion getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(Ubicacion ubicacion) {
		this.ubicacion = ubicacion;
	}

	public List<Ubicacion> getListaubicacion() {
		return listaubicacion;
	}
	public void setListaubicacion(List<Ubicacion> listaubicacion) {
		this.listaubicacion = listaubicacion;
	}
	
}
