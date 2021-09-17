package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IDistritoDao;
import pe.edu.upc.entities.Distrito;
import pe.edu.upc.service.IDistritoService;

@Named
@RequestScoped
public class DistritoServiceImpl implements IDistritoService
{
	@Inject
	private IDistritoDao diDao;
	
	@Override
	public void insert(Distrito di) {
		// TODO Auto-generated method stub
		diDao.insert(di);
	}
	@Override
	public List<Distrito> list() {
		// TODO Auto-generated method stub
		return diDao.list();
	}

}
