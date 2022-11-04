package entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

@Entity
public class HosoLophoc {

	@Id
	private String mshs;
	private Date ngaylap;
	@Column(columnDefinition = "text")
	private String ghichu;
	
	@OneToOne
	@MapsId
	@JoinColumn(name="mslop")
	private Lophoc lophoc;
	
	public HosoLophoc() {
	}

	public HosoLophoc(String mshs, Date ngaylap, String ghichu) {
		super();
		this.mshs = mshs;
		this.ngaylap = ngaylap;
		this.ghichu = ghichu;
	}

	public String getMshs() {
		return mshs;
	}

	public void setMshs(String mshs) {
		this.mshs = mshs;
	}

	public Date getNgaylap() {
		return ngaylap;
	}

	public void setNgaylap(Date ngaylap) {
		this.ngaylap = ngaylap;
	}

	public String getGhichu() {
		return ghichu;
	}

	public void setGhichu(String ghichu) {
		this.ghichu = ghichu;
	}

	public Lophoc getLophoc() {
		return lophoc;
	}

	public void setLophoc(Lophoc lophoc) {
		this.lophoc = lophoc;
	}

	@Override
	public String toString() {
		return "HosoLophoc [mshs=" + mshs + ", ngaylap=" + ngaylap + ", ghichu=" + ghichu + "]";
	}
	
	
		
}
