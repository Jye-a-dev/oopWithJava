package exception;

import java.util.Scanner;

public class Cau6 {
	public static void main(String[] args) {
		checkChuoi();
	}
	
	public static void checkChuoi() {
		Scanner sc = new Scanner(System.in); 
		try {
			System.out.println("Nhập 1 chuỗi: ");
			String chuoi = sc.nextLine();
			System.out.println("Nhập 1 chỉ số trong chuỗi đó để in ra: ");
			int index = Integer.parseInt(sc.nextLine());
			char kiTu = chuoi.charAt(index);
			System.out.println(kiTu);
			
		} catch(StringIndexOutOfBoundsException e) {
			System.out.println("Không có trong chuỗi");
		}
	}
}
