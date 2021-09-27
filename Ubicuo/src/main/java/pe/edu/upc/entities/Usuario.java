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
@Table(name="Usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cUsuario;
	
	@Column(name="nombreApellido",nullable=false, length=45)
	private String nombreApellido;
	@Column(name="contraseña",nullable=false, length=45)
	private String contraseña;
	@Column(name="correo",nullable=false, length=45)
	private String correo;
	@Column(name="dni",nullable=false, length=45)
	private String dni;
	
	@ManyToOne
	@JoinColumn(name="cUbicacion",nullable=false)
	private Ubicacion ubicacion;
	
	@ManyToOne
	@JoinColumn(name="cservicio" ,nullable = true)
	private Servicio servicio;
	
	@ManyToOne
	@JoinColumn(name="ccargo",nullable=true)
	private Cargo cargo;
	
	@ManyToOne
	@JoinColumn(name="ctipousuario",nullable=false)
	private TipoUsuario tipousuario;
	
	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Usuario(int cUsuario, String nombreApellido, String contraseña, String correo, String dni,
			Ubicacion ubicacion, Servicio servicio, Cargo cargo, TipoUsuario tipousuario) {
		super();
		this.cUsuario = cUsuario;
		this.nombreApellido = nombreApellido;
		this.contraseña = contraseña;
		this.correo = correo;
		this.dni = dni;
		this.ubicacion = ubicacion;
		this.servicio = servicio;
		this.cargo = cargo;
		this.tipousuario = tipousuario;
	}

	public int getcUsuario() {
		return cUsuario;
	}

	public void setcUsuario(int cUsuario) {
		this.cUsuario = cUsuario;
	}

	public String getNombreApellido() {
		return nombreApellido;
	}

	public void setNombreApellido(String nombreApellido) {
		this.nombreApellido = nombreApellido;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public Ubicacion getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(Ubicacion ubicacion) {
		this.ubicacion = ubicacion;
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

	public Servicio getServicio() {
		return servicio;
	}

	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cUsuario;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (cUsuario != other.cUsuario)
			return false;

		return true;
	}
	
	
	
}
