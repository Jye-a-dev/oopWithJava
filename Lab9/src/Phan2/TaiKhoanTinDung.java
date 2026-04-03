package Phan2;

import java.util.Scanner;

public class TaiKhoanTinDung extends TaiKhoanNganHang {
	public Scanner sc = new Scanner(System.in);
	double TinDung;
	public TaiKhoanTinDung() {};
	public TaiKhoanTinDung(String SoTaiKhoan, String ChuTaiKhoan, int SoDu, double TinDung) {
		super();
		this.TinDung = TinDung;
	}

	@Override
	public void nhap() {
		System.out.println("Nhập tín dụng: ");
		this.TinDung = Double.parseDouble(sc.nextLine());
	}

	@Override
	public void napTien() {
		super.napTien();
	}

	@Override
	public void rutTien() {
		if (this.TinDung > this.soDu) {
			System.out.println("Tài khoản không rút được");
		}
		super.rutTien();
	}

	@Override
	public void hienThiThongTin() {
		super.hienThiThongTin();
	}
}
