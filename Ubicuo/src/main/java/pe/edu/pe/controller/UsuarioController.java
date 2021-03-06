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
import pe.edu.upc.entities.Usuario;
import pe.edu.upc.service.ICargoService;
import pe.edu.upc.service.IServicioService;
import pe.edu.upc.service.ITipoUsuarioService;
import pe.edu.upc.service.IUbicacionService;
import pe.edu.upc.service.IUsuarioService;

@Named
@RequestScoped
public class UsuarioController {

	@Inject
	private IUsuarioService uService;

	@Inject
	private ICargoService cService;

	@Inject
	private ITipoUsuarioService tService;

	@Inject
	private IUbicacionService ubService;

	@Inject
	private IServicioService SeService;

	private Usuario usuario;
	private Cargo cargo;
	private TipoUsuario tipousuario;
	private Ubicacion ubicacion;
	private Servicio servicio;
	List<Servicio> listaservicio;
	List<Usuario> listaUsuarios;
	List<Cargo> listaCargos;
	List<TipoUsuario> listaTipoUsuarios;
	List<Ubicacion> listaUbicaciones;

	@PostConstruct
	public void init() {
		this.usuario = new Usuario();
		this.cargo = new Cargo();
		this.servicio = new Servicio();
		this.tipousuario = new TipoUsuario();
		this.ubicacion = new Ubicacion();
		this.listaUsuarios = new ArrayList<Usuario>();
		this.listaCargos = new ArrayList<Cargo>();
		this.listaTipoUsuarios = new ArrayList<TipoUsuario>();
		this.listaUbicaciones = new ArrayList<Ubicacion>();
		this.listaservicio = new ArrayList<Servicio>();
		this.listUsuario();
		this.listCargo();
		this.listTipoUsuario();
		this.listUbicacion();
		this.listServicio();
	}

	public String newUsuario() {
		this.setUsuario(new Usuario());
		this.listCargo();
		this.listTipoUsuario();
		this.listTipoUsuario();
		this.listUbicacion();
		this.listServicio();
		return "usuario.xhtml";
	}

	public void listCargo() {
		listaCargos = cService.list();
	}

	public void listTipoUsuario() {
		listaTipoUsuarios = tService.list();
	}

	public void listServicio() {
		listaservicio = SeService.list();
	}

	public void listUbicacion() {
		listaUbicaciones = ubService.list();
	}

	public void listUsuario() {
		listaUsuarios = uService.list();
	}

	public void insertUsuario() {
		uService.insert(usuario);
		this.listUsuario();
	}
	
	public void delete(Usuario user) {

    	uService.delete(user.getCusuario());
		listUsuario();
	}
    
    public void update() {
    	
    	uService.update(usuario);;
    	listUsuario();
	}
    
    public String updateUser(Usuario user) {
		this.setUsuario(user);;
		return "UsuarioUpdate.xhtml";
	}

	// GETTER SETTER
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public TipoUsuario getTipousuario() {
		return tipousuario;
	}

	public void setTipousuario(TipoUsuario tipousuario) {
		this.tipousuario = tipousuario;
	}

	public Ubicacion getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(Ubicacion ubicacion) {
		this.ubicacion = ubicacion;
	}

	public List<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}

	public void setListaUsuarios(List<Usuario> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}

	public List<Cargo> getListaCargos() {
		return listaCargos;
	}

	public void setListaCargos(List<Cargo> listaCargos) {
		this.listaCargos = listaCargos;
	}

	public List<TipoUsuario> getListaTipoUsuarios() {
		return listaTipoUsuarios;
	}

	public void setListaTipoUsuarios(List<TipoUsuario> listaTipoUsuarios) {
		this.listaTipoUsuarios = listaTipoUsuarios;
	}

	public List<Ubicacion> getListaUbicaciones() {
		return listaUbicaciones;
	}

	public void setListaUbicaciones(List<Ubicacion> listaUbicaciones) {
		this.listaUbicaciones = listaUbicaciones;
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
