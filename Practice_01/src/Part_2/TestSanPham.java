package Part_2;

import java.util.Scanner;

public class TestSanPham {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int option = 0;
		do {
			SanPhamDienTu SPDT = new SanPhamDienTu();
			SanPhamThucPham SPTP = new SanPhamThucPham();
			SanPhamThoiTrang SPTT = new SanPhamThoiTrang();
			System.out.println("1 2 3");
			option = Integer.parseInt(sc.nextLine());
			switch(option) {
			case 1:
				SPDT.Nhap();
				System.out.println("Nhập phần trăm giảm giá hiện tại: ");
				int phanTram = Integer.parseInt(sc.nextLine());
				SPDT.GiamGia(phanTram);
				SPDT.hienThi();
				break;
			case 2:
				SPTP.Nhap();
				System.out.println("Nhập phần trăm giảm giá hiện tại: ");
				int phanTram1 = Integer.parseInt(sc.nextLine());
				SPTP.GiamGia(phanTram1);
				SPTP.hienThi();
				break;
			case 3:
				SPTT.Nhap();
				System.out.println("Nhập phần trăm giảm giá hiện tại: ");
				int phanTram2 = Integer.parseInt(sc.nextLine());
				SPTT.GiamGia(phanTram2);
				SPTT.hienThi();
				break;
			}
			
		}while (option!= 0);
	}
}
