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
@Table(name="Contacto")
public class Contacto 
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Ccontacto;
	
	@Column(name="Nnombrecontacto" ,nullable = false ,length = 60)
	private String Nnombrecontacto;
	
	private int Nnumerocontacto;
	
	@ManyToOne
	@JoinColumn(name="usuario" ,nullable = true)
	private Usuarios usuario;
	
	//CONSTRUCTORS FROM SUPERCLASS
	public Contacto() 
	{
		super();
		// TODO Auto-generated constructor stub
	}

	//CONSTRUCTORS USING FIELDS
	public Contacto(int clistacontacto, String nnombrecontacto, int nnumerocontacto, Usuarios usuario) {
		super();
		Ccontacto = clistacontacto;
		Nnombrecontacto = nnombrecontacto;
		Nnumerocontacto = nnumerocontacto;
		this.usuario = usuario;
	}


	//GETTERS AND SETTERS
	public int getClistacontacto() {
		return Ccontacto;
	}

	public void setClistacontacto(int clistacontacto) {
		Ccontacto = clistacontacto;
	}

	public String getNnombrecontacto() {
		return Nnombrecontacto;
	}

	public void setNnombrecontacto(String nnombrecontacto) {
		Nnombrecontacto = nnombrecontacto;
	}

	public int getNnumerocontacto() {
		return Nnumerocontacto;
	}

	public void setNnumerocontacto(int nnumerocontacto) {
		Nnumerocontacto = nnumerocontacto;
	}

	public Usuarios getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuarios usuario) {
		this.usuario = usuario;
	}
	
}
