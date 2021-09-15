package pe.edu.pe.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import pe.edu.upc.entities.ListaContactos;
import pe.edu.upc.entities.Usuarios;
import pe.edu.upc.service.IListaContactosService;
import pe.edu.upc.service.IUsuariosService;

@Named
@RequestScoped
public class ListaContactosController 
{
	private IListaContactosService licservice;
	private IUsuariosService usservice;
	
	//ATRIBUTOS
	private ListaContactos listacontactos;
	private List<ListaContactos> listalistacontactos;
	private Usuarios usuarios;
	private List<Usuarios> listausuarios;
	
	//CONSTRUCTOR
	@PostConstruct
	public void init()
	{
		this.listacontactos=new ListaContactos();
		this.listalistacontactos=new ArrayList<ListaContactos>();
		this.usuarios=new Usuarios();
		this.listausuarios=new ArrayList<Usuarios>();
	}
	
	//METODOS PERSONALIZADOS
	
	//GETTERS AND SETTERS
	public ListaContactos getListacontactos() {
		return listacontactos;
	}
	public void setListacontactos(ListaContactos listacontactos) {
		this.listacontactos = listacontactos;
	}

	public List<ListaContactos> getListalistacontactos() {
		return listalistacontactos;
	}
	public void setListalistacontactos(List<ListaContactos> listalistacontactos) {
		this.listalistacontactos = listalistacontactos;
	}

	public Usuarios getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(Usuarios usuarios) {
		this.usuarios = usuarios;
	}

	public List<Usuarios> getListausuarios() {
		return listausuarios;
	}
	public void setListausuarios(List<Usuarios> listausuarios) {
		this.listausuarios = listausuarios;
	}
	
}
