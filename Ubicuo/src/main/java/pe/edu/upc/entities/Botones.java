package pe.edu.upc.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Botones")
public class Botones 
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Estados estado;
	
	@ManyToOne
	@JoinColumn(name="usuarioemisor" ,nullable = false)
	private Usuarios usuarioemisor;
	
	@ManyToOne
	@JoinColumn(name="usuarioreceptor" ,nullable = true)
	private Usuarios usuarioreceptor;
	
	private Date Ffecha;
	
	//CONSTRUCTORS FROM SUPERCLASS
	public Botones() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	//CONSTRUCTORS USING FIELDS
	public Botones(Estados estado, Usuarios usuarioemisor, Usuarios usuarioreceptor, Date ffecha) 
	{
		super();
		this.estado = estado;
		this.usuarioemisor = usuarioemisor;
		this.usuarioreceptor = usuarioreceptor;
		Ffecha = ffecha;
	}
	
	//GETTERS AND SETTERS
	public Estados getEstado() 
	{
		return estado;
	}
	public void setEstado(Estados estado) 
	{
		this.estado = estado;
	}
	
	public Usuarios getUsuarioemisor() 
	{
		return usuarioemisor;
	}
	public void setUsuarioemisor(Usuarios usuarioemisor) 
	{
		this.usuarioemisor = usuarioemisor;
	}
	
	public Usuarios getUsuarioreceptor() 
	{
		return usuarioreceptor;
	}
	public void setUsuarioreceptor(Usuarios usuarioreceptor) 
	{
		this.usuarioreceptor = usuarioreceptor;
	}
	
	public Date getFfecha() 
	{
		return Ffecha;
	}
	public void setFfecha(Date ffecha) 
	{
		Ffecha = ffecha;
	}
	
}
