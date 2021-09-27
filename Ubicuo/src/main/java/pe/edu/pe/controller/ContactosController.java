package pe.edu.pe.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Contactos;
import pe.edu.upc.entities.Usuario;
import pe.edu.upc.service.IContactosService;
import pe.edu.upc.service.IUsuarioService;

@Named
@RequestScoped
public class ContactosController {
	
	@Inject
	private IContactosService cService;
	
	@Inject 
	private IUsuarioService uService;
	
	//ATRIBUTOS
	private Contactos contactos;
	private List<Contactos> listaContactos;
	Usuario usuario;
	List<Usuario> listaUsuarios;
	
	@PostConstruct
	public void init() {
		this.contactos=new Contactos();
		this.usuario=new Usuario();
		this.listaContactos= new ArrayList<Contactos>();
		this.listaUsuarios= new ArrayList<Usuario>();
		this.listContactos();
		this.listUsuarios();
	}
	//METODOS PERSONALIZADOSA
	public String newContactos() {
		this.setContactos(new Contactos());
		this.listContactos();
		this.listUsuarios();
		return "contactos.xhtml";
	}
	public void insert() {
		cService.insert(contactos);
		this.listContactos();
	}
	public void eliminar(Contactos contactos) {
		try {
			cService.eliminar(contactos.getcContactos());
			listContactos();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	
	
	public void listContactos() {
		listaContactos= cService.list();
	}
	public void listUsuarios() {
		listaUsuarios= uService.list();
	}
	//Modificar
	public void modificar() {
		try {
			cService.modificar(contactos);
		} catch (Exception e) {
			// TODO: handle exception
			e.getMessage();
		}
	}
	public String Modifpre(Contactos contactos) {
		this.setContactos(contactos);
		return "contactosMod.xhtml";
	}
	
	//GET & SET
	public Contactos getContactos() {
		return contactos;
	}
	public void setContactos(Contactos contactos) {
		this.contactos = contactos;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public List<Contactos> getListaContactos() {
		return listaContactos;
	}
	public void setListaContactos(List<Contactos> listaContactos) {
		this.listaContactos = listaContactos;
	}
	public List<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}
	public void setListaUsuarios(List<Usuario> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}

}
