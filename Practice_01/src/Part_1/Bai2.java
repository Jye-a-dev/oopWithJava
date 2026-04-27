package Part_1;

import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhập cạnh 1: ");
		int a = Integer.parseInt(sc.nextLine());
		
		System.out.println("Nhập cạnh 2: ");
		int b = Integer.parseInt(sc.nextLine());
		
		System.out.println("Nhập cạnh 3: ");
		int c = Integer.parseInt(sc.nextLine());
				
		checkIsoscelesTriangle(a, b, c);
	}

	public static void checkIsoscelesTriangle(int a, int b, int c) {
		if (a == b || a == c || b == c) {
			System.out.println("Là tam giác cân");
		} else {
			System.out.println("Không là tam giác cân");
		}

	}
}
