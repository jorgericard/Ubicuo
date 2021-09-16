package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IUsuariosDao;
import pe.edu.upc.entities.Usuarios;
import pe.edu.upc.service.IUsuariosService;

@Named
@RequestScoped
public class UsuariosServiceImpl implements IUsuariosService
{
	@Inject
	private IUsuariosDao usDao;
	
	@Override
	public void insert(Usuarios us) {
		// TODO Auto-generated method stub
		usDao.insert(us);
	}

	@Override
	public List<Usuarios> list() {
		// TODO Auto-generated method stub
		return usDao.list();
	}

}
