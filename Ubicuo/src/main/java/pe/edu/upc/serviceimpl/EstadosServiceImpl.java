package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import pe.edu.upc.dao.IEstadosDao;
import pe.edu.upc.entities.Estados;
import pe.edu.upc.service.IEstadosService;

@Named
@RequestScoped
public class EstadosServiceImpl implements IEstadosService
{

	private IEstadosDao esDao;
	
	public void insert(Estados es) {
		// TODO Auto-generated method stub
		esDao.insert(es);
	}

	public List<Estados> list() {
		// TODO Auto-generated method stub
		return esDao.list();
	}
	
}
