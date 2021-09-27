package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IContactosDao;
import pe.edu.upc.entities.Contactos;
import pe.edu.upc.service.IContactosService;

@Named
@RequestScoped
public class ContactosServiceImpl implements IContactosService {
	
	@Inject
	private IContactosDao coDao;
	
	@Override
	public void insert(Contactos c) {
		// TODO Auto-generated method stub
		coDao.insert(c);
	}

	@Override
	public List<Contactos> list() {
		// TODO Auto-generated method stub
		return coDao.list();
	}

	@Override
	public void eliminar(int cContactos) {
		// TODO Auto-generated method stub
		coDao.eliminar(cContactos);
	}

	@Override
	public void modificar(Contactos contactos) {
		// TODO Auto-generated method stub
		coDao.modificar(contactos);
	}
	
	
}
