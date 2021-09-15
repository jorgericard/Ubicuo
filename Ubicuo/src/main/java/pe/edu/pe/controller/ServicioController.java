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
	private ITipoServicioService tisservice;
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
		this.servicio=new Servicio();
		this.listaservicio=new ArrayList<Servicio>();
		this.tiposervicio=new TipoServicio();
		this.listatiposervicio=new ArrayList<TipoServicio>();
		this.distrito=new Distrito();
		this.listadistrito=new ArrayList<Distrito>();
		
	}
	
	//METODOS PERSONALIZADOS
	
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
