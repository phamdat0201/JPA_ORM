package app;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Set;
import java.util.TreeSet;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dao.LophocDao;
import dao.SinhvienDao;
import entity.Diachi;
import entity.Lophoc;
import entity.Sinhvien;

public class App {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("DHKTPM15A_JPA_Hibernate_ORM");
		LophocDao lophocDao = new LophocDao(factory);
		SinhvienDao sinhvienDao = new SinhvienDao(factory);
		
		Lophoc lophoc1 = new Lophoc("DHKTPM15A", "Đại học kỹ thuật phần mềm 15A - Khoa CNTT", 60);
		Lophoc lophoc2 = new Lophoc("DHKTPM15B", "Đại học kỹ thuật phần mềm 15B - Khoa CNTT", 60);
//		lophocDao.themLophoc(lophoc );
//		lophocDao.capnhatLophoc(lophoc );
		
//		Lophoc lh = lophocDao.getLophoc("DHKTPM15A");
//		System.out.println(lh);
		
//		lophocDao.getDSLophoc()
//		.forEach(lh -> System.out.println(lh));
		
		Set<String> dsDienthoai = new TreeSet<String>();
		dsDienthoai.add("0913556556");
		dsDienthoai.add("0914556656");
		
		Sinhvien sinhvien = new Sinhvien("19344301", "NGuyễn", "Lan", "Nữ", 
				LocalDate.of(2001, Calendar.APRIL, 10), dsDienthoai);
		
		sinhvien.setDiachi(new Diachi("04", "Nguyễn Văn Bảo", "4", "Gò vấp", "HCM"));
		
		sinhvien.setLophoc(lophoc1);
		
//		sinhvienDao.themSinhvien(sinhvien);
		
		Sinhvien x = sinhvienDao.getSinhvienTheoTenSV("Lành");
		System.out.println(x);
		
//		EntityManagerFactory factory = Persistence.createEntityManagerFactory("DHKTPM15A_JPA_Hibernate_ORM");
//		EntityManager em = factory.createEntityManager();
//		EntityTransaction tr = em.getTransaction();
//		
//		try {
//			tr.begin();
//			
//			
//			
//			tr.commit();
//		}catch (Exception e) {
//			tr.rollback();
//		}
		
	}
}
