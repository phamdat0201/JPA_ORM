package service;

import java.util.List;

import entity.Lophoc;

public interface LophocService {
	public boolean themLophoc(Lophoc lophoc);
	public boolean capnhatLophoc(Lophoc lophoc);
	public boolean xoaLophoc(String mslop);
	public Lophoc getLophoc(String mslop);
	public List<Lophoc> getDSLophoc();
}
