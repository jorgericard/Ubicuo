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
	@Override
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
	
	@Transactional
	@Override
	public void eliminar(int idal) 
	{
		Alerta al=new Alerta();
		try 
		{
			al = em.getReference(Alerta.class,idal);
			em.remove(al);
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
	}

	@Transactional
	@Override
	public void modificar(Alerta al) 
	{
		try 
		{
			em.merge(al);
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Alerta> list() 
	{
		List<Alerta> lista = new ArrayList<Alerta>();
		try 
		{
			Query q = em.createQuery("Select a from Alerta a");
			lista = (List<Alerta>) q.getResultList();
		} 
		catch (Exception e) 
		{
			System.out.println("Error al listar alerta");
		}
		return lista;
	}

}
