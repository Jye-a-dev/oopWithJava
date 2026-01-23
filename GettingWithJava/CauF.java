package GettingWithJava;

import java.util.Scanner;

public class CauF {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập bán kính: ");
		double R = sc.nextDouble();
		double chuVi = 2 * 3.14 * R;
		double dienTich = 3.14 * 3.14 * R;
		System.out.println("Chu vi hình tròn: "+ chuVi);
		System.out.println("Diện tích hình tròn: "+ dienTich);
	}
}
