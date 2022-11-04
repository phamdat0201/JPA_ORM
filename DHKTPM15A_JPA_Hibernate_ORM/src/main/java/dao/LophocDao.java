package dao;

import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import entity.Lophoc;
import service.LophocService;

public class LophocDao extends AbstractDao implements LophocService{

	public LophocDao(EntityManagerFactory emf) {
		super(emf);
	}


	public boolean themLophoc(Lophoc lophoc) {
		EntityTransaction tr = em.getTransaction();

		try {
			tr.begin();

			em.persist(lophoc);
			tr.commit();

			return true;
		}catch (Exception e) {
			tr.rollback();
		}

		return false;
	}

	public boolean capnhatLophoc(Lophoc lophoc) {
		EntityTransaction tr = em.getTransaction();

		try {
			tr.begin();

			em.merge(lophoc);
			tr.commit();

			return true;
		}catch (Exception e) {
			tr.rollback();
		}
		return false;
	}

	public boolean xoaLophoc(String mslop) {
		EntityTransaction tr = em.getTransaction();

		try {
			tr.begin();

			em.remove(em.find(Lophoc.class, mslop));
			tr.commit();

			return true;
		}catch (Exception e) {
			tr.rollback();
		}
		return false;
	}


	public Lophoc getLophoc(String mslop) {
		return em.find(Lophoc.class, mslop);
	}

	@SuppressWarnings("unchecked")
	public List<Lophoc> getDSLophoc() {
		return em
				.createNativeQuery("select * from Lophoc", Lophoc.class)
				.getResultList();
	}

}
