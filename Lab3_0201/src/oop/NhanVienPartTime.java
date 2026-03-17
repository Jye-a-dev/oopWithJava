package oop;

public class NhanVienPartTime extends NhanVien implements ILuong {
	private int soGioLam;
	private double luongTheoGio;
	
	public int getSoGioLam() {
		return soGioLam;
	}

	public void setSoGioLam(int soGioLam) {
		this.soGioLam = soGioLam;
	}

	public double getLuongTheoGio() {
		return luongTheoGio;
	}

	public void setLuongTheoGio(double luongTheoGio) {
		this.luongTheoGio = luongTheoGio;
	}

	public NhanVienPartTime() {}
	
	public NhanVienPartTime(String maNV, String hoTen, double luongCB, int gioLam, double luongTheoGio) {
		super(maNV, hoTen, luongCB);
		this.luongTheoGio = luongTheoGio;
		this.soGioLam = gioLam;
	}
	@Override
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("Số giờ làm: "+ this.soGioLam);
		System.out.println("Lương theo giờ "+ this.luongTheoGio);
		System.out.println("Tổng lương: " + tinhLuong());
	}
	@Override
	public double tinhLuong() {

		return this.soGioLam * this.luongTheoGio;
	}

}
