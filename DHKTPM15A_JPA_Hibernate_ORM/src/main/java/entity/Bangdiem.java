package entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@IdClass(BangdiemPK.class)
public class Bangdiem {
	
	@Id
	@ManyToOne
	@JoinColumn(name="mssv")
	private Sinhvien sinhvien;
	
	@Id
	@ManyToOne
	@JoinColumn(name="msmh")
	private Monhoc monhoc;
	
	@Id
	private int lanthi;
	private float diemthi;
	
	public Bangdiem() {
	}

	public Bangdiem(Sinhvien sinhvien, Monhoc monhoc, int lanthi, float diemthi) {
		super();
		this.sinhvien = sinhvien;
		this.monhoc = monhoc;
		this.lanthi = lanthi;
		this.diemthi = diemthi;
	}

	public Sinhvien getSinhvien() {
		return sinhvien;
	}

	public void setSinhvien(Sinhvien sinhvien) {
		this.sinhvien = sinhvien;
	}

	public Monhoc getMonhoc() {
		return monhoc;
	}

	public void setMonhoc(Monhoc monhoc) {
		this.monhoc = monhoc;
	}

	public int getLanthi() {
		return lanthi;
	}

	public void setLanthi(int lanthi) {
		this.lanthi = lanthi;
	}

	public float getDiemthi() {
		return diemthi;
	}

	public void setDiemthi(float diemthi) {
		this.diemthi = diemthi;
	}

	@Override
	public String toString() {
		return "Bangdiem [sinhvien=" + sinhvien + ", monhoc=" + monhoc + ", lanthi=" + lanthi + ", diemthi=" + diemthi
				+ "]";
	}
	
	
}
