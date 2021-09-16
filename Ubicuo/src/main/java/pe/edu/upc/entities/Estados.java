package pe.edu.upc.entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Estados")
public class Estados 
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cestados;
	
	@Column(name="nnombreestados" ,nullable = false ,length = 60)
	private String nnombreestados;
	
	//CONSTRUCTORS FROM SUPERCLASS
	public Estados() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	//CONSTRUCTORS USING FIELDS
	public Estados(int cestados, String nnombreestados) 
	{
		super();
		this.cestados = cestados;
		this.nnombreestados = nnombreestados;
	}
	
	//GETTERS AND SETTERS
	public int getCestados() 
	{
		return cestados;
	}
	public void setCestados(int cestados) 
	{
		this.cestados = cestados;
	}

	public String getNnombreestados() 
	{
		return nnombreestados;
	}
	public void setNnombreestados(String nnombreestados) {
		this.nnombreestados = nnombreestados;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cestados);
	}

	//SOURCE>GENERATE DASH CODE AND EQUALS
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estados other = (Estados) obj;
		return cestados == other.cestados;
	}
	
}
