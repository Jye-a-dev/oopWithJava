package GettingWithJava;

import java.util.Scanner;

public class CauD {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhập tên sản phẩm: ");
		String name = sc.nextLine();
		System.out.println("Nhập số lượng: ");
		int soLuong = sc.nextInt();
		System.out.println("Nhập đon giá: ");
		float donGia = sc.nextFloat();
		
		float tien = soLuong * donGia;
		float Vat = tien * 0.1f;
		
		System.out.println("Tên: "+ name);
		System.out.println("Số lượng: "+ soLuong);
		System.out.println("Đơn giá: "+ donGia);
		System.out.println("Tiền: "+ tien);
		System.out.println("Vat: "+ Vat);
		System.out.println("Tổng tiền: "+ (Vat+tien));
	}
}
