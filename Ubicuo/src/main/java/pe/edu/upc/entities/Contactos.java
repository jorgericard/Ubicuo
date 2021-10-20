package pe.edu.upc.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Contactos")

public class Contactos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cContactos;

	@Column(name = "nombre", nullable = false, length = 45)
	private String nombre;

	@Column(name = "numCelular", nullable = false, length = 45)
	private String numCelular;

	@ManyToOne
	@JoinColumn(name = "cUsuario", nullable = false)
	private Usuario usuario;

	public Contactos() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Contactos(int cContactos, String nombre, String numCelular, Usuario usuario) {
		super();
		this.cContactos = cContactos;
		this.nombre = nombre;
		this.numCelular = numCelular;
		this.usuario = usuario;
	}

	public int getcContactos() {
		return cContactos;
	}

	public void setcContactos(int cContactos) {
		this.cContactos = cContactos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumCelular() {
		return numCelular;
	}

	public void setNumCelular(String numCelular) {
		this.numCelular = numCelular;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	
	
	

}
