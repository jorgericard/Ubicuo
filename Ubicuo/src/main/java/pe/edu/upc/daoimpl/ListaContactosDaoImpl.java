package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IListaContactosDao;
import pe.edu.upc.entities.ListaContactos;

public class ListaContactosDaoImpl implements IListaContactosDao
{

	@PersistenceContext(unitName="Ubicuo")
	private EntityManager em;
	
	@Transactional
	public void insert(ListaContactos li) 
	{
		try 
		{
			em.persist(li);
		} 
		catch (Exception e) 
		{
			System.out.println("Error al insertar");
		}
	}

	@SuppressWarnings("unchecked")
	public List<ListaContactos> list() 
	{
		List<ListaContactos> lista = new ArrayList<ListaContactos>();
		try 
		{
			Query q = em.createQuery("Select li form ListaContactos li");
			lista = (List<ListaContactos>) q.getResultList();
		} 
		catch (Exception e) 
		{
			System.out.println("Error al insertar");
		}
		return lista;
	}

}
