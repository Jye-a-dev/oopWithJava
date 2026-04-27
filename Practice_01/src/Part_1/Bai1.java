package Part_1;

import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhập n: ");
		int n = Integer.parseInt(sc.nextLine());
		checkOddEven(n);
	}
	public static void checkOddEven(int n) {
		if(n % 2 == 0) {
			System.out.println("Là số chẵn");
		} else {
			System.out.println("Là số lẻ");
		}
	}
}
