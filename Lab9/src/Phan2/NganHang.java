package Phan2;

import java.util.Scanner;

public class NganHang {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int option = 0;
		do {
			TaiKhoanTinDung TKTD = new TaiKhoanTinDung();
			TaiKhoanTietKiem TKTK = new TaiKhoanTietKiem();
			TaiKhoanNganHang TK =  new TaiKhoanNganHang();
			System.out.println("MENU: 1: Tạo TK Tiết kiệm, 2: Tạo TaiKhoanTinDung, 3: tài khoản bình thường");
			option = Integer.parseInt(sc.nextLine());
			switch (option) {
			case 1:
				TKTD.nhap();
				TKTD.napTien();
				TKTD.rutTien();
				TKTD.hienThiThongTin();
				break;
			case 2:
				TKTK.nhap();
				TKTK.napTien();
				TKTK.rutTien();
				TKTK.hienThiThongTin();
				break;
			case 3:
				TK.nhap();
				TK.napTien();
				TK.rutTien();
				TK.hienThiThongTin();
			}
		} while (option != 0);

	}
}
