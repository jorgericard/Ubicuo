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
	private int cubicacion;
	
	@Column(name="nlatitud" ,nullable = false ,length = 9)
	private int nlatitud;
	
	@Column(name="nlongitud" ,nullable = false ,length = 9)
	private int nlongitud;
	
	//CONSTRUCTORS FROM SUPERCLASS
	public Ubicacion() 
	{
		super();
		// TODO Auto-generated constructor stub
	}

	//CONSTRUCTORS USING FIELDS
	public Ubicacion(int cubicacion, int nlatitud, int nlongitud) {
		super();
		this.cubicacion = cubicacion;
		this.nlatitud = nlatitud;
		this.nlongitud = nlongitud;
	}
	
	//GETTERS AND SETTERS
	public int getCubicacion() 
	{
		return cubicacion;
	}
	public void setCubicacion(int cubicacion) 
	{
		this.cubicacion = cubicacion;
	}

	public int getNlatitud() 
	{
		return nlatitud;
	}
	public void setNlatitud(int nlatitud) 
	{
		this.nlatitud = nlatitud;
	}

	public int getNlongitud() 
	{
		return nlongitud;
	}
	public void setNlongitud(int nlongitud) 
	{
		this.nlongitud = nlongitud;
	}
	
}
