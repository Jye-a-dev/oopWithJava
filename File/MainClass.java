package File;

import java.io.IOException;
import java.util.Scanner;

public class MainClass {
	
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		int option;
		
		do {
			System.out.println("Nhập lựa chọn: ");
			System.out.println("1 check, 2 tạo, 3 đọc, 4 ghi , 5 copy, 6 đọc dòng, 7 đếm");

			option = Integer.parseInt(sc.nextLine());
			
			_File file = new _File();
			String fileName;
			switch (option) {
				case 1 -> {
                                    System.out.println("Nhập tên file: ");
                                    fileName = sc.nextLine();
                                    file.check(fileName);
                        }
				case 2 -> {
                                    System.out.println("Nhập tên file: ");
                                    fileName = sc.nextLine();
                                    file.create(fileName);
                        }
				case 3 -> {
                                    System.out.println("Nhập tên file: ");
                                    fileName = sc.nextLine();
                                    file.read(fileName);
                        }
				case 4 -> {
                                    System.out.println("Nhập tên file: ");
                                    fileName = sc.nextLine();
                                    
                                    System.out.println("Nhập nội dung: ");
                                    String content = sc.nextLine();
                                    
                                    file.Write(fileName, content);
                        }
				case 5 -> {
                                    System.out.println("Nhập tên file 1: ");
                                    String fileName1 = sc.nextLine();
                                    
                                    System.out.println("Nhập tên file 2: ");
                                    String fileName2 = sc.nextLine();
                                    
                                    file.clone(fileName1, fileName2);
                        }
				case 6 -> {
                                    System.out.println("Nhập tên file: ");
                                    fileName = sc.nextLine();
                                    
                                    file.ReadLine(fileName);
                        }
				case 7 -> {
                                    System.out.println("Nhập tên file: ");
                                    fileName = sc.nextLine();
                                    
                                    file.count(fileName);
                        }
				}
			} while (option != 0);
	}
}
