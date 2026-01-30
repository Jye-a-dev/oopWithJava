package exception;

import java.util.Scanner;

public class Cau1 {
	public static void main(String[] args) {
		checkValidNumber();
	}
	public static void checkValidNumber() {
		Scanner sc = new Scanner(System.in); 
		try {
			System.out.println("Nhập 1 số: ");
			double number = Double.parseDouble(sc.nextLine());
			System.out.println(number + " :Là 1 số");
		} catch (Exception e) {
			System.out.println("Không phải số");
		}
	}
}
