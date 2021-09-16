package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IDistritoDao;
import pe.edu.upc.entities.Distrito;

public class DistritoDaoImpl implements IDistritoDao
{

	@PersistenceContext(unitName="Ubicuo")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insert(Distrito di) 
	{
		try 
		{
			em.persist(di);
		} 
		catch (Exception e) 
		{
			System.out.println("Error al insertar");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Distrito> list() 
	{
		List<Distrito> lista = new ArrayList<Distrito>();
		try 
		{
			Query q = em.createQuery("Select d from Distrito d");
			lista = (List<Distrito>)q.getResultList();
		} 
		catch (Exception e) 
		{
			System.out.println("Error al insertar");
		}
		return lista;
	}

}
