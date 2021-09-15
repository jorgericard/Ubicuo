package pe.edu.upc.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Ubicacion")
public class Ubicacion 
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Cubicacion;
	
	@Column(name="Nlatitud" ,nullable = false ,length = 9)
	private int Nlatitud;
	
	@Column(name="longitud" ,nullable = false ,length = 9)
	private int longitud;
	
	//CONSTRUCTORS FROM SUPERCLASS
	public Ubicacion() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	//CONSTRUCTORS USING FIELDS
	public Ubicacion(int cubicacion, int nlatitud, int longitud) 
	{
		super();
		Cubicacion = cubicacion;
		Nlatitud = nlatitud;
		this.longitud = longitud;
	}
	
	//GETTERS AND SETTERS
	public int getCubicacion() 
	{
		return Cubicacion;
	}
	public void setCubicacion(int cubicacion) 
	{
		Cubicacion = cubicacion;
	}
	
	public int getNlatitud() 
	{
		return Nlatitud;
	}
	public void setNlatitud(int nlatitud) 
	{
		Nlatitud = nlatitud;
	}
	
	public int getLongitud() 
	{
		return longitud;
	}
	public void setLongitud(int longitud) 
	{
		this.longitud = longitud;
	}
	
}
