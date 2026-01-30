package exception;

import java.util.Scanner;

public class Cau5 {
	public static void main(String[] args) throws InvalidAgeException {
		checkDiemTrungBinh();
	}
	public static void checkDiemTrungBinh() throws InvalidAgeException {
		try {
			Scanner sc = new Scanner(System.in); 
			System.out.println("Nhập điểm trung bình sinh viên: ");
			double diemTb = Double.parseDouble(sc.nextLine());
			
			if (diemTb < 0 || diemTb > 10) {
				throw new InvalidAgeException("Điểm không hợp lệ");
			}else {
				System.out.println("Điểm trung bình của sinh viên là: "+ diemTb);
			}
		}
		catch(NumberFormatException e) {
			System.out.println("Không phải số");
		}
	
	}
}

class InvalidAgeException extends Exception {
    InvalidAgeException(String s) {
        super(s);
    }
}
