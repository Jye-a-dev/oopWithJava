package Part_1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Bai6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int option = 0;
		do {
			System.out.println("Menu 1 2 3");
			option = Integer.parseInt(sc.nextLine());
			System.out.println("Tên file: ");
			String nameFile = sc.nextLine() + ".txt";
			switch (option) {
			case 1:
				check (nameFile);
				break;
			case 2: 
				create(nameFile);
				break;
			case 3: 
				System.out.println("Nhập: ");
				String content = sc.nextLine();
				write(nameFile,content);
				break;
			case 4: 
				read(nameFile);
				break;
				
			}
		} while (option != 0);

	}

	public static void read(String fileName) {
		try (FileInputStream fileInput = new FileInputStream(fileName)) {
			int byteData;
			StringBuilder builder = new StringBuilder();
			while ((byteData = fileInput.read()) != -1) {
				builder.append((char) byteData);
			}
			System.out.println(builder.toString());
		} catch (IOException e) {
			System.out.println("Lỗi đọc file");
		}
	}

	public static void check(String fileName) {
		File f = new File(fileName);
		if (f.exists()) {
			System.out.println("Đã tồn tại");
		} else {
			System.out.println("Chưa tồn tại");
		}
	}

	public static void create(String fileName) {
		try {
			File f = new File(fileName);
			if (f.createNewFile()) {
				System.out.println("Đã tạo file");
			} else {
				System.out.println("Đã tồn tại");
			}
		} catch (IOException e) {
			System.out.println("Lỗi tạo file");
		}
	}

	public static void write(String fileName, String Content) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
			bw.write(Content);
			bw.newLine();
			System.out.println("Ghi xong");
		} catch (IOException e) {
			System.out.println("Lỗi ghi file");
			e.printStackTrace();
		}

	}
}
