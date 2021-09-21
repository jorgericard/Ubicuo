package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IEstadosDao;
import pe.edu.upc.entities.Estados;

public class EstadosDaoImpl implements IEstadosDao
{

	@PersistenceContext(unitName="Ubicuo")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insert(Estados es) 
	{
		try 
		{
			em.persist(es);
		} 
		catch (Exception e) 
		{
			System.out.println("Error al insertar");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Estados> list() 
	{
		List<Estados> lista = new ArrayList<Estados>();
		try 
		{
			Query q = em.createQuery("Select es from Estados es");
			lista = (List<Estados>)q.getResultList();
		} 
		catch (Exception e) 
		{
			System.out.println("Error al insertar");
		}
		return lista;
	}
	
	@Transactional
	@Override
	public void eliminar(int Cestados) {
		Estados med = new Estados();
		try {
			med = em.getReference(Estados.class, Cestados);
			em.remove(med);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Estados> finByNameEstados(Estados es) {
		// TODO Auto-generated method stub
		List<Estados> lista = new ArrayList<Estados>();
		try {
			Query q = em.createQuery("from MedicCenter m where m.nameMedicCenter like ?1");
			q.setParameter(1, "%" + es.getNnombreestados() + "%");
			lista = (List<Estados>) q.getResultList();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return lista;
	}
}
