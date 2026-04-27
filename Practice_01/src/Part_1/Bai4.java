package Part_1;

import java.util.Scanner;

public class Bai4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhập n: ");
		int n = Integer.parseInt(sc.nextLine());
		checkCube(n);
		
	}
	public static void checkCube(int n) {
		double k = Math.cbrt(n);
		if (Math.pow(Math.round(k), 3) == n) {
			System.out.println("Là số lập phương");
		} else {
			System.out.println("Không là số lập phương");
		}
	}
}
