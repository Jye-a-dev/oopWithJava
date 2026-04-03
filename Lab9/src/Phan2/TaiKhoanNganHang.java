package Phan2;

import java.util.Scanner;

public class TaiKhoanNganHang {
	public Scanner sc = new Scanner(System.in);
	public String getSoTaiKhoan() {
		return soTaiKhoan;
	}

	public void setSoTaiKhoan(String soTaiKhoan) {
		this.soTaiKhoan = soTaiKhoan;
	}

	public String getChuTaiKhoan() {
		return chuTaiKhoan;
	}

	public void setChuTaiKhoan(String chuTaiKhoan) {
		this.chuTaiKhoan = chuTaiKhoan;
	}

	public double getSoDu() {
		return soDu;
	}

	public void setSoDu(int soDu) {
		this.soDu = soDu;
	}

	public String soTaiKhoan;
	public String chuTaiKhoan;
	public double soDu;

	public TaiKhoanNganHang() {
		super();
		soTaiKhoan = "";
		chuTaiKhoan = "";
		soDu = 0;
	}

	public TaiKhoanNganHang(String SoTaiKhoan, String ChuTaiKhoan, int SoDu) {
		super();
		this.soTaiKhoan = SoTaiKhoan;
		this.chuTaiKhoan = ChuTaiKhoan;
		this.soDu = SoDu;
	}
	public void nhap() {
		System.out.println("Nhập số tài khoản: ");
		this.soTaiKhoan = sc.nextLine();
		
		System.out.println("Nhập chủ tài khoản: ");
		this.chuTaiKhoan = sc.nextLine();
		
		System.out.println("Nhập số dư hiện tại: ");
		this.soDu = Double.parseDouble(sc.nextLine());
	}
	
	public void napTien() {
		System.out.println("Nhập số tiền cần nạp: ");
		double money = Double.parseDouble(sc.nextLine());
		this.soDu += money;
		System.out.println("Nạp thành công ");
	}
	public void rutTien() {
		System.out.println("Nhập số tiền cần rút: ");
		Double money = Double.parseDouble(sc.nextLine());
		
		if (money > this.soDu) {
			System.out.println("Tài khoản nghèo");
		} else {
			this.soDu -= money;
			System.out.println("Rút thành công ");
		}
	}
	public void hienThiThongTin() {
		System.out.println("STK: " + this.soTaiKhoan + " Tên TK: " + this.chuTaiKhoan + " Số dư: " + this.soDu);
	}

}
