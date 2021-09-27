package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IAlertaDao;
import pe.edu.upc.entities.Alerta;
import pe.edu.upc.service.IAlertaService;

@Named
@RequestScoped
public class AlertaServiceImpl implements IAlertaService
{
	@Inject
	private IAlertaDao alDao;
	
	@Override
	public void insert(Alerta al) 
	{
		alDao.insert(al);
	}

	@Override
	public void eliminar(int idal) 
	{
		alDao.eliminar(idal);
	}

	@Override
	public void modificar(Alerta al) 
	{
		alDao.modificar(al);
	}
	
	@Override
	public List<Alerta> list() 
	{
		return alDao.list();
	}

}
