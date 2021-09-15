package pe.edu.pe.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Cargo;
import pe.edu.upc.entities.Servicio;
import pe.edu.upc.entities.TipoUsuario;
import pe.edu.upc.entities.Ubicacion;
import pe.edu.upc.entities.Usuarios;
import pe.edu.upc.service.ICargoService;
import pe.edu.upc.service.IServicioService;
import pe.edu.upc.service.ITipoUsuarioService;
import pe.edu.upc.service.IUbicacionService;
import pe.edu.upc.service.IUsuariosService;

@Named
@RequestScoped
public class UsuariosController 
{
	@Inject
	private IUsuariosService usservice;
	private IUbicacionService ubservice;
	private ITipoUsuarioService tiuservice;
	private ICargoService caservice;
	private IServicioService seservice;
	
	//ATRIBUTOS
	private Usuarios usuarios;
	private List<Usuarios> listausuarios;
	private Ubicacion ubicacion;
	private List<Ubicacion> listaubicacion;
	private TipoUsuario tipousuario;
	private List<TipoUsuario> listatipousuario;
	private Cargo cargo;
	private List<Cargo> listacargo;
	private Servicio servicio;
	private List<Servicio> listaservicio;
	
	//METODOS PERSONALIZADOS
	
	//CONSTRUCTOR
	@PostConstruct
	public void init()
	{
		this.usuarios=new Usuarios();
		this.listausuarios=new ArrayList<Usuarios>();
		this.ubicacion=new Ubicacion();
		this.listaubicacion=new ArrayList<Ubicacion>();
		this.tipousuario=new TipoUsuario();
		this.listatipousuario=new ArrayList<TipoUsuario>();
		this.cargo=new Cargo();
		this.listacargo=new ArrayList<Cargo>();
		this.servicio=new Servicio();
		this.listaservicio=new ArrayList<Servicio>();
	}

	//GETTERS AND SETTERS
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

	public Ubicacion getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(Ubicacion ubicacion) {
		this.ubicacion = ubicacion;
	}

	public List<Ubicacion> getListaubicacion() {
		return listaubicacion;
	}
	public void setListaubicacion(List<Ubicacion> listaubicacion) {
		this.listaubicacion = listaubicacion;
	}

	public TipoUsuario getTipousuario() {
		return tipousuario;
	}
	public void setTipousuario(TipoUsuario tipousuario) {
		this.tipousuario = tipousuario;
	}

	public List<TipoUsuario> getListatipousuario() {
		return listatipousuario;
	}
	public void setListatipousuario(List<TipoUsuario> listatipousuario) {
		this.listatipousuario = listatipousuario;
	}

	public Cargo getCargo() {
		return cargo;
	}
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public List<Cargo> getListacargo() {
		return listacargo;
	}
	public void setListacargo(List<Cargo> listacargo) {
		this.listacargo = listacargo;
	}

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
	
}
