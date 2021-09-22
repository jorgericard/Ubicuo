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
			Query q = em.createQuery("Select di from Distrito di");
			lista = (List<Distrito>)q.getResultList();
		} 
		catch (Exception e) 
		{
			System.out.println("Error al insertar");
		}
		return lista;
	}
	
	@Transactional
	@Override
	public void eliminar(int cDistrito) {
		// TODO Auto-generated method stub
		Distrito di = new Distrito();
		try {
			di = em.getReference(Distrito.class, cDistrito);
			em.remove(di);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Transactional
	@Override
	public void modificar(Distrito distrito) {
		// TODO Auto-generated method stub
		try {
			em.merge(distrito);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Distrito> findByNameDistrito(Distrito dis) {
		// TODO Auto-generated method stub
		List<Distrito> lista= new ArrayList<Distrito>();
		try {
			Query q= em.createQuery("from Distrito c where c.nombreDistrito like ?1");
			q.setParameter(1, "%"+ dis.getNombredistrito() + "%");
			lista=(List<Distrito>)q.getResultList();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		return lista;
	}
	
	
	

}
