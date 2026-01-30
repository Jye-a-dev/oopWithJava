package exception;

import java.util.Scanner;

public class Cau2 {
	public static void main(String[] args) {
		chiaHopLe();
	}
	public static void chiaHopLe() {
		try {
			Scanner sc = new Scanner(System.in); 
			System.out.println("Nhập a: ");
			double a =  Double.parseDouble(sc.nextLine());
			System.out.println("Nhập b: ");
			double b = Double.parseDouble(sc.nextLine());
			if (b == 0) {
				throw new ArithmeticException("Không chia 0 được");	
			}
			else {
				double Chia = a/b;
				System.out.println(Chia);
			}
		}catch(NumberFormatException e) {
			System.out.println("Không phải số");
		}
	}
}
