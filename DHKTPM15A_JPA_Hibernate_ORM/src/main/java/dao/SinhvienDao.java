package dao;

import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import entity.Sinhvien;
import service.SinhvienService;

public class SinhvienDao extends AbstractDao implements SinhvienService{

	public SinhvienDao(EntityManagerFactory emf) {
		super(emf);
	}

	public boolean themSinhvien(Sinhvien Sinhvien) {
		EntityTransaction tr = em.getTransaction();

		try {
			tr.begin();

			em.persist(Sinhvien);
			tr.commit();

			return true;
		}catch (Exception e) {
			tr.rollback();
		}

		return false;
	}


	public boolean capnhatSinhvien(Sinhvien Sinhvien) {
		EntityTransaction tr = em.getTransaction();

		try {
			tr.begin();

			em.merge(Sinhvien);
			tr.commit();

			return true;
		}catch (Exception e) {
			tr.rollback();
		}
		return false;
	}


	public boolean xoaSinhvien(String mssv) {
		EntityTransaction tr = em.getTransaction();

		try {
			tr.begin();

			em.remove(em.find(Sinhvien.class, mssv));
			tr.commit();

			return true;
		}catch (Exception e) {
			tr.rollback();
		}
		return false;
	}


	public Sinhvien getSinhvien(String mssv) {
		return em.find(Sinhvien.class, mssv);
	}

	@SuppressWarnings("unchecked")
	public List<Sinhvien> getDSSinhvien() {
		return em
				.createNativeQuery("select * from Sinhvien", Sinhvien.class)
				.getResultList();
	}


	public Sinhvien getSinhvienTheoTenSV(String tensv) {
		Sinhvien sv = null;
		String sql = "select * from [dbo].[Sinhvien] where tensv = '"+ tensv +"'";
		try {
			sv = (Sinhvien) em
				.createNativeQuery(sql, Sinhvien.class)
				.getSingleResult();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return sv;
	}

}
