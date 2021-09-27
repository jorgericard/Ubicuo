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
	private IUsuarioService uaservice;
	
	@Inject
	private IUsuarioService urservice;
	
	@Inject
	private IEstadosService esservice;
	
	//ATRIBUTOS
	private Alerta alerta;
	private List<Alerta> listaalerta;
	private Usuario auxiliado;
	private List<Usuario> listaauxiliado;
	private Usuario rescatista;
	private List<Usuario> listarescatista;
	private Estados estados;
	private List<Estados> listaestados;

	//CONSTRUCTOR
	@PostConstruct
	public void init()
	{
		this.alerta=new Alerta();
		this.listaalerta=new ArrayList<Alerta>();
		this.auxiliado=new Usuario();
		this.listaauxiliado=new ArrayList<Usuario>();
		this.rescatista=new Usuario();
		this.listarescatista=new ArrayList<Usuario>();
		this.estados=new Estados();
		this.listaestados=new ArrayList<Estados>();
		this.list();
		this.listUsuarioauxiliado();
		this.listUsuariorescatista();
		this.listEstados();
	}

	//METODOS PERSONALIZADOS
	public String newAlerta() {
		this.setAlerta(new Alerta());
		return "Alerta.xhtml";
	}

	public void insert() {
		alservice.insert(alerta);
		list();
	}

	public void list() {
		listaalerta = alservice.list();
	}
	
	public void listUsuarioauxiliado() {
		listaauxiliado = uaservice.list();
	}
	
	public void listUsuariorescatista() {
		listarescatista = urservice.list();
	}
	
	public void listEstados() {
		listaestados = esservice.list();
	}
	
	//GETTERS AND SETTERS
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

	public Usuario getAuxiliado() {
		return auxiliado;
	}

	public void setAuxiliado(Usuario auxiliado) {
		this.auxiliado = auxiliado;
	}

	public List<Usuario> getListaauxiliado() {
		return listaauxiliado;
	}

	public void setListaauxiliado(List<Usuario> listaauxiliado) {
		this.listaauxiliado = listaauxiliado;
	}

	public Usuario getRescatista() {
		return rescatista;
	}

	public void setRescatista(Usuario rescatista) {
		this.rescatista = rescatista;
	}

	public List<Usuario> getListarescatista() {
		return listarescatista;
	}

	public void setListarescatista(List<Usuario> listarescatista) {
		this.listarescatista = listarescatista;
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
