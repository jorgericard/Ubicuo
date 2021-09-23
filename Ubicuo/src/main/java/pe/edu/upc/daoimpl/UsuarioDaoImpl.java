package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IUsuarioDao;
import pe.edu.upc.entities.Usuario;

public class UsuarioDaoImpl implements IUsuarioDao{
	@PersistenceContext(unitName="Ubicuo")
	
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Usuario u) {
		// TODO Auto-generated method stub
		try {
			em.persist(u);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al insertar");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Usuario> list() {
		// TODO Auto-generated method stub
		List<Usuario> lista= new ArrayList<Usuario>();
		try {
			Query q= em.createQuery("select u from Usuario u");
			lista=(List<Usuario>)q.getResultList();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error al listar");
		}
		return lista;
	}
	
	
	
	
}
