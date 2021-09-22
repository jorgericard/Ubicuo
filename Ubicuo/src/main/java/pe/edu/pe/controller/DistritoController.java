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
		list();
	}
	
	//METODOS PERSONALIZADOS
	public String newDistrito() {
		this.setDistrito(new Distrito());
		return "distrito.xhtml";
	}
	
	public void insert() {
		diservice.insert(distrito);
		list();
	}
	public void eliminar(Distrito distrito) {
		try {
			diservice.eliminar(distrito.getCDistrito());
			list();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	
	public void list() {
		// TODO Auto-generated method stub
		listadistrito= diservice.list();
	}
	public void clean() {
		this.init();
	}
	public void findByName() {
		try {
			if (distrito.getNombredistrito().isEmpty()) {
				this.list();
			} else {
				listadistrito=this.diservice.findByNameDistrito(this.getDistrito());
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.getMessage();
		}
	}
	//Modificar
	public void modificar() {
		try {
			diservice.modificar(distrito);
		} catch (Exception e) {
			// TODO: handle exception
			e.getMessage();
		}
	}
	public String Modifpre(Distrito distrito) {
		this.setDistrito(distrito);
		return "distritoMod.xhtml";
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
