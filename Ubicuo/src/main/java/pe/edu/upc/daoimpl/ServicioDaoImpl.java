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

	@Transactional
	@Override
	public void eliminar(int idse) 
	{
		Servicio se = new Servicio();
		try 
		{
			se = em.getReference(Servicio.class, idse);
			em.remove(se);
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
		
	}
	
	@Transactional
	@Override
	public void modificar(Servicio se) 
	{
		try 
		{
			em.merge(se);
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Servicio> list() 
	{
		List<Servicio> lista = new ArrayList<Servicio>();
		try 
		{
			Query q = em.createQuery("Select se from Servicio se");
			lista = (List<Servicio>) q.getResultList();
		} 
		catch (Exception e) 
		{
			System.out.println("Error al insertar");
		}
		return lista;
	}

}
