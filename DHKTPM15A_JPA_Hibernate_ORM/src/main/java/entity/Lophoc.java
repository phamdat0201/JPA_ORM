package entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
//@Table(name = "lop_hoc")
public class Lophoc {
	
	@Id
	private String mslop;
	@Column(columnDefinition = "nvarchar(255)", nullable = false, unique = true)
	private String tenlop;
	private int sisoDukien;
	
	//Relationship
	@OneToMany(mappedBy = "lophoc")
	private List<Sinhvien> dssv;
	
	@OneToOne
	@PrimaryKeyJoinColumn
	private HosoLophoc hosoLophoc;
	
	public Lophoc() {
	}
	
	public Lophoc(String mslop, String tenlop, int sisoDukien) {
		super();
		this.mslop = mslop;
		this.tenlop = tenlop;
		this.sisoDukien = sisoDukien;
	}
	
	

	
	public List<Sinhvien> getDssv() {
		return dssv;
	}

	public void setDssv(List<Sinhvien> dssv) {
		this.dssv = dssv;
	}

	public HosoLophoc getHosoLophoc() {
		return hosoLophoc;
	}

	public void setHosoLophoc(HosoLophoc hosoLophoc) {
		this.hosoLophoc = hosoLophoc;
	}

	public String getMslop() {
		return mslop;
	}

	public void setMslop(String mslop) {
		this.mslop = mslop;
	}

	public String getTenlop() {
		return tenlop;
	}

	public void setTenlop(String tenlop) {
		this.tenlop = tenlop;
	}

	public int getSisoDukien() {
		return sisoDukien;
	}

	public void setSisoDukien(int sisoDukien) {
		this.sisoDukien = sisoDukien;
	}

	@Override
	public String toString() {
		return "Lophoc [mslop=" + mslop + ", tenlop=" + tenlop + ", sisoDukien=" + sisoDukien + "]";
	}
	
	
	
	
}
