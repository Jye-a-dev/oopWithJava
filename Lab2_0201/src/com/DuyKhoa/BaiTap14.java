package com.DuyKhoa;

public class BaiTap14 {
	public static void main(String[] args) {
		findFactorial(5);
	}
	static void findFactorial(int n) {
		int a = 1;
		for(int i = 1; i <=n; i++) {
			a *= i;
		}
		System.out.println(a);
	}
}
