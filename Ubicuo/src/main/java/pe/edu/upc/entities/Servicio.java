package pe.edu.upc.entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Servicio")
public class Servicio 
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cservicio;
	
	@Column(name="Nnumeroservicio" ,nullable = false ,length = 9)
	private int Nnumeroservicio;
	
	@Column(name="Nnombreservicio" ,nullable = false ,length = 60)
	private String Nnombreservicio;
	
	@Column(name="Tdireccionservicio" ,nullable = false ,length = 60)
	private String Tdireccionservicio;
	
	@ManyToOne
	@JoinColumn(name="tiposervicio" ,nullable = false)
	private TipoServicio tiposervicio;
	
	@ManyToOne
	@JoinColumn(name="distrito" ,nullable = false)
	private Distrito distrito;
	
	//CONSTRUCTORS FROM SUPERCLASS
	public Servicio() 
	{
		super();
		// TODO Auto-generated constructor stub
	}

	//CONSTRUCTORS USING FIELDS
	public Servicio(int cservicio, int nnumeroservicio, String nnombreservicio, String tdireccionservicio,
			TipoServicio tiposervicio, Distrito distrito) {
		super();
		this.cservicio = cservicio;
		Nnumeroservicio = nnumeroservicio;
		Nnombreservicio = nnombreservicio;
		Tdireccionservicio = tdireccionservicio;
		this.tiposervicio = tiposervicio;
		this.distrito = distrito;
	}
	
	//GETTERS AND SETTERS
	
	public int getCservicio() 
	{
		return cservicio;
	}
	public void setCservicio(int cservicio) 
	{
		this.cservicio = cservicio;
	}
	
	public int getNnumeroservicio() 
	{
		return Nnumeroservicio;
	}
	public void setNnumeroservicio(int nnumeroservicio) 
	{
		Nnumeroservicio = nnumeroservicio;
	}

	public String getNnombreservicio() 
	{
		return Nnombreservicio;
	}
	public void setNnombreservicio(String nnombreservicio) 
	{
		Nnombreservicio = nnombreservicio;
	}

	public String getTdireccionservicio() 
	{
		return Tdireccionservicio;
	}
	public void setTdireccionservicio(String tdireccionservicio) 
	{
		Tdireccionservicio = tdireccionservicio;
	}

	public TipoServicio getTiposervicio() 
	{
		return tiposervicio;
	}
	public void setTiposervicio(TipoServicio tiposervicio) 
	{
		this.tiposervicio = tiposervicio;
	}

	public Distrito getDistrito() 
	{
		return distrito;
	}
	public void setDistrito(Distrito distrito) 
	{
		this.distrito = distrito;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cservicio);
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
		Servicio other = (Servicio) obj;
		return cservicio == other.cservicio;
	}
	
}
