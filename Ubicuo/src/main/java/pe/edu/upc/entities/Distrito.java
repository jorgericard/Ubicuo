package pe.edu.upc.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Distrito")
public class Distrito 
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cDistrito;
	
	@Column(name="nombreDistrito" ,nullable = false ,length = 60)
	private String nombreDistrito;
	
	//CONSTRUCTORS FROM SUPERCLASS
	public Distrito() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	//CONSTRUCTORS USING FIELDS
	public Distrito(int cDistrito, String nombreDistrito) 
	{
		super();
		this.cDistrito = cDistrito;
		this.nombreDistrito = nombreDistrito;
	}
	
	//GETTERS AND SETTERS
	public int getCDistrito() 
	{
		return cDistrito;
	}
	public void setCDistrito(int cDistrito) 
	{
		this.cDistrito = cDistrito;
	}
	
	public String getNnombredistrito() 
	{
		return nombreDistrito;
	}
	public void setNombredistrito(String nombreDistrito) 
	{
		this.nombreDistrito = nombreDistrito;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cDistrito;
		//result = prime * result + ((nombreDistrito == null) ? 0 : nombreDistrito.hashCode());
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
		Distrito other = (Distrito) obj;
		if (cDistrito != other.cDistrito)
			return false;		
		return true;
	}

	
	
}
