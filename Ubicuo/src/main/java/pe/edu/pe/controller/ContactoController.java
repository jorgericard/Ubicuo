package pe.edu.pe.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Contacto;
import pe.edu.upc.entities.Usuarios;
import pe.edu.upc.service.IContactoService;
import pe.edu.upc.service.IUsuariosService;

@Named
@RequestScoped
public class ContactoController 
{
	@Inject
	private IContactoService licservice;
	private IUsuariosService usservice;
	
	//ATRIBUTOS
	private Contacto contacto;
	private List<Contacto> listacontacto;
	private Usuarios usuarios;
	private List<Usuarios> listausuarios;
	
	//CONSTRUCTOR
	@PostConstruct
	public void init()
	{
		this.contacto=new Contacto();
		this.listacontacto=new ArrayList<Contacto>();
		this.usuarios=new Usuarios();
		this.listausuarios=new ArrayList<Usuarios>();
	}
	
	//METODOS PERSONALIZADOS
	
	//GETTERS AND SETTERS
	public Contacto getListacontactos() {
		return contacto;
	}
	public void setListacontactos(Contacto listacontactos) {
		this.contacto = listacontactos;
	}

	public List<Contacto> getListalistacontactos() {
		return listacontacto;
	}
	public void setListalistacontactos(List<Contacto> listalistacontactos) {
		this.listacontacto = listalistacontactos;
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
