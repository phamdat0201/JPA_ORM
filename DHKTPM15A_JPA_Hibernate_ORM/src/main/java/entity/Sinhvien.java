package entity;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Sinhvien {
	
	@Id
	private String mssv;
	@Column(name = "hosv", columnDefinition = "nvarchar(255)")
	private String ho;
	@Column(name = "tensv", columnDefinition = "nvarchar(255)", nullable = false)
	private String ten;
	@Column(name = "gioitinh", columnDefinition = "nvarchar(255)")
	private String gioitinh;
	private LocalDate ngaysinh;
	
	@Embedded
	private Diachi diachi;
	
	@ElementCollection
	@CollectionTable(name = "Dienthoai",
		joinColumns = @JoinColumn(name="mssv")
	)
	@Column(name = "dienthoai", nullable = false)
	private Set<String> dsDienthoai;
	
	@ManyToOne
	@JoinColumn(name="mslop")
	private Lophoc lophoc;
	
	@OneToMany(mappedBy = "sinhvien")
	private List<Bangdiem> dsdk;
	
	public Sinhvien() {
	}

	public Sinhvien(String mssv, String ho, String ten, String gioitinh, LocalDate ngaysinh, Set<String> dsDienthoai) {
		super();
		this.mssv = mssv;
		this.ho = ho;
		this.ten = ten;
		this.gioitinh = gioitinh;
		this.ngaysinh = ngaysinh;
		this.dsDienthoai = dsDienthoai;
	}

	public String getMssv() {
		return mssv;
	}

	public void setMssv(String mssv) {
		this.mssv = mssv;
	}

	public String getHo() {
		return ho;
	}

	public void setHo(String ho) {
		this.ho = ho;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getGioitinh() {
		return gioitinh;
	}

	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}

	public LocalDate getNgaysinh() {
		return ngaysinh;
	}

	public void setNgaysinh(LocalDate ngaysinh) {
		this.ngaysinh = ngaysinh;
	}

	public Diachi getDiachi() {
		return diachi;
	}

	public void setDiachi(Diachi diachi) {
		this.diachi = diachi;
	}

	public Set<String> getDsDienthoai() {
		return dsDienthoai;
	}

	public void setDsDienthoai(Set<String> dsDienthoai) {
		this.dsDienthoai = dsDienthoai;
	}

	public Lophoc getLophoc() {
		return lophoc;
	}

	public void setLophoc(Lophoc lophoc) {
		this.lophoc = lophoc;
	}

	public List<Bangdiem> getDsdk() {
		return dsdk;
	}

	public void setDsdk(List<Bangdiem> dsdk) {
		this.dsdk = dsdk;
	}

	@Override
	public String toString() {
		return "Sinhvien [mssv=" + mssv + ", ho=" + ho + ", ten=" + ten + ", gioitinh=" + gioitinh + ", ngaysinh="
				+ ngaysinh + ", dsDienthoai=" + dsDienthoai + "]";
	}
	
	
	
	
}
