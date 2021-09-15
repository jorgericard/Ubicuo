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
	private int Cusuario;
	
	@Column(name="Nnombreusuario" ,nullable = false ,length = 60)
	private String Nnombreusuario;
	
	@Column(name="Ccontrasenausuario" ,nullable = false ,length = 25)
	private String Ccontrasenausuario;
	
	@Column(name="Tcorreousuario" ,nullable = false ,length = 60)
	private String Tcorreousuario;
	
	@Column(name="Cdniusuario" ,nullable = false ,length = 8)
	private int Cdniusuario;
	
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
			int cdniusuario, TipoUsuario tipousuario, Cargo cargo, Servicio servicio, Ubicacion ubicacion) {
		super();
		Cusuario = cusuario;
		Nnombreusuario = nnombreusuario;
		Ccontrasenausuario = ccontrasenausuario;
		Tcorreousuario = tcorreousuario;
		Cdniusuario = cdniusuario;
		this.tipousuario = tipousuario;
		this.cargo = cargo;
		this.servicio = servicio;
		this.ubicacion = ubicacion;
	}

	//GETTERS AND SETTERS
	public int getCusuario() 
	{
		return Cusuario;
	}
	public void setCusuario(int cusuario) 
	{
		Cusuario = cusuario;
	}

	public String getNnombreusuario() 
	{
		return Nnombreusuario;
	}
	public void setNnombreusuario(String nnombreusuario) 
	{
		Nnombreusuario = nnombreusuario;
	}

	public String getCcontrasenausuario() 
	{
		return Ccontrasenausuario;
	}
	public void setCcontrasenausuario(String ccontrasenausuario) 
	{
		Ccontrasenausuario = ccontrasenausuario;
	}

	public String getTcorreousuario() 
	{
		return Tcorreousuario;
	}
	public void setTcorreousuario(String tcorreousuario) 
	{
		Tcorreousuario = tcorreousuario;
	}

	public int getCdniusuario() 
	{
		return Cdniusuario;
	}
	public void setCdniusuario(int cdniusuario) 
	{
		Cdniusuario = cdniusuario;
	}

	public TipoUsuario getTipousuario() 
	{
		return tipousuario;
	}
	public void setTipousuario(TipoUsuario tipousuario) 
	{
		this.tipousuario = tipousuario;
	}

	public Cargo getCargo() 
	{
		return cargo;
	}
	public void setCargo(Cargo cargo) 
	{
		this.cargo = cargo;
	}

	public Servicio getServicio() 
	{
		return servicio;
	}
	public void setServicio(Servicio servicio) 
	{
		this.servicio = servicio;
	}

	public Ubicacion getUbicacion() 
	{
		return ubicacion;
	}
	public void setUbicacion(Ubicacion ubicacion) {
		this.ubicacion = ubicacion;
	}
	
}
