package pe.edu.pe.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Distrito;
import pe.edu.upc.entities.Servicio;
import pe.edu.upc.entities.TipoServicio;
import pe.edu.upc.service.IDistritoService;
import pe.edu.upc.service.IServicioService;
import pe.edu.upc.service.ITipoServicioService;

@Named
@RequestScoped
public class ServicioController 
{
	@Inject
	private IServicioService seservice;
	@Inject
	private ITipoServicioService tisservice;
	@Inject
	private IDistritoService diservice;

	//ATRIBUTOS
	private Servicio servicio;
	private List<Servicio> listaservicio;
	private TipoServicio tiposervicio;
	private List<TipoServicio> listatiposervicio;
	private Distrito distrito;
	private List<Distrito> listadistrito;
	
	//CONSTRUCTOR
	@PostConstruct
	public void init()
	{
		servicio=new Servicio();
		listaservicio=new ArrayList<Servicio>();
		tiposervicio=new TipoServicio();
		listatiposervicio=new ArrayList<TipoServicio>();
		distrito=new Distrito();
		listadistrito=new ArrayList<Distrito>();
		list_servicio();
		list_distrito();
		list_tiposervicio();
		
	}
	
	//METODOS PERSONALIZADOS
	public String newServicio()
	{
		this.setServicio(new Servicio());
		return "servicio.xhtml";
	}
	
	public String modifpre(Servicio se)
	{
		this.setServicio(se);
		return "ServicioMod.xhtml";
	}
	
	public void insert()
	{
		try 
    	{
			seservice.insert(servicio);
			list_servicio();
		} 
    	catch (Exception e) 
    	{
    		e.getMessage();
		}
	}
	
	public void eliminar(Servicio idse)
	{
		try 
    	{
			seservice.eliminar(idse.getCservicio());
			list_servicio();
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
			seservice.modificar(this.servicio);;
    		this.list_servicio();
		} 
    	catch (Exception e) 
    	{
    		e.getMessage();
		}
	}
	
	public void list_servicio() 
    {
		listaservicio = seservice.list();
    }
	
	public void list_distrito()
	{
		listadistrito=diservice.list();
	}
	
	public void list_tiposervicio()
	{
		listatiposervicio=tisservice.list();
	}
	
	//GETTERS AND SETTERS
	public Servicio getServicio() {
		return servicio;
	}
	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}

	public List<Servicio> getListaservicio() {
		return listaservicio;
	}
	public void setListaservicio(List<Servicio> listaservicio) {
		this.listaservicio = listaservicio;
	}

	public TipoServicio getTiposervicio() {
		return tiposervicio;
	}
	public void setTiposervicio(TipoServicio tiposervicio) {
		this.tiposervicio = tiposervicio;
	}

	public List<TipoServicio> getListatiposervicio() {
		return listatiposervicio;
	}
	public void setListatiposervicio(List<TipoServicio> listatiposervicio) {
		this.listatiposervicio = listatiposervicio;
	}

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
