package pe.edu.upc.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Cargo")
public class Cargo 
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ccargo;
	
	@Column(name="nnombrecargo" ,nullable = false ,length = 60)
	private String nnombrecargo;
	
	//CONSTRUCTORS FROM SUPERCLASS
	public Cargo() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	//CONSTRUCTORS USING FIELDS
	public Cargo(int ccargo, String nnombrecargo) {
		super();
		this.ccargo = ccargo;
		this.nnombrecargo = nnombrecargo;
	}
	
	//GETTERS AND SETTERS
	public int getCcargo() 
	{
		return ccargo;
	}
	public void setCcargo(int ccargo) 
	{
		this.ccargo = ccargo;
	}

	public String getNnombrecargo() 
	{
		return nnombrecargo;
	}

	public void setNnombrecargo(String nnombrecargo) 
	{
		this.nnombrecargo = nnombrecargo;
	}

	//SOURCE>GENERATE DASH CODE AND EQUALS
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ccargo;
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
		Cargo other = (Cargo) obj;
		if (ccargo != other.ccargo)
			return false;
		
		return true;
	}
}