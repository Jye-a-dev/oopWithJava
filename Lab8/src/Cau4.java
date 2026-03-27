import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;

public class Cau4 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws IOException {
		String fileName = "monhoc.json";
		int option;
		
		do {
		System.out.println("Lựa chọn: ");
		option = Integer.parseInt(sc.nextLine());
		
			switch (option) {
			case 1:
				findByName(fileName);
				break;
			case 2: 
				countMon(fileName);
				break;
			case 3:
				diemAll(fileName);
				break;
			}
		
				
		} while (option != 0);

	}

	public static void Read(String fileName) {
		try {
			String content = new String(Files.readAllBytes(Paths.get(fileName)));
			if (content.trim().isEmpty()) {
				System.out.println("File rỗng");
				return;
			}

			JSONArray arrJson = new JSONArray(content);

			for (Object object : arrJson) {
				JSONObject sinhVien = (JSONObject) object;

				System.out.println("Tên môn: " + sinhVien.get("tenMon"));
				System.out.println("Học kì: " + sinhVien.get("hocKy"));
				System.out.println("Điểm: " + sinhVien.get("diem"));
				System.out.println("Kết quả: " + sinhVien.get("ketQua"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void findByName(String fileName) throws IOException {
		
		String content = new String(Files.readAllBytes(Paths.get(fileName)));
		if (content.trim().isEmpty()) {
			System.out.println("File rỗng");
			return;
		}

		JSONArray arrJson = new JSONArray(content);

		System.out.println("Nhập tên môn cần tìm: ");
		String searchMon = sc.nextLine();

		for (Object object : arrJson) {
			JSONObject sinhVien = (JSONObject) object;
			if (sinhVien.get("tenMon").equals(searchMon)) {
				System.out.println("Tên môn: " + sinhVien.get("tenMon"));
				System.out.println("Học kì: " + sinhVien.get("hocKy"));
				System.out.println("Điểm: " + sinhVien.get("diem"));
				System.out.println("Kết quả: " + sinhVien.get("ketQua"));
			}
		}
	}
	public static void countMon(String fileName) throws IOException {
		String content = new String(Files.readAllBytes(Paths.get(fileName)));
		if (content.trim().isEmpty()) {
			System.out.println("File rỗng");
			return;
		}

		JSONArray arrJson = new JSONArray(content);
		int svDat = 0;
		int svRot = 0;
		
		for (Object object : arrJson) {
			JSONObject sinhVien = (JSONObject) object;
			if (sinhVien.get("ketQua").equals("Đạt")) {
				svDat ++ ;
			} else {
				svRot ++;
			}
		}
		System.out.println("Sinh viên đạt: " + svDat);
		System.out.println("Sinh viên rớt: " + svRot);
	}
	public static void diemAll(String fileName) throws IOException {
		String content = new String(Files.readAllBytes(Paths.get(fileName)));
		if (content.trim().isEmpty()) {
			System.out.println("File rỗng");
			return;
		}

		JSONArray arrJson = new JSONArray(content);
		int sum = 0;
		
		for (Object object : arrJson) {
			JSONObject sinhVien = (JSONObject) object;
			int diem = sinhVien.getInt("diem");
			sum += diem;
		}
		System.out.println("Tổng điểm: " + sum);
	}
}
