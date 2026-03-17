package exception;

import java.util.Scanner;

public class Cau3 {
	public static void main(String[] args) {
		checkMang();
	}
	public static void checkMang() {
		Scanner sc = new Scanner(System.in); 
		int mang[] = {2,5,6,18,36};
		try {
			for (int i : mang) {
				System.out.print(i + ",");
			}
			System.out.println(" Nhập phần tử cần check: " );
			int check =  Integer.parseInt(sc.nextLine());
			System.out.println(mang[check] + ": là phần tử thứ: " + check);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("không có phần tử đó");
		} catch(NumberFormatException e) {
			System.out.println("Không phải số");
		}
	}
}
