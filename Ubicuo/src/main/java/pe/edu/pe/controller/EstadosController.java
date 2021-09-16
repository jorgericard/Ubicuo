package pe.edu.pe.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Estados;
import pe.edu.upc.service.IEstadosService;

@Named
@RequestScoped
public class EstadosController 
{
	@Inject
	private IEstadosService esservice;
	
	//ATRIBUTOS
	private Estados estados;
	private List<Estados> listaestados;
	
	//CONSTRUCTOR
	@PostConstruct
	public void init()
	{
		this.estados=new Estados();
		this.listaestados=new ArrayList<Estados>();
	}
	
	//METODOS PERSONALIZADOS
	public String newEstado() 
	{
        this.setEstados(new Estados());
        return "vaccination.xhtml";
    }

    public void insert() 
    {
        esservice.insert(estados);
        list();
    }

    public void list() 
    {
        listaestados = esservice.list();
    }
    
	//GETTERS AND SETTERS
	public Estados getEstados() {
		return estados;
	}
	public void setEstados(Estados estados) {
		this.estados = estados;
	}

	public List<Estados> getListaestados() {
		return listaestados;
	}
	public void setListaestados(List<Estados> listaestados) {
		this.listaestados = listaestados;
	}
	
}
