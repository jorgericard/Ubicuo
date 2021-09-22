package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.ITipoServicioDao;
import pe.edu.upc.entities.TipoServicio;

public class TipoServicioDaoImpl implements ITipoServicioDao
{

	@PersistenceContext(unitName="Ubicuo")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insert(TipoServicio tis) 
	{
		try 
		{
			em.persist(tis);
		} 
		catch (Exception e) 
		{
			System.out.println("Error al insertar");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<TipoServicio> list() 
	{
		List<TipoServicio> lista = new ArrayList<TipoServicio>();
		try 
		{
			Query q = em.createQuery("Select tis from TipoServicio tis");
			lista = (List<TipoServicio>)q.getResultList();
		} 
		catch (Exception e) 
		{
			System.out.println("Error al insertar");
		}
		return lista;
	}

	@Transactional
	@Override
	public void delete(int idTipoServicio) {
		// TODO Auto-generated method stub
		TipoServicio TServ = new TipoServicio();
		try {
			TServ = em.getReference(TipoServicio.class, idTipoServicio);
			em.remove(TServ);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	@Transactional
	@Override
	public void update(TipoServicio tis) {
		// TODO Auto-generated method stub
		try {
			em.merge(tis);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<TipoServicio> finByNameTipoServicio(TipoServicio tis) {
		// TODO Auto-generated method stub
		List<TipoServicio> lista = new ArrayList<TipoServicio>();
		try {
			Query q = em.createQuery("from TipoServicio T where T.nnombretiposervicio like ?1");
			q.setParameter(1, "%" + tis.getNnombretiposervicio() + "%");
			lista = (List<TipoServicio>) q.getResultList();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return lista;
	}

}
