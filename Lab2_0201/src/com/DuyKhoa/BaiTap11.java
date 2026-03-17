package com.DuyKhoa;

public class BaiTap11 {
	public static void main(String[] args) {
		simpleCalculator('+', 2, 5);
		simpleCalculator('/', 2, 0);
	}
	static void simpleCalculator(char o,int a, int b) {
		switch(o) {
			case '+':
				System.out.println(a+b);
				break;
			case '-':
				System.out.println(a-b);
				break;
			case '*':
				System.out.println(a*b);
				break;
			case '/':
				try {
					System.out.println(a/b);
				} catch(Exception e) {
					System.out.println("Phép tính không thể chia cho 0");
				}
				break;
			default:
				System.out.println("Phép tính không hợp lệ");
				break;
		}
	}
}
