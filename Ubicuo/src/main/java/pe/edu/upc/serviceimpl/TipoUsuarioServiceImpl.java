package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import pe.edu.upc.dao.ITipoUsuarioDao;
import pe.edu.upc.entities.TipoUsuario;
import pe.edu.upc.service.ITipoUsuarioService;

@Named
@RequestScoped
public class TipoUsuarioServiceImpl implements ITipoUsuarioService
{

	private ITipoUsuarioDao tiuDao;
	
	public void insert(TipoUsuario tiu) {
		// TODO Auto-generated method stub
		tiuDao.insert(tiu);
	}

	public List<TipoUsuario> list() {
		// TODO Auto-generated method stub
		return tiuDao.list();
	}

}
