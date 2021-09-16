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
@Table(name="Usuarios")
public class Usuarios 
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cusuario;
	
	@Column(name="nnombreusuario" ,nullable = false ,length = 60)
	private String nnombreusuario;
	
	@Column(name="ccontrasenausuario" ,nullable = false ,length = 25)
	private String ccontrasenausuario;
	
	@Column(name="tcorreousuario" ,nullable = false ,length = 60)
	private String tcorreousuario;
	
	@Column(name="cdniusuario" ,nullable = false ,length = 8)
	private int cdniusuario;
	
	@ManyToOne
	@JoinColumn(name="tipousuario" ,nullable = false)
	private TipoUsuario tipousuario;
	
	@ManyToOne
	@JoinColumn(name="cargo" ,nullable = true)
	private Cargo cargo;
	
	@ManyToOne
	@JoinColumn(name="servicio" ,nullable = true)
	private Servicio servicio;
	
	@ManyToOne
	@JoinColumn(name="ubicacion" ,nullable = true)
	private Ubicacion ubicacion;
	
	//CONSTRUCTORS FROM SUPERCLASS
	public Usuarios() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	//CONSTRUCTORS USING FIELDS
	public Usuarios(int cusuario, String nnombreusuario, String ccontrasenausuario, String tcorreousuario,
			int cdniusuario, TipoUsuario tipousuario, Cargo cargo, Servicio servicio, Ubicacion ubicacion) 
	{
		super();
		this.cusuario = cusuario;
		this.nnombreusuario = nnombreusuario;
		this.ccontrasenausuario = ccontrasenausuario;
		this.tcorreousuario = tcorreousuario;
		this.cdniusuario = cdniusuario;
		this.tipousuario = tipousuario;
		this.cargo = cargo;
		this.servicio = servicio;
		this.ubicacion = ubicacion;
	}


	//GETTERS AND SETTERS
	public int getCusuario() {
		return cusuario;
	}

	public void setCusuario(int cusuario) {
		this.cusuario = cusuario;
	}

	public String getNnombreusuario() {
		return nnombreusuario;
	}

	public void setNnombreusuario(String nnombreusuario) {
		this.nnombreusuario = nnombreusuario;
	}

	public String getCcontrasenausuario() {
		return ccontrasenausuario;
	}

	public void setCcontrasenausuario(String ccontrasenausuario) {
		this.ccontrasenausuario = ccontrasenausuario;
	}

	public String getTcorreousuario() {
		return tcorreousuario;
	}

	public void setTcorreousuario(String tcorreousuario) {
		this.tcorreousuario = tcorreousuario;
	}

	public int getCdniusuario() {
		return cdniusuario;
	}

	public void setCdniusuario(int cdniusuario) {
		this.cdniusuario = cdniusuario;
	}

	public TipoUsuario getTipousuario() {
		return tipousuario;
	}

	public void setTipousuario(TipoUsuario tipousuario) {
		this.tipousuario = tipousuario;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public Servicio getServicio() {
		return servicio;
	}

	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}

	public Ubicacion getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(Ubicacion ubicacion) {
		this.ubicacion = ubicacion;
	}
	
}
