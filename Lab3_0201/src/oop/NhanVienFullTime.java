package oop;

public class NhanVienFullTime extends NhanVien implements ILuong {
	private double heSoLuong;
	
	public NhanVienFullTime() {}
	
	
	public double getHeSoLuong() {
		return heSoLuong;
	}


	public void setHeSoLuong(double heSoLuong) {
		this.heSoLuong = heSoLuong;
	}


	public NhanVienFullTime(String maNV, String hoTen, double luongCB, double heSoLuong) {
		super(maNV, hoTen, luongCB);
		this.heSoLuong = heSoLuong;
	}

	@Override 
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("Hệ số lương: "+ this.heSoLuong);
		System.out.println("Tổng lương: " + tinhLuong());
	}
	
	@Override
	public double tinhLuong() {
		return this.LuongCB * this.heSoLuong;
	}
}
