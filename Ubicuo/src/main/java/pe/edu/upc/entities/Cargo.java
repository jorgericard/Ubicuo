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
	private int Ccargo;
	
	@Column(name="Nnombrecargo" ,nullable = false ,length = 60)
	private String Nnombrecargo;
	
	//CONSTRUCTORS FROM SUPERCLASS
	public Cargo() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	//CONSTRUCTORS USING FIELDS
	public Cargo(int ccargo, String nnombrecargo) 
	{
		super();
		Ccargo = ccargo;
		Nnombrecargo = nnombrecargo;
	}
	
	//GETTERS AND SETTERS
	public int getCcargo() 
	{
		return Ccargo;
	}
	public void setCcargo(int ccargo) 
	{
		Ccargo = ccargo;
	}
	
	public String getNnombrecargo() 
	{
		return Nnombrecargo;
	}
	public void setNnombrecargo(String nnombrecargo) 
	{
		Nnombrecargo = nnombrecargo;
	}
	
}
