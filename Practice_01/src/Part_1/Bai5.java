package Part_1;

import java.util.Scanner;

public class Bai5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập n: ");
		double n = Double.parseDouble(sc.nextLine());
		
		checkStudent(n);
	}
	public static void checkStudent(double n) {
		if (n > 8.5) {
			System.out.println("Học sinh giỏi");
		} else if(n> 7.5) {
			System.out.println("Học sinh Khá");
		} else if(n> 5.5) {
			System.out.println("Học sinh TB");
		} else {
			System.out.println("Học sinh Kém");
		}
	}
}
