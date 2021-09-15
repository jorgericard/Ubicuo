package pe.edu.pe.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Distrito;
import pe.edu.upc.service.IDistritoService;

@Named
@RequestScoped
public class DistritoController 
{
	@Inject
	private IDistritoService diservice;
	
	//ATRIBUTOS
	private Distrito distrito;
	private List<Distrito> listadistrito;
	
	//CONSTRUCTOR
	@PostConstruct
	public void init()
	{
		this.distrito=new Distrito();
		this.listadistrito=new ArrayList<Distrito>();
	}
	
	//METODOS PERSONALIZADOS
	
	//GETTERS AND SETTERS
	public Distrito getDistrito() {
		return distrito;
	}
	public void setDistrito(Distrito distrito) {
		this.distrito = distrito;
	}

	public List<Distrito> getListadistrito() {
		return listadistrito;
	}
	public void setListadistrito(List<Distrito> listadistrito) {
		this.listadistrito = listadistrito;
	}
	
}
