package oop;

public class NhanVien {
	protected String maNV;
	protected String hoTen;
	protected double LuongCB;

	public String getMaNV() {
		return maNV;
	}

	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public double getLuongCB() {
		return LuongCB;
	}

	public void setLuongCB(double luongCB) {
		LuongCB = luongCB;
	}
	
	public NhanVien(String maNV, String hoTen, double luongCB) {
		super();
		this.maNV = maNV;
		this.hoTen = hoTen;
		LuongCB = luongCB;
	}

	public NhanVien() {
		this.hoTen ="";
		this.maNV = "";
		this.LuongCB = 0.0;
	}
	
	public void hienThiThongTin() {
		System.out.println("Họ tên: " + this.hoTen + ", Mã nhân viên: " + this.maNV + ", Lương cơ bản: " + this.LuongCB );
	}
}
