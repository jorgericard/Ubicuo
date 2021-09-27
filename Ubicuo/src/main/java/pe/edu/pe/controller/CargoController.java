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
	private String mensaje="error";
	
	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
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
        return "cargo.xhtml";
    }
	
	public String modifpre(Cargo ca)
	{
		this.setCargo(ca);
		return "CargoMod.xhtml";
	}

    public void insert() 
    {
    	try 
    	{
    		caservice.insert(cargo);
            list();
		} 
    	catch (Exception e) 
    	{
    		e.getMessage();
		}
    }
    
    public void eliminar(Cargo idca)
    {
    	try 
    	{
    		caservice.eliminar(idca.getCcargo());
    		list();
		} 
    	catch (Exception e) 
    	{
    		e.getMessage();
		}
    }
    
    public void modificar()
    {
    	try 
    	{
    		caservice.modificar(this.cargo);
    		this.list();
		} 
    	catch (Exception e) 
    	{
    		e.getMessage();
		}
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
