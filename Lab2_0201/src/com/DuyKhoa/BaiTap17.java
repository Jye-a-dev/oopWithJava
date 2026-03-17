package com.DuyKhoa;

import java.util.Scanner;
import java.util.Random;

public class BaiTap17 {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int options; 
		
		System.out.println("Nhập N: ");
		  int n = Integer.parseInt(sc.nextLine());
		  int[] a = new int[n];
		  
		do {
			System.out.println("Chọn (0: thoát ,1: Nhập, 2: Xuất, 3: Mảng ngẫu nhiên, 4: Mảng số chẵn, 5: Số lẻ lớn nhất, 6: Kiểm tra số nguyên tố): ");
			  options = Integer.parseInt(sc.nextLine());
			  switch (options) {
			  case 1:
				  nhapMang(a, n);
				  break;
			  case 2:
				  xuatMang(a, n);
				  break;
			  case 3:
				  nhapMangRandom(a, n);
				  xuatMang(a, n);
				  break;
			  case 4:
				  xuatPhanTuChan(a, n);
				  break;
			  case 5:
				  timSoLeLonNhat(a, n);
				  break;
			  case 6:
				  lietKeSoNguyenTo(a, n);
				  break;
			  }
		} while(options != 0);
		sc.close();		
	}
	
	static void nhapMang(int[] a, int n) {
		System.out.println("==Nhập mảng==");
		for (int i = 0; i<n;i++) {
			System.out.print("Nhập phần tử thứ: "+ (i+1) + ": ");
			a[i] = Integer.parseInt(sc.nextLine());
		} 
	}
	
	static void xuatMang(int[] a, int n) {
		System.out.println("Mảng: ");
		for (int i = 0; i<n; i++) {
			System.out.println(a[i]+ "\t");
		}
	}
	
	static void nhapMangRandom(int[] a, int n) {
		Random rd = new Random();
		for (int i = 0; i<n;i++) {
			a[i] = rd.nextInt(100);
		}
	}
	
	static void xuatPhanTuChan(int[]a, int n) {
		System.out.println("Phần tữ chẵn");
		for (int i = 0; i<n;i++) {
			if (a[i] % 2 ==0) {
				System.out.println(a[i]);
			}
		}
	}
	static void timSoLeLonNhat(int[] a, int n) {
		System.out.println("Số lẻ lớn nhất: ");
		int maxLe = a[0];
		for (int i = 1; i<n; i++) {
			if(a[i] % 2 != 0 ) {
				if (maxLe < a[i]) {
					maxLe = a[i];
				}
			}
		}
		System.out.println(maxLe);
	}
	static void lietKeSoNguyenTo(int[] a, int n) {
		System.out.println("Các số nguyên tố");
		for(int i = 0; i<n; i++) {
			if (kiemTraSoNguyenTo(a[i]) == true) {
				System.out.println(a[i]);
			}
		}
	}
	static boolean kiemTraSoNguyenTo(int n) {
		if (n < 2) {
			return false;
		}
		for (int i = 2;i<=Math.sqrt(n); i++) {
			if (n%i ==0) {
				return false;
			}
		}
		return true;
	}
}
