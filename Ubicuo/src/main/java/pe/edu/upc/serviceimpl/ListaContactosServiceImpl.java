package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import pe.edu.upc.dao.IListaContactosDao;
import pe.edu.upc.entities.ListaContactos;
import pe.edu.upc.service.IListaContactosService;

@Named
@RequestScoped
public class ListaContactosServiceImpl implements IListaContactosService
{
	
	private IListaContactosDao liDao;
	
	public void insert(ListaContactos li) {
		// TODO Auto-generated method stub
		liDao.insert(li);
	}

	public List<ListaContactos> list() {
		// TODO Auto-generated method stub
		return liDao.list();
	}

}
