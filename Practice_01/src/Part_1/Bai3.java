package Part_1;

import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Nhập n: ");
		int n = Integer.parseInt(sc.nextLine());

		sumFactorial(n);
	}

	public static void sumFactorial(int n) {
		long a = 0;
		long b = 1;
		for (int i = 1; i <= n + 1; i++) {
			b *= i;
			a += b;
		}
		System.out.println("Tổng giai thừa là: " + a);
	}
}
