package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class AbstractDao {
	private EntityManagerFactory emf;
	protected EntityManager em;

	public AbstractDao(EntityManagerFactory emf) {
		super();
		this.emf = emf;
		em = emf.createEntityManager();
	}
	
	public EntityManager getEntityManager() {
		return em;
	}
	
	public EntityManagerFactory getEntityManagerFactory() {
		return emf;
	}
	
	
}
