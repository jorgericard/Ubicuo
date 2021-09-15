package pe.edu.pe.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import pe.edu.upc.entities.Botones;
import pe.edu.upc.entities.Estados;
import pe.edu.upc.entities.Usuarios;
import pe.edu.upc.service.IBotonesService;
import pe.edu.upc.service.IUsuariosService;

@Named
@RequestScoped
public class BotonesController 
{
	private IBotonesService boservice;
	private IUsuariosService seservice;
	
	//ATRIBUTOS
	private Botones botones;
	private List<Botones> listabotones;
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
		this.botones=new Botones();
		this.listabotones=new ArrayList<Botones>();
		this.emisor=new Usuarios();
		this.listareceptor=new ArrayList<Usuarios>();
		this.receptor=new Usuarios();
		this.listareceptor=new ArrayList<Usuarios>();
		this.estados=new Estados();
		this.listaestados=new ArrayList<Estados>();
	}
	
	//METODOS PERSONALIZADOS
	
	//GETTERS AND SETTERS
	public Botones getBotones() {
		return botones;
	}
	public void setBotones(Botones botones) {
		this.botones = botones;
	}

	public List<Botones> getListabotones() {
		return listabotones;
	}
	public void setListabotones(List<Botones> listabotones) {
		this.listabotones = listabotones;
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
