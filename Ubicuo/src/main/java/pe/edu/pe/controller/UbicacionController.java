package pe.edu.pe.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Ubicacion;
import pe.edu.upc.service.IUbicacionService;

@Named
@RequestScoped
public class UbicacionController 
{
	@Inject
	private IUbicacionService ubservice;
	
	//ATRIBUTOS
	private Ubicacion ubicacion; 
	List<Ubicacion> listaubicacion;
	
	//CONSTRUCTOR
	@PostConstruct
	public void init()
	{
		ubicacion=new Ubicacion();
		listaubicacion=new ArrayList<Ubicacion>();
		list();
	}
	
	//METODOS PERSONALIZADOS
	public String newUbicacion() 
	{
        this.setUbicacion(new Ubicacion());
        return "ubicacion.xhtml";
    }

    public void insert() 
    {
        ubservice.insert(ubicacion);
        list();
    }

    public void list() 
    {
        listaubicacion = ubservice.list();
    }
    public void clean() {
		this.init();
	}
    
    public void eliminar(Ubicacion ubicacion) {
    	try {
			ubservice.eliminar(ubicacion.getCUbicacion());
			list();
		} catch (Exception e) {
			// TODO: handle exception
			e.getMessage();
		}
    }
    //modificar
    public void modificar() {
    	try {
			ubservice.modificar(ubicacion);
			list();
		} catch (Exception e) {
			// TODO: handle exception
			e.getMessage();
		}
    }
    public String Modifpre(Ubicacion ubicacion) {
    	this.setUbicacion(ubicacion);
    	return "ubicacionMod.xhtml";
    }

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
