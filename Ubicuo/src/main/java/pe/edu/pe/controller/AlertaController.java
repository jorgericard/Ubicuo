package pe.edu.pe.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Alerta;
import pe.edu.upc.entities.Estados;
import pe.edu.upc.entities.Usuarios;
import pe.edu.upc.service.IAlertaService;
import pe.edu.upc.service.IUsuariosService;

@Named
@RequestScoped
public class AlertaController 
{
	@Inject
	private IAlertaService boservice;
	private IUsuariosService seservice;
	
	//ATRIBUTOS
	private Alerta alerta;
	private List<Alerta> listaalerta;
	private Usuarios emisor;
	private List<Usuarios> listareceptor;
	private Usuarios receptor;
	private List<Usuarios> listareceptores;
	private Estados estados;
	private List<Estados> listaestados;

	//CONSTRUCTOR
	@PostConstruct
	public void init()
	{
		this.alerta=new Alerta();
		this.listaalerta=new ArrayList<Alerta>();
		this.emisor=new Usuarios();
		this.listareceptor=new ArrayList<Usuarios>();
		this.receptor=new Usuarios();
		this.listareceptor=new ArrayList<Usuarios>();
		this.estados=new Estados();
		this.listaestados=new ArrayList<Estados>();
	}
	
	//METODOS PERSONALIZADOS
	
	//GETTERS AND SETTERS
	public Alerta getBotones() {
		return alerta;
	}
	public void setBotones(Alerta botones) {
		this.alerta = botones;
	}

	public List<Alerta> getListabotones() {
		return listaalerta;
	}
	public void setListabotones(List<Alerta> listabotones) {
		this.listaalerta = listabotones;
	}

	public Usuarios getEmisor() {
		return emisor;
	}
	public void setEmisor(Usuarios emisor) {
		this.emisor = emisor;
	}

	public List<Usuarios> getListareceptor() {
		return listareceptor;
	}
	public void setListareceptor(List<Usuarios> listareceptor) {
		this.listareceptor = listareceptor;
	}

	public Usuarios getReceptor() {
		return receptor;
	}
	public void setReceptor(Usuarios receptor) {
		this.receptor = receptor;
	}

	public List<Usuarios> getListareceptores() {
		return listareceptores;
	}
	public void setListareceptores(List<Usuarios> listareceptores) {
		this.listareceptores = listareceptores;
	}

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
