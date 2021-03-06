package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.ITipoUsuarioDao;
import pe.edu.upc.entities.TipoUsuario;

public class TipoUsuarioDaoImpl implements ITipoUsuarioDao
{

	@PersistenceContext(unitName="Ubicuo")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insert(TipoUsuario tiu) 
	{
		try 
		{
			em.persist(tiu);
		} 
		catch (Exception e) 
		{
			System.out.println("Error al insertar");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<TipoUsuario> list() 
	{
		List<TipoUsuario> lista = new ArrayList<TipoUsuario>();
		try 
		{
			Query q = em.createQuery("Select tiu from TipoUsuario tiu");
			lista = (List<TipoUsuario>)q.getResultList();
		} 
		catch (Exception e) 
		{
			System.out.println("Error al insertar");
		}
		return lista;
	}

	@Transactional
	@Override
	public void delete(int idTipoUsuario) {
		// TODO Auto-generated method stub
		TipoUsuario TServ = new TipoUsuario();
		try {
			TServ = em.getReference(TipoUsuario.class, idTipoUsuario);
			em.remove(TServ);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	@Transactional
	@Override
	public void update(TipoUsuario tus) {
		// TODO Auto-generated method stub
		try {
			em.merge(tus);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}


	
}
