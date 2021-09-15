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
	private int Cdistrito;
	
	@Column(name="Nnombredistrito" ,nullable = false ,length = 60)
	private String Nnombredistrito;
	
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
		Cdistrito = cdistrito;
		Nnombredistrito = nnombredistrito;
	}
	
	//GETTERS AND SETTERS
	public int getCdistrito() 
	{
		return Cdistrito;
	}
	public void setCdistrito(int cdistrito) 
	{
		Cdistrito = cdistrito;
	}
	
	public String getNnombredistrito() 
	{
		return Nnombredistrito;
	}
	public void setNnombredistrito(String nnombredistrito) 
	{
		Nnombredistrito = nnombredistrito;
	}
	
}
