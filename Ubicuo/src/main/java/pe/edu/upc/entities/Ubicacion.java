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
	private int cUbicacion;
	
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
	public Ubicacion(int cUbicacion, int nlatitud, int nlongitud) {
		super();
		this.cUbicacion = cUbicacion;
		this.nlatitud = nlatitud;
		this.nlongitud = nlongitud;
	}
	
	//GETTERS AND SETTERS
	public int getCUbicacion() 
	{
		return cUbicacion;
	}
	public void setCUbicacion(int cUbicacion) 
	{
		this.cUbicacion = cUbicacion;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cUbicacion;
		/*result = prime * result + nlatitud;
		result = prime * result + nlongitud;*/
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
		Ubicacion other = (Ubicacion) obj;
		if (cUbicacion != other.cUbicacion)
			return false;
		
		return true;
	}

	
	
}
