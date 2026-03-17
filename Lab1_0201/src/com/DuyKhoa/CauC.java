package com.DuyKhoa;

import java.util.Scanner;

public class CauC {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập a: ");
		int a = sc.nextInt();
		System.out.println("Nhâp b: ");
		int b = sc.nextInt();
		int Tong = a+b;
		int Hieu = a-b;
		int Tich = a*b;
		float Thuong = a/b;
		System.out.println("Tổng: "+ Tong);
		System.out.println("Hiệu: "+ Hieu);
		System.out.println("Tích: "+ Tich);
		System.out.println("Thương: "+ Thuong);
	}
}
