package entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Monhoc {
	
	@Id
	private String msmh;
	private String tenmh;
	private int hockygd;
	private int sotc;
	
	@OneToMany(mappedBy = "monhoc")
	private List<Bangdiem> dsdk;

	public Monhoc() {
	}

	public Monhoc(String msmh, String tenmh, int hockygd, int sotc) {
		super();
		this.msmh = msmh;
		this.tenmh = tenmh;
		this.hockygd = hockygd;
		this.sotc = sotc;
	}

	public String getMsmh() {
		return msmh;
	}

	public void setMsmh(String msmh) {
		this.msmh = msmh;
	}

	public String getTenmh() {
		return tenmh;
	}

	public void setTenmh(String tenmh) {
		this.tenmh = tenmh;
	}

	public int getHockygd() {
		return hockygd;
	}

	public void setHockygd(int hockygd) {
		this.hockygd = hockygd;
	}

	public int getSotc() {
		return sotc;
	}

	public void setSotc(int sotc) {
		this.sotc = sotc;
	}

	public List<Bangdiem> getDsdk() {
		return dsdk;
	}

	public void setDsdk(List<Bangdiem> dsdk) {
		this.dsdk = dsdk;
	}

	@Override
	public String toString() {
		return "Monhoc [msmh=" + msmh + ", tenmh=" + tenmh + ", hockygd=" + hockygd + ", sotc=" + sotc + "]";
	}
	
	
}
