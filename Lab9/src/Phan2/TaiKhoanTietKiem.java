package Phan2;

import java.util.Scanner;

public class TaiKhoanTietKiem extends TaiKhoanNganHang {
	public Scanner sc = new Scanner(System.in);
	double LaiSuat;

	public double getLaiSuat() {
		return LaiSuat;
	}

	public void setLaiSuat(double laiSuat) {
		LaiSuat = laiSuat;
	}

	public TaiKhoanTietKiem() {
	}

	public TaiKhoanTietKiem(String SoTaiKhoan, String ChuTaiKhoan, int SoDu, double laiSuat) {
		super();
		this.LaiSuat = laiSuat;
	}

	@Override
	public void nhap() {
		System.out.println("Nhập lãi suất: ");
		this.LaiSuat = Double.parseDouble(sc.nextLine());
	}
	public void tinhLai() {
		double Lai = this.soDu * this.LaiSuat;
	}

	@Override
	public void napTien() {
		super.napTien();
	}
	@Override
	public void rutTien() {
		super.rutTien();
	}
	@Override
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("Lãi: "+ this.LaiSuat);
	}
}
