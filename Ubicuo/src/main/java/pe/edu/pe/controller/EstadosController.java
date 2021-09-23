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
public class EstadosController {
	@Inject
	private IEstadosService esservice;

	// ATRIBUTOS
	private Estados estados;
	List<Estados> listaestados;

	// CONSTRUCTOR
	@PostConstruct
	public void init() {
		estados = new Estados();
		listaestados = new ArrayList<Estados>();
		list();
	}

	// METODOS PERSONALIZADOS
	public String newEstado() {
		this.setEstados(new Estados());
		return "estados.xhtml";
	}

	public void insert() {
		esservice.insert(estados);
		list();
	}

	public void list() {
		listaestados = esservice.list();
	}
	
	public void clean() {
		this.init();
	}

	public void update() {
		try {
			esservice.update(estados);
		} catch (Exception e) {
			// TODO: handle exception
			e.getMessage();
		}
	}
	
	public String updateEstados(Estados es) {
		this.setEstados(es);
		return "estadosUpdate.xhtml";
	}
	
	public void eliminar(Estados estados) {
		try {
			esservice.eliminar(estados.getCestados());
			this.list();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void findByName() {
		try {
			if (estados.getNnombreestados().isEmpty()) {
				this.list();
			} else {

				listaestados = this.esservice.finByNameEstados(this.getEstados());
			}
		} catch (Exception e) {
			e.getMessage();
		}
	}

	// GETTERS AND SETTERS
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
