package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IUbicacionDao;
import pe.edu.upc.entities.Ubicacion;

public class UbicacionDaoImpl implements IUbicacionDao
{

	@PersistenceContext(unitName="Ubicuo")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insert(Ubicacion ub) 
	{
		try 
		{
			em.persist(ub);
		} 
		catch (Exception e) 
		{
			System.out.println("Error al insertar");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Ubicacion> list() 
	{
		List<Ubicacion> lista = new ArrayList<Ubicacion>();
		try 
		{
			Query q = em.createQuery("Select u from Ubicacion u");
			lista = (List<Ubicacion>)q.getResultList();
		} 
		catch (Exception e) 
		{
			System.out.println("Error al insertar");
		}
		return lista;
	}

}
