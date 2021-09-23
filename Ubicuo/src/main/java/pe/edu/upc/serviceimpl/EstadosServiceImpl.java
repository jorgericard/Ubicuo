package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IEstadosDao;
import pe.edu.upc.entities.Estados;
import pe.edu.upc.service.IEstadosService;

@Named
@RequestScoped
public class EstadosServiceImpl implements IEstadosService
{
	@Inject
	private IEstadosDao esDao;
	
	@Override
	public void insert(Estados es) {
		// TODO Auto-generated method stub
		esDao.insert(es);
	}

	@Override
	public List<Estados> list() {
		// TODO Auto-generated method stub
		return esDao.list();
	}

	@Override
	public void eliminar(int Cestados) {
		// TODO Auto-generated method stub
		esDao.eliminar(Cestados);
	}

	@Override
	public List<Estados> finByNameEstados(Estados es) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Estados es) {
		// TODO Auto-generated method stub
		esDao.update(es);
	}
	
}
