package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import pe.edu.upc.dao.IServicioDao;
import pe.edu.upc.entities.Servicio;
import pe.edu.upc.service.IServicioService;

@Named
@RequestScoped
public class ServiciosServiceImpl implements IServicioService
{

	private IServicioDao seDao;
	
	public void insert(Servicio se) {
		// TODO Auto-generated method stub
		seDao.insert(se);
	}

	public List<Servicio> list() {
		// TODO Auto-generated method stub
		return seDao.list();
	}

}
