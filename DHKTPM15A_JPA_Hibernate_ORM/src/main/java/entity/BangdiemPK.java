package entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class BangdiemPK implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7246485906446023185L;
	private String sinhvien;
	private String monhoc;
	private int lanthi;
	
	public BangdiemPK() {
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + lanthi;
		result = prime * result + ((monhoc == null) ? 0 : monhoc.hashCode());
		result = prime * result + ((sinhvien == null) ? 0 : sinhvien.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BangdiemPK other = (BangdiemPK) obj;
		if (lanthi != other.lanthi)
			return false;
		if (monhoc == null) {
			if (other.monhoc != null)
				return false;
		} else if (!monhoc.equals(other.monhoc))
			return false;
		if (sinhvien == null) {
			if (other.sinhvien != null)
				return false;
		} else if (!sinhvien.equals(other.sinhvien))
			return false;
		return true;
	}

	
}
