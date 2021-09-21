package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.ICargoDao;
import pe.edu.upc.entities.Cargo;

public class CargoDaoImpl implements ICargoDao
{

	@PersistenceContext(unitName="Ubicuo")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insert(Cargo ca) 
	{
		try 
		{
			em.persist(ca);
		} 
		catch (Exception e) 
		{
			System.out.println("Error al insertar");
		}
	}

	@Transactional
	@Override
	public void eliminar(int idca) 
	{
		Cargo ca = new Cargo();
		try 
		{
			ca = em.getReference(Cargo.class, idca);
			em.remove(ca);
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
		
	}

	@Transactional
	@Override
	public void modificar(Cargo ca) 
	{
		try 
		{
			em.merge(ca);
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Cargo> list() 
	{
		List<Cargo> lista = new ArrayList<Cargo>();
		try 
		{
			Query q = em.createQuery("Select ca from Cargo ca");
			lista = (List<Cargo>)q.getResultList();
		} 
		catch (Exception e) 
		{
			System.out.println("Error al insertar");
		}
		return lista;
	}


}
