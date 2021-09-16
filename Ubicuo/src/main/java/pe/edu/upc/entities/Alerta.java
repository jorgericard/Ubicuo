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
@Table(name="Alerta")
public class Alerta 
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int calerta;
	
	@ManyToOne
	@JoinColumn(name="usuarioemisor" ,nullable = false)
	private Usuarios usuarioemisor;
	
	@ManyToOne
	@JoinColumn(name="estado" ,nullable = false)
	private Estados estado;
	
	@ManyToOne
	@JoinColumn(name="usuarioreceptor" ,nullable = true)
	private Usuarios usuarioreceptor;
	
	private Date Ffecha;
	
	//CONSTRUCTORS FROM SUPERCLASS
	public Alerta() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	//CONSTRUCTORS USING FIELDS
	public Alerta(int calerta, Usuarios usuarioemisor, Estados estado, Usuarios usuarioreceptor, Date ffecha) {
		super();
		this.calerta = calerta;
		this.usuarioemisor = usuarioemisor;
		this.estado = estado;
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

	public int getCalerta() 
	{
		return calerta;
	}

	public void setCalerta(int calerta) 
	{
		this.calerta = calerta;
	}
	
	
}
