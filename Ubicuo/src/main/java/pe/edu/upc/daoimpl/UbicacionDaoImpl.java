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
	@Transactional
	@Override
	public void eliminar(int cUbicacion) {
		// TODO Auto-generated method stub
		Ubicacion ub = new Ubicacion();
		try {
			ub = em.getReference(Ubicacion.class, cUbicacion);
			em.remove(ub);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	@Transactional
	@Override
	public void modificar(Ubicacion ubicacion) {
		// TODO Auto-generated method stub
		try {
			em.merge(ubicacion);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Ubicacion> findByIdUbicacion(Ubicacion ubi) {
		// TODO Auto-generated method stub
		List<Ubicacion> lista=new ArrayList<Ubicacion>();
		try {
			Query q= em.createQuery("from Ubicacion c where c.cUbicacion like ?1");
			q.setParameter(1, "%"+ ubi.getCUbicacion() + "%");
			lista=(List<Ubicacion>)q.getResultList();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		return lista;
	}

}
