import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

import org.json.JSONObject;

public class Cau1 {
	public static void main(String[] args) {
		String fileName = "sinhvien.json";
		Create(fileName);
		WriteInput(fileName);

	}

	public static void Create(String fileName) {
		try {
			File file = new File(fileName);

			if (!file.exists()) {
				file.createNewFile();

				JSONObject json = new JSONObject();

				FileWriter writer = new FileWriter(file);
				writer.write(json.toString(4));
				writer.close();

				System.out.println("Đã tạo file");
			} else {
				System.out.println("Đã có file");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static JSONObject inputUser() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Nhập họ tên: ");
		String hoTen = sc.nextLine();

		System.out.println("Nhập tuổi: ");
		int Tuoi = Integer.parseInt(sc.nextLine());

		System.out.println("Nhập điểm trung bình: ");
		double diemTb = Double.parseDouble(sc.nextLine());
		
		JSONObject json = new JSONObject();

		json.put("hoTen", hoTen);
		json.put("tuoi", Tuoi);
		json.put("diemTrungBinh", diemTb);

		return json;
	}

	public static void WriteInput(String fileName) {
		try {
			JSONObject json = inputUser();

			FileWriter writer = new FileWriter(fileName);
			writer.write(json.toString(4));
			writer.close();

			System.out.println("Đã ghi dữ liệu");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
