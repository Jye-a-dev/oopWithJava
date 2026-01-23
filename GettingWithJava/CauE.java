package GettingWithJava;

import java.util.Scanner;

public class CauE {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhập điểm tóan: ");
		float toan = sc.nextFloat();
		System.out.println("Nhập điểm lý: ");
		float ly = sc.nextFloat();
		System.out.println("Nhập điểm hoá: ");
		float hoa = sc.nextFloat();
		
		float trungBinh = (toan + ly + hoa)/3 ;
		
		System.out.println("Điểm trung bình: " + trungBinh);
	}
}
