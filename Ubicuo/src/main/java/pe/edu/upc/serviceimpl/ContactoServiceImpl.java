package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import pe.edu.upc.dao.IContactoDao;
import pe.edu.upc.entities.Contacto;
import pe.edu.upc.service.IContactoService;

@Named
@RequestScoped
public class ContactoServiceImpl implements IContactoService
{
	
	private IContactoDao liDao;
	
	public void insert(Contacto co) {
		// TODO Auto-generated method stub
		liDao.insert(co);
	}

	public List<Contacto> list() {
		// TODO Auto-generated method stub
		return liDao.list();
	}

}
