package service;

import java.util.List;

import entity.Sinhvien;

public interface SinhvienService {
	public boolean themSinhvien(Sinhvien Sinhvien);
	public boolean capnhatSinhvien(Sinhvien Sinhvien);
	public boolean xoaSinhvien(String mssv);
	public Sinhvien getSinhvien(String mssv);
	public Sinhvien getSinhvienTheoTenSV(String tensv);
	public List<Sinhvien> getDSSinhvien();
}
