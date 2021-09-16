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
@Table(name="Contacto")
public class Contacto 
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ccontacto;
	
	@Column(name="nnombrecontacto" ,nullable = false ,length = 60)
	private String nnombrecontacto;
	
	private int nnumerocontacto;
	
	@ManyToOne
	@JoinColumn(name="usuario" ,nullable = true)
	private Usuarios usuario;
	
	//CONSTRUCTORS FROM SUPERCLASS
	public Contacto() 
	{
		super();
		// TODO Auto-generated constructor stub
	}

	//CONSTRUCTORS USING FIELDS
	public Contacto(int ccontacto, String nnombrecontacto, int nnumerocontacto, Usuarios usuario) 
	{
		super();
		this.ccontacto = ccontacto;
		this.nnombrecontacto = nnombrecontacto;
		this.nnumerocontacto = nnumerocontacto;
		this.usuario = usuario;
	}

	//GETTERS AND SETTERS


	public Usuarios getUsuario() 
	{
		return usuario;
	}
	public int getCcontacto() 
	{
		return ccontacto;
	}

	public void setCcontacto(int ccontacto) 
	{
		this.ccontacto = ccontacto;
	}
	public String getNnombrecontacto() 
	{
		return nnombrecontacto;
	}

	public void setNnombrecontacto(String nnombrecontacto) 
	{
		this.nnombrecontacto = nnombrecontacto;
	}
	public int getNnumerocontacto() 
	{
		return nnumerocontacto;
	}

	public void setNnumerocontacto(int nnumerocontacto) 
	{
		this.nnumerocontacto = nnumerocontacto;
	}
	public void setUsuario(Usuarios usuario) 
	{
		this.usuario = usuario;
	}
	
}
