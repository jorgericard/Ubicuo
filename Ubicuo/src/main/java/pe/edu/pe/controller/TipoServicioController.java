package pe.edu.pe.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import pe.edu.upc.entities.TipoServicio;
import pe.edu.upc.service.ITipoServicioService;

@Named
@RequestScoped
public class TipoServicioController 
{
	private ITipoServicioService tisservice;
	
	//ATRIBUTOS
	private TipoServicio tiposervicio;
	private List<TipoServicio> listatiposervicio;
	
	//CONSTRUCTOR
	@PostConstruct
	public void init()
	{
		this.tiposervicio=new TipoServicio();
		this.listatiposervicio=new ArrayList<TipoServicio>();
	}
	
	//METODOS PERSONALIZADOS
	
	//GETTERS AND SETTERS
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
	
}
