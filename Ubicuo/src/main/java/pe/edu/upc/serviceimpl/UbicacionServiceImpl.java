package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import pe.edu.upc.dao.IUbicacionDao;
import pe.edu.upc.entities.Ubicacion;
import pe.edu.upc.service.IUbicacionService;

@Named
@RequestScoped
public class UbicacionServiceImpl implements IUbicacionService
{

	private IUbicacionDao ubDao;
	
	public void insert(Ubicacion ub) {
		// TODO Auto-generated method stub
		ubDao.insert(ub);
	}

	public List<Ubicacion> list() {
		// TODO Auto-generated method stub
		return ubDao.list();
	}

}
