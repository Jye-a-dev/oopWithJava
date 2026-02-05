package GettingWithJava;

import java.util.Scanner;

public class CauG {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Nhập vào số nguyên a: ");
			int a = sc.nextInt();
			System.out.println("Nhập vào số nguyên b: ");
			int b = sc.nextInt();
			if (a > b) {
				System.out.println(a + " : là max");
				System.out.println(b + " : là min");
			} else if(a == b) {
				System.out.println("Không có max min");
			} 
			else {
				System.out.println(a + " : là min");
				System.out.println(b + " : là max");
			}
		}
	}
}
