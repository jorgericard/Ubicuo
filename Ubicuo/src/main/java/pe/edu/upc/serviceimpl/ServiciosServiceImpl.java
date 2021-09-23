package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IServicioDao;
import pe.edu.upc.entities.Servicio;
import pe.edu.upc.service.IServicioService;

@Named
@RequestScoped
public class ServiciosServiceImpl implements IServicioService
{
	@Inject
	private IServicioDao seDao;
	
	@Override
	public void insert(Servicio se) 
	{
		seDao.insert(se);
	}
	
	@Override
	public void eliminar(int idse) 
	{
		seDao.eliminar(idse);
	}

	@Override
	public void modificar(Servicio se) 
	{
		seDao.modificar(se);
	}

	@Override
	public List<Servicio> list() 
	{
		return seDao.list();
	}

}
