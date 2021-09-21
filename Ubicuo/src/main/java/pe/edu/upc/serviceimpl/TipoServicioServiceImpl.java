package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.ITipoServicioDao;
import pe.edu.upc.entities.TipoServicio;
import pe.edu.upc.service.ITipoServicioService;

@Named
@RequestScoped
public class TipoServicioServiceImpl implements ITipoServicioService
{
	@Inject
	private ITipoServicioDao tisDao;
	
	@Override
	public void insert(TipoServicio tis) {
		// TODO Auto-generated method stub
		tisDao.insert(tis);
	}

	@Override
	public List<TipoServicio> list() {
		// TODO Auto-generated method stub
		return tisDao.list();
	}

	@Override
	public void delete(int idTipoServicio) {
		// TODO Auto-generated method stub
		tisDao.delete(idTipoServicio);
		
	}

	@Override
	public void update(TipoServicio tis) {
		// TODO Auto-generated method stub
		tisDao.update(tis);
		
	}

	@Override
	public List<TipoServicio> finByNameTipoServicio(TipoServicio tis) {
		// TODO Auto-generated method stub
		return tisDao.finByNameTipoServicio(tis);
	}

}
