package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IAlertaDao;
import pe.edu.upc.entities.Alerta;
import pe.edu.upc.service.IAlertaService;

@Named
@RequestScoped
public class AlertaServiceImpl implements IAlertaService
{

	private IAlertaDao boDao;
	
	public void insert(Alerta al) {
		// TODO Auto-generated method stub
		boDao.insert(al);
	}

	public List<Alerta> list() {
		// TODO Auto-generated method stub
		return boDao.list();
	}

}
