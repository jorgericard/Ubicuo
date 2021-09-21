package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.ICargoDao;
import pe.edu.upc.entities.Cargo;
import pe.edu.upc.service.ICargoService;

@Named
@RequestScoped
public class CargoServiceImpl implements ICargoService
{
	@Inject
	private ICargoDao caDao;
	
	@Override
	public void insert(Cargo ca) 
	{
		caDao.insert(ca);
	}
	
	@Override
	public void eliminar(int idca) 
	{
		caDao.eliminar(idca);
	}

	@Override
	public void modificar(Cargo ca) 
	{
		caDao.modificar(ca);
	}

	@Override
	public List<Cargo> list() 
	{
		return caDao.list();
	}

}
