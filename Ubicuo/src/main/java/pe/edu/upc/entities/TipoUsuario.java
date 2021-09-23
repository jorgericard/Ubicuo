package pe.edu.upc.entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TipoUsuario")
public class TipoUsuario 
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ctipousuario;
	
	@Column(name="nnombretipo" ,nullable = false ,length = 60)
	private String nnombretipo;
	
	//CONSTRUCTORS FROM SUPERCLASS
	public TipoUsuario() 
	{
		super();
		// TODO Auto-generated constructor stub
	}

	//CONSTRUCTORS USING FIELDS
	public TipoUsuario(int ctipousuario, String nnombretipo) {
		super();
		this.ctipousuario = ctipousuario;
		this.nnombretipo = nnombretipo;
	}
	
	//GETTERS AND SETTERS
	public int getCtipousuario() 
	{
		return ctipousuario;
	}
	public void setCtipousuario(int ctipousuario) 
	{
		this.ctipousuario = ctipousuario;
	}

	public String getNnombretipo() 
	{
		return nnombretipo;
	}
	public void setNnombretipo(String nnombretipo) 
	{
		this.nnombretipo = nnombretipo;
	}

	//SOURCE>GENERATE DASH CODE AND EQUALS
	@Override
	public int hashCode() 
	{
		return Objects.hash(ctipousuario);
	}

	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TipoUsuario other = (TipoUsuario) obj;
		return ctipousuario == other.ctipousuario;
	}
	
	
}
