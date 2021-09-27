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
	private Usuario usuarioemisor;
	
	@ManyToOne
	@JoinColumn(name="estado" ,nullable = false)
	private Estados estado;
	
	@ManyToOne
	@JoinColumn(name="usuarioreceptor" ,nullable = false)
	private Usuario usuarioreceptor;
	
	private Date ffecha;
	
	//CONSTRUCTORS FROM SUPERCLASS
	public Alerta() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	//CONSTRUCTORS USING FIELDS
	public Alerta(int calerta, Usuario usuarioemisor, Estados estado, Usuario usuarioreceptor, Date ffecha) {
		super();
		this.calerta = calerta;
		this.usuarioemisor = usuarioemisor;
		this.estado = estado;
		this.usuarioreceptor = usuarioreceptor;
		this.ffecha = ffecha;
	}
	
	//GETTERS AND SETTERS
	public int getCalerta() {
		return calerta;
	}

	public void setCalerta(int calerta) {
		this.calerta = calerta;
	}

	public Usuario getUsuarioemisor() {
		return usuarioemisor;
	}

	public void setUsuarioemisor(Usuario usuarioemisor) {
		this.usuarioemisor = usuarioemisor;
	}

	public Estados getEstado() {
		return estado;
	}

	public void setEstado(Estados estado) {
		this.estado = estado;
	}

	public Usuario getUsuarioreceptor() {
		return usuarioreceptor;
	}

	public void setUsuarioreceptor(Usuario usuarioreceptor) {
		this.usuarioreceptor = usuarioreceptor;
	}

	public Date getFfecha() {
		return ffecha;
	}

	public void setFfecha(Date ffecha) {
		this.ffecha = ffecha;
	}

	//SOURCE>GENERATE DASH CODE AND EQUALS
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + calerta;
		//result = prime * result + ((nnombretiposervicio == null) ? 0 : nnombretiposervicio.hashCode());
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
		Alerta other = (Alerta) obj;
		if(calerta != other.calerta)
			return false;
		return true;
	}
	
}
