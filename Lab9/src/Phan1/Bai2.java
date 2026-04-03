package Phan1;

import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập cạnh góc vuông a: ");
		int a = Integer.parseInt(sc.nextLine());
		System.out.println("Nhập cạnh góc vuông b: ");
		int b = Integer.parseInt(sc.nextLine());
		System.out.println("Nhập cạnh huyền c: ");
		int c = Integer.parseInt(sc.nextLine());
		checkPytagore(a, b, c);
	}
	public static void checkPytagore(int a, int b, int c) {
		if((a*a) + (b*b) == (c*c) ) {
			System.out.println("Là tam giác vuông");
		} else {
			System.out.println("Không là tam giác vuông");
		}
	}
}
