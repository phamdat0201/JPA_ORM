package entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Diachi {
	
	@Column(columnDefinition = "nvarchar(255)")
	private String sonha;
	@Column(columnDefinition = "nvarchar(255)")
	private String duong;
	@Column(columnDefinition = "nvarchar(255)")
	private String phuong;
	@Column(columnDefinition = "nvarchar(255)")
	private String quan;
	@Column(columnDefinition = "nvarchar(255)")
	private String thanhpho;
	
	public Diachi() {
	}

	public Diachi(String sonha, String duong, String phuong, String quan, String thanhpho) {
		super();
		this.sonha = sonha;
		this.duong = duong;
		this.phuong = phuong;
		this.quan = quan;
		this.thanhpho = thanhpho;
	}

	public String getSonha() {
		return sonha;
	}

	public void setSonha(String sonha) {
		this.sonha = sonha;
	}

	public String getDuong() {
		return duong;
	}

	public void setDuong(String duong) {
		this.duong = duong;
	}

	public String getPhuong() {
		return phuong;
	}

	public void setPhuong(String phuong) {
		this.phuong = phuong;
	}

	public String getQuan() {
		return quan;
	}

	public void setQuan(String quan) {
		this.quan = quan;
	}

	public String getThanhpho() {
		return thanhpho;
	}

	public void setThanhpho(String thanhpho) {
		this.thanhpho = thanhpho;
	}

	@Override
	public String toString() {
		return "Diachi [sonha=" + sonha + ", duong=" + duong + ", phuong=" + phuong + ", quan=" + quan + ", thanhpho="
				+ thanhpho + "]";
	}

	
}
