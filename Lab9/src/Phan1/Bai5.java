package Phan1;

import java.util.Scanner;

public class Bai5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập chiều cao: ");
		double h = Double.parseDouble(sc.nextLine());
		System.out.println("Nhập cân lặng: ");
		double w = Double.parseDouble(sc.nextLine());
		double bmi = w / h*h ;
		checkBMI(bmi);
	}
	public static void checkBMI(double bmi) {
		if(bmi > 18.5) {
			System.out.println(bmi+ " Gầy");
		} else if(bmi > 24.9) {
			System.out.println(bmi+ " Bình thường");
		} else if(bmi > 29.9) {
			System.out.println(bmi+ " Thừa cân");
		} else {
			System.out.println(bmi+ " Béo phì");
		}
	}
}
