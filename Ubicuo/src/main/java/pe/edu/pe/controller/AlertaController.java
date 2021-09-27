package pe.edu.pe.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Alerta;
import pe.edu.upc.entities.Estados;
import pe.edu.upc.entities.Usuario;
import pe.edu.upc.service.IAlertaService;
import pe.edu.upc.service.IEstadosService;
import pe.edu.upc.service.IUsuarioService;

@Named
@RequestScoped
public class AlertaController 
{
	@Inject
	private IAlertaService alservice;
	@Inject
	private IUsuarioService useservice;
	@Inject
	private IUsuarioService usrservice;
	@Inject
	private IEstadosService seestados;
	
	//ATRIBUTOS
	private Alerta alerta;
	private List<Alerta> listaalerta;
	
	private Usuario emisor;
	private List<Usuario> listaremisor;
	
	private Usuario receptor;
	private List<Usuario> listareceptor;
	
	private Estados estados;
	private List<Estados> listaestados;
	
	//CONSTRUCTOR
	@PostConstruct
	public void init()
	{
		alerta=new Alerta();
		listaalerta=new ArrayList<Alerta>();
		emisor=new Usuario();
		listaremisor=new ArrayList<Usuario>();
		receptor=new Usuario();
		listareceptor=new ArrayList<Usuario>();
		estados=new Estados();
		listaestados=new ArrayList<Estados>();
		list_alerta();
		list_usuario_emisor();
		list_usuario_reseptor();
		list_estado();
		
	}
	
	//METODOS PERSONALIZADOS
	public String newAlerta()
	{
		this.setAlerta(new Alerta());
        return "alerta.xhtml";
	}
	
	public String modifpre(Alerta al)
	{
		this.setAlerta(al);
		return "AlertaMod.xhtml";
	}
	
	public void insert()
	{
		try 
    	{
			alservice.insert(alerta);
            list_alerta();
		} 
    	catch (Exception e) 
    	{
    		e.getMessage();
		}
	}
	
	public void eliminar(Alerta idal)
	{
		try 
    	{
			alservice.eliminar(idal.getCalerta());
			list_alerta();
		} 
    	catch (Exception e) 
    	{
    		e.getMessage();
		}
	}
	
	public void modificar()
	{
		try 
    	{
			alservice.modificar(this.alerta);;
    		this.list_alerta();
		} 
    	catch (Exception e) 
    	{
    		e.getMessage();
		}
	}
	
	public void list_usuario_emisor()
	{
		listaremisor=useservice.list();
	}
	
	public void list_usuario_reseptor()
	{
		listareceptor=usrservice.list();
	}
	
	public void list_alerta()
	{
		listaalerta=alservice.list();
	}
	
	public void list_estado()
	{
		listaestados=seestados.list();
	}
	

	
	//GETTERS AND SETTERS
	public IAlertaService getAlservice() {
		return alservice;
	}
	public void setAlservice(IAlertaService alservice) {
		this.alservice = alservice;
	}
	public IUsuarioService getUseservice() {
		return useservice;
	}
	public void setUseservice(IUsuarioService useservice) {
		this.useservice = useservice;
	}
	public IUsuarioService getUsrservice() {
		return usrservice;
	}
	public void setUsrservice(IUsuarioService usrservice) {
		this.usrservice = usrservice;
	}
	public IEstadosService getSeestados() {
		return seestados;
	}
	public void setSeestados(IEstadosService seestados) {
		this.seestados = seestados;
	}
	public Alerta getAlerta() {
		return alerta;
	}
	public void setAlerta(Alerta alerta) {
		this.alerta = alerta;
	}
	public List<Alerta> getListaalerta() {
		return listaalerta;
	}
	public void setListaalerta(List<Alerta> listaalerta) {
		this.listaalerta = listaalerta;
	}
	public Usuario getEmisor() {
		return emisor;
	}
	public void setEmisor(Usuario emisor) {
		this.emisor = emisor;
	}
	public List<Usuario> getListaremisor() {
		return listaremisor;
	}
	public void setListaremisor(List<Usuario> listaremisor) {
		this.listaremisor = listaremisor;
	}
	public Usuario getReceptor() {
		return receptor;
	}
	public void setReceptor(Usuario receptor) {
		this.receptor = receptor;
	}
	public List<Usuario> getListareceptor() {
		return listareceptor;
	}
	public void setListareceptor(List<Usuario> listareceptor) {
		this.listareceptor = listareceptor;
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
