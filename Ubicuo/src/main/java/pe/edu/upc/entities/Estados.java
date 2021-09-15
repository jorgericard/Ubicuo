package pe.edu.upc.entities;

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
	private int Cestados;
	
	@Column(name="Nnombreestados" ,nullable = false ,length = 60)
	private String Nnombreestados;
	
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
		Cestados = cestados;
		Nnombreestados = nnombreestados;
	}
	
	//GETTERS AND SETTERS
	public int getCestados() 
	{
		return Cestados;
	}
	public void setCestados(int cestados) 
	{
		Cestados = cestados;
	}
	
	public String getNnombreestados() 
	{
		return Nnombreestados;
	}
	public void setNnombreestados(String nnombreestados) 
	{
		Nnombreestados = nnombreestados;
	}
	
}
