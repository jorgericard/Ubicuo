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
	@JoinColumn(name="usuarioauxiliado" ,nullable = false)
	private Usuario usuarioauxiliado;
	
	@ManyToOne
	@JoinColumn(name="usuariorescatista" ,nullable = true)
	private Usuario usuariorescatista;
	
	@ManyToOne
	@JoinColumn(name="estado" ,nullable = false)
	private Estados estado;
	
	private Date ffecha;
	
	//CONSTRUCTORS FROM SUPERCLASS
	public Alerta() 
	{
		super();
		// TODO Auto-generated constructor stub
	}

	//CONSTRUCTORS USING FIELDS
	public Alerta(int calerta, Usuario usuarioauxiliado, Usuario usuariorescatista, Estados estado, Date ffecha) {
		super();
		this.calerta = calerta;
		this.usuarioauxiliado = usuarioauxiliado;
		this.usuariorescatista = usuariorescatista;
		this.estado = estado;
		this.ffecha = ffecha;
	}

	//GETTERS AND SETTERS
	public int getCalerta() {
		return calerta;
	}

	public void setCalerta(int calerta) {
		this.calerta = calerta;
	}

	public Usuario getUsuarioauxiliado() {
		return usuarioauxiliado;
	}

	public void setUsuarioauxiliado(Usuario usuarioauxiliado) {
		this.usuarioauxiliado = usuarioauxiliado;
	}

	public Usuario getUsuariorescatista() {
		return usuariorescatista;
	}

	public void setUsuariorescatista(Usuario usuariorescatista) {
		this.usuariorescatista = usuariorescatista;
	}

	public Estados getEstado() {
		return estado;
	}

	public void setEstado(Estados estado) {
		this.estado = estado;
	}

	public Date getFfecha() {
		return ffecha;
	}

	public void setFfecha(Date ffecha) {
		this.ffecha = ffecha;
	}
		
	
	
	
}
