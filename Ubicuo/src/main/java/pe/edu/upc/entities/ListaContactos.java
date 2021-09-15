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
@Table(name="ListaContactos")
public class ListaContactos 
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Clistacontacto;
	
	@Column(name="Nnombrecontacto" ,nullable = false ,length = 60)
	private String Nnombrecontacto;
	
	@Column(name="Nnumerocontacto" ,nullable = false ,length = 9)
	private int Nnumerocontacto;
	
	@ManyToOne
	@JoinColumn(name="usuario" ,nullable = true)
	private Usuarios usuario;
	
	//CONSTRUCTORS FROM SUPERCLASS
	public ListaContactos() 
	{
		super();
		// TODO Auto-generated constructor stub
	}

	//CONSTRUCTORS USING FIELDS
	public ListaContactos(int clistacontacto, String nnombrecontacto, int nnumerocontacto, Usuarios usuario) {
		super();
		Clistacontacto = clistacontacto;
		Nnombrecontacto = nnombrecontacto;
		Nnumerocontacto = nnumerocontacto;
		this.usuario = usuario;
	}
	
	//GETTERS AND SETTERS
	public int getClistacontacto() 
	{
		return Clistacontacto;
	}
	public void setClistacontacto(int clistacontacto) 
	{
		Clistacontacto = clistacontacto;
	}

	public String getNnombrecontacto() 
	{
		return Nnombrecontacto;
	}
	public void setNnombrecontacto(String nnombrecontacto) 
	{
		Nnombrecontacto = nnombrecontacto;
	}

	public int getNnumerocontacto() 
	{
		return Nnumerocontacto;
	}
	public void setNnumerocontacto(int nnumerocontacto) 
	{
		Nnumerocontacto = nnumerocontacto;
	}

	public Usuarios getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuarios usuario) {
		this.usuario = usuario;
	}
	
}
