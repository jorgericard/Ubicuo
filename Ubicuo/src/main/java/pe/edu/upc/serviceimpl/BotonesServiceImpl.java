package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import pe.edu.upc.dao.IBotonesDao;
import pe.edu.upc.entities.Botones;
import pe.edu.upc.service.IBotonesService;

@Named
@RequestScoped
public class BotonesServiceImpl implements IBotonesService
{

	private IBotonesDao boDao;
	
	public void insert(Botones bo) {
		// TODO Auto-generated method stub
		boDao.insert(bo);
	}

	public List<Botones> list() {
		// TODO Auto-generated method stub
		return boDao.list();
	}

}
