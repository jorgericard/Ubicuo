package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import pe.edu.upc.dao.ICargoDao;
import pe.edu.upc.entities.Cargo;
import pe.edu.upc.service.ICargoService;

@Named
@RequestScoped
public class CargoServiceImpl implements ICargoService
{
	
	private ICargoDao caDao;
	
	public void insert(Cargo ca) {
		// TODO Auto-generated method stub
		caDao.insert(ca);
	}

	public List<Cargo> list() {
		// TODO Auto-generated method stub
		return caDao.list();
	}

}
