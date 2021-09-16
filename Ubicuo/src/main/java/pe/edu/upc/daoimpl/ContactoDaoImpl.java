package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IContactoDao;
import pe.edu.upc.entities.Contacto;

public class ContactoDaoImpl implements IContactoDao
{

	@PersistenceContext(unitName="Ubicuo")
	private EntityManager em;
	
	@Transactional
	public void insert(Contacto co) 
	{
		try 
		{
			em.persist(co);
		} 
		catch (Exception e) 
		{
			System.out.println("Error al insertar");
		}
	}

	@SuppressWarnings("unchecked")
	public List<Contacto> list() 
	{
		List<Contacto> lista = new ArrayList<Contacto>();
		try 
		{
			Query q = em.createQuery("Select co form Contacto co");
			lista = (List<Contacto>) q.getResultList();
		} 
		catch (Exception e) 
		{
			System.out.println("Error al insertar");
		}
		return lista;
	}

}
