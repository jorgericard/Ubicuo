package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IUsuarioDao;
import pe.edu.upc.entities.Usuario;

import pe.edu.upc.service.IUsuarioService;

@Named
@RequestScoped

public class UsuarioServiceImpl implements IUsuarioService{
	@Inject
	private  IUsuarioDao usDao;
	
	@Override
	public void insert(Usuario u) {
		// TODO Auto-generated method stub
		usDao.insert(u);
	}

	@Override
	public List<Usuario> list() {
		// TODO Auto-generated method stub
		return usDao.list();
	}

}
