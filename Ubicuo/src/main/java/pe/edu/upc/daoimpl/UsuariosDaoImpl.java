package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IUsuariosDao;
import pe.edu.upc.entities.Usuarios;

public class UsuariosDaoImpl implements IUsuariosDao
{

	@PersistenceContext(unitName="Ubicuo")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insert(Usuarios us) 
	{
		try 
		{
			em.persist(us);
		} 
		catch (Exception e) 
		{
			System.out.println("Error al insertar");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Usuarios> list() 
	{
		List<Usuarios> lista = new ArrayList<Usuarios>();
		try 
		{
			Query q = em.createQuery("Select us from Usuarios us");
			lista = (List<Usuarios>) q.getResultList();
		} 
		catch (Exception e) 
		{
			System.out.println("Error al insertar");
		}
		return lista;
	}

}
