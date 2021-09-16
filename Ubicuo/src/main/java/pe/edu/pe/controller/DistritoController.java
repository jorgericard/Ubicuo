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
	List<Distrito> listadistrito;
	
	//CONSTRUCTOR
	@PostConstruct
	public void init()
	{
		distrito=new Distrito();
		listadistrito=new ArrayList<Distrito>();
	}
	
	//METODOS PERSONALIZADOS
	public String newDistrito() 
	{
        this.setDistrito(new Distrito());
        return "vaccination.xhtml";
    }

    public void insert() 
    {
        diservice.insert(distrito);
        list();
    }

    public void list() 
    {
        listadistrito = diservice.list();
    }
    
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
