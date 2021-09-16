package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IContactoDao;
import pe.edu.upc.entities.Contacto;
import pe.edu.upc.service.IContactoService;

@Named
@RequestScoped
public class ContactoServiceImpl implements IContactoService
{
	@Inject
	private IContactoDao liDao;
	
	@Override
	public void insert(Contacto co) {
		// TODO Auto-generated method stub
		liDao.insert(co);
	}

	@Override
	public List<Contacto> list() {
		// TODO Auto-generated method stub
		return liDao.list();
	}

}
