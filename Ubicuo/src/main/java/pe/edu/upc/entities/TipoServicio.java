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
	
}
