package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import pe.edu.upc.dao.IDistritoDao;
import pe.edu.upc.entities.Distrito;
import pe.edu.upc.service.IDistritoService;

@Named
@RequestScoped
public class DistritoServiceImpl implements IDistritoService
{

	private IDistritoDao diDao;
	
	public void insert(Distrito di) {
		// TODO Auto-generated method stub
		diDao.insert(di);
	}

	public List<Distrito> list() {
		// TODO Auto-generated method stub
		return diDao.list();
	}

}
