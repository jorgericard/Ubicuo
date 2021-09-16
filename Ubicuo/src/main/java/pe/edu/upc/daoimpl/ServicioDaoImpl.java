package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IServicioDao;
import pe.edu.upc.entities.Servicio;

public class ServicioDaoImpl implements IServicioDao
{
	
	@PersistenceContext(unitName="Ubicuo")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insert(Servicio se) 
	{
		try 
		{
			em.persist(se);
		} 
		catch (Exception e) 
		{
			System.out.println("Error al insertar");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Servicio> list() 
	{
		List<Servicio> lista = new ArrayList<Servicio>();
		try 
		{
			Query q = em.createQuery("Select se form Servicio se");
			lista = (List<Servicio>) q.getResultList();
		} 
		catch (Exception e) 
		{
			System.out.println("Error al insertar");
		}
		return lista;
	}

}
