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
	private int cdistrito;
	
	@Column(name="nnombredistrito" ,nullable = false ,length = 60)
	private String nnombredistrito;
	
	//CONSTRUCTORS FROM SUPERCLASS
	public Distrito() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	//CONSTRUCTORS USING FIELDS
	public Distrito(int cdistrito, String nnombredistrito) 
	{
		super();
		this.cdistrito = cdistrito;
		this.nnombredistrito = nnombredistrito;
	}
	
	//GETTERS AND SETTERS
	public int getCdistrito() 
	{
		return cdistrito;
	}
	public void setCdistrito(int cdistrito) 
	{
		this.cdistrito = cdistrito;
	}
	
	public String getNnombredistrito() 
	{
		return nnombredistrito;
	}
	public void setNnombredistrito(String nnombredistrito) 
	{
		this.nnombredistrito = nnombredistrito;
	}
	
}
