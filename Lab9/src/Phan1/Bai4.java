package Phan1;

import java.util.Scanner;

public class Bai4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số: ");
		int n = Integer.parseInt(sc.nextLine());
		checkCP(n);
	}
	public static void checkCP(int n) {
		if (Math.sqrt(n) - Math.floor(Math.sqrt(n)) == 0 ) {
			System.out.println(n + " là số chính phương");
		} else {
			System.out.println(n + " không là số chính phương");
		}
	}
}
	