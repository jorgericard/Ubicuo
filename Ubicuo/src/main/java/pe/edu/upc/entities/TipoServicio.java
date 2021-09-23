package pe.edu.upc.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TipoServicio")
public class TipoServicio 
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ctiposervicio;
	
	@Column(name="nnombretiposervicio" ,nullable = false ,length = 60)
	private String nnombretiposervicio;
	
	//CONSTRUCTORS FROM SUPERCLASS
	public TipoServicio() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	//CONSTRUCTORS USING FIELDS
	public TipoServicio(int ctiposervicio, String nnombretiposervicio) 
	{
		super();
		this.ctiposervicio = ctiposervicio;
		this.nnombretiposervicio = nnombretiposervicio;
	}

	//GETTERS AND SETTERS
	public int getCtiposervicio() 
	{
		return ctiposervicio;
	}
	public void setCtiposervicio(int ctiposervicio) 
	{
		this.ctiposervicio = ctiposervicio;
	}

	public String getNnombretiposervicio() 
	{
		return nnombretiposervicio;
	}
	public void setNnombretiposervicio(String nnombretiposervicio) 
	{
		this.nnombretiposervicio = nnombretiposervicio;
	}

	//SOURCE>GENERATE DASH CODE AND EQUALS
	@Override
	public int hashCode() 
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ctiposervicio;
		//result = prime * result + ((nnombretiposervicio == null) ? 0 : nnombretiposervicio.hashCode());
		return result;
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
		TipoServicio other = (TipoServicio) obj;
		if (ctiposervicio != other.ctiposervicio)
			return false;
		return true;
	}

	
	
}
