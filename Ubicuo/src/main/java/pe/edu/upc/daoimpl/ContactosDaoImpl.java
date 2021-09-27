package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IContactosDao;
import pe.edu.upc.entities.Contactos;


public class ContactosDaoImpl implements IContactosDao{
	@PersistenceContext(unitName="Ubicuo")
	
	private EntityManager em;
	
	@Transactional
	@Override
	public void insert(Contactos c) {
		// TODO Auto-generated method stub
		try {
			em.persist(c);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al insertar");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Contactos> list() {
		// TODO Auto-generated method stub
		List<Contactos> lista= new ArrayList<Contactos>();
		try {
			Query q=em.createQuery("Select c from Contactos c");
			lista=(List<Contactos>)q.getResultList();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al listar");
		}
		return lista;
	}
	@Transactional
	@Override
	public void eliminar(int cContactos) {
		// TODO Auto-generated method stub
		Contactos co = new Contactos();
		try {
			co = em.getReference(Contactos.class, cContactos);
			em.remove(co);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	@Transactional
	@Override
	public void modificar(Contactos contactos) {
		// TODO Auto-generated method stub
		try {
			em.merge(contactos);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}
