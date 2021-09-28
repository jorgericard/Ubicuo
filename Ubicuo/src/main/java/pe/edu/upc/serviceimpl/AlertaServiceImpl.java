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
	private IAlertaDao boDao;
	
	@Override
	public void insert(Alerta al) 
	{
		boDao.insert(al);
	}

	@Override
	public void eliminar(int idal) 
	{
		boDao.eliminar(idal);
	}

	@Override
	public void modificar(Alerta al) 
	{
		boDao.modificar(al);
	}

	@Override
	public List<Alerta> list() 
	{
		return boDao.list();
	}

}
