package pe.edu.upc.entities;

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
	private int Ctipousuario;
	
	@Column(name="Nnombretipo" ,nullable = false ,length = 60)
	private String Nnombretipo;
	
	//CONSTRUCTORS FROM SUPERCLASS
	public TipoUsuario() 
	{
		super();
		// TODO Auto-generated constructor stub
	}

	//CONSTRUCTORS USING FIELDS
	public TipoUsuario(int ctipousuario, String nnombretipo) 
	{
		super();
		Ctipousuario = ctipousuario;
		Nnombretipo = nnombretipo;
	}

	//GETTERS AND SETTERS
	public int getCtipousuario() 
	{
		return Ctipousuario;
	}
	public void setCtipousuario(int ctipousuario) 
	{
		Ctipousuario = ctipousuario;
	}

	public String getNnombretipo() 
	{
		return Nnombretipo;
	}
	public void setNnombretipo(String nnombretipo) 
	{
		Nnombretipo = nnombretipo;
	}
	
}
