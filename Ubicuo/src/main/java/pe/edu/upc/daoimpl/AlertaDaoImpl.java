package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IAlertaDao;
import pe.edu.upc.entities.Alerta;

public class AlertaDaoImpl implements IAlertaDao
{

	@PersistenceContext(unitName="Ubicuo")
	private EntityManager em;
	
	@Transactional
	public void insert(Alerta al) 
	{
		try 
		{
			em.persist(al);
		} 
		catch (Exception e) 
		{
			System.out.println("Error al insertar");
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<Alerta> list() 
	{
		List<Alerta> lista = new ArrayList<Alerta>();
		try 
		{
			Query q = em.createQuery("Select al form Botones al");
			lista = (List<Alerta>) q.getResultList();
		} 
		catch (Exception e) 
		{
			System.out.println("Error al insertar");
		}
		return lista;
	}

}
