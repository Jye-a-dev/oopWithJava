package Phan1;

import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập năm cần check: ");
		int Year = Integer.parseInt(sc.nextLine());
		checkYear(Year);
	}

	public static void checkYear(int Year) {
		if (Year % 100 == 0 && Year % 400 != 0) {
			System.out.println(Year + " không là năm nhuận");
		} else if (Year % 4 == 0) {
			System.out.println(Year + " là năm nhuận");
		} else {
			System.out.println(Year + " không là năm nhuận");
		}
	}
}
