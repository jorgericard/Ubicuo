package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IBotonesDao;
import pe.edu.upc.entities.Botones;

public class BotonesDaoImpl implements IBotonesDao
{

	@PersistenceContext(unitName="Ubicuo")
	private EntityManager em;
	
	@Transactional
	public void insert(Botones bo) 
	{
		try 
		{
			em.persist(bo);
		} 
		catch (Exception e) 
		{
			System.out.println("Error al insertar");
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<Botones> list() 
	{
		List<Botones> lista = new ArrayList<Botones>();
		try 
		{
			Query q = em.createQuery("Select bo form Botones bo");
			lista = (List<Botones>) q.getResultList();
		} 
		catch (Exception e) 
		{
			System.out.println("Error al insertar");
		}
		return lista;
	}

}
