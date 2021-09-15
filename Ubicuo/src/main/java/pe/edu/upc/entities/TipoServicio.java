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
	private int Ctiposervicio;
	
	@Column(name="Nnombretiposervicio" ,nullable = false ,length = 60)
	private String Nnombretiposervicio;
	
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
		Ctiposervicio = ctiposervicio;
		Nnombretiposervicio = nnombretiposervicio;
	}
	
	//GETTERS AND SETTERS
	public int getCtiposervicio() 
	{
		return Ctiposervicio;
	}
	public void setCtiposervicio(int ctiposervicio) 
	{
		Ctiposervicio = ctiposervicio;
	}
	
	public String getNnombretiposervicio() 
	{
		return Nnombretiposervicio;
	}
	public void setNnombretiposervicio(String nnombretiposervicio) 
	{
		Nnombretiposervicio = nnombretiposervicio;
	}
	
}
