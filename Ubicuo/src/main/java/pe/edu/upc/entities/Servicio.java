package pe.edu.upc.entities;

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
	
	@Column(name="nnumeroservicio" ,nullable = false ,length = 9)
	private int nnumeroservicio;
	
	@Column(name="nnombreservicio" ,nullable = false ,length = 60)
	private String nnombreservicio;
	
	@Column(name="tdireccionservicio" ,nullable = false ,length = 60)
	private String tdireccionservicio;
	
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
		this.nnumeroservicio = nnumeroservicio;
		this.nnombreservicio = nnombreservicio;
		this.tdireccionservicio = tdireccionservicio;
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

	public int getNnumeroservicio() {
		return nnumeroservicio;
	}

	public void setNnumeroservicio(int nnumeroservicio) {
		this.nnumeroservicio = nnumeroservicio;
	}

	public String getNnombreservicio() {
		return nnombreservicio;
	}

	public void setNnombreservicio(String nnombreservicio) {
		this.nnombreservicio = nnombreservicio;
	}

	public String getTdireccionservicio() {
		return tdireccionservicio;
	}

	public void setTdireccionservicio(String tdireccionservicio) {
		this.tdireccionservicio = tdireccionservicio;
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

	//SOURCE>GENERATE DASH CODE AND EQUALS
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cservicio;
		//result = prime * result + ((nnombreestados == null) ? 0 : nnombreestados.hashCode());
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
		Servicio other = (Servicio) obj;
		if(cservicio != other.cservicio)
			return false;
		return true;
	}
	
}
