package pe.edu.pe.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.TipoServicio;
import pe.edu.upc.entities.TipoUsuario;
import pe.edu.upc.service.ITipoUsuarioService;

@Named
@RequestScoped
public class TipoUsuarioController 
{
	@Inject
	private ITipoUsuarioService tiuservice;
	
	//ATRIBUTOS
	private TipoUsuario tipousuario;
	List<TipoUsuario> listatipousuario;
	
	//CONSTRUCTOR
	@PostConstruct
	public void init()
	{
		tipousuario=new TipoUsuario();
		listatipousuario=new ArrayList<TipoUsuario>();
		list();
	}
	
	//METODOS PERSONALIZADOS
	public String newTipoUsuario() 
	{
        this.setTipousuario(new TipoUsuario());
        return "tipousuario.xhtml";
    }

    public void insert() 
    {
        tiuservice.insert(tipousuario);
        list();
    }

    public void list() 
    {
        listatipousuario = tiuservice.list();
    }
	
    public void delete(TipoUsuario TUsur) {

    	tiuservice.delete(TUsur.getCtipousuario());
		list();
	}
    
    public void update() {
    	
    		tiuservice.update(tipousuario);
			list();
	}
    
    public String updateTUser(TipoUsuario TUser) {
		this.setTipousuario(TUser);
		return "TipoUsuarioUpdate.xhtml";
	}
    
	//GETTERS AND SETTERS
	public TipoUsuario getTipousuario() 
	{
		return tipousuario;
	}
	public void setTipousuario(TipoUsuario tipousuario) 
	{
		this.tipousuario = tipousuario;
	}
	
	public List<TipoUsuario> getListatipousuario() 
	{
		return listatipousuario;
	}
	public void setListatipousuario(List<TipoUsuario> listatipousuario) 
	{
		this.listatipousuario = listatipousuario;
	}
	
}
