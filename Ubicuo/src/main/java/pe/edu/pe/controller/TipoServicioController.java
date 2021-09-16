package pe.edu.pe.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.TipoServicio;
import pe.edu.upc.service.ITipoServicioService;

@Named
@RequestScoped
public class TipoServicioController 
{
	@Inject
	private ITipoServicioService tisservice;
	
	//ATRIBUTOS
	private TipoServicio tiposervicio;
	List<TipoServicio> listatiposervicio;
	
	//CONSTRUCTOR
	@PostConstruct
	public void init()
	{
		tiposervicio=new TipoServicio();
		listatiposervicio=new ArrayList<TipoServicio>();
		list();
	}
	
	//METODOS PERSONALIZADOS
	public String newTipoServicio() 
	{
        this.setTiposervicio(new TipoServicio());
        return "vaccination.xhtml";
    }

    public void insert() 
    {
        tisservice.insert(tiposervicio);
        list();
    }

    public void list() 
    {
        listatiposervicio = tisservice.list();
    }
    
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
