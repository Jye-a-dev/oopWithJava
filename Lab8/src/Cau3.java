import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;

public class Cau3 {
	public static void main(String[] args) {
		String fileName = "monhoc.json";
		Create(fileName);
		WriteInput(fileName);
	}

	public static void Create(String fileName) {
		try {
			File file = new File(fileName);

			if (!file.exists()) {
				file.createNewFile();

				JSONArray arr = new JSONArray();

				FileWriter writer = new FileWriter(file);
				writer.write(arr.toString(4));
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

        System.out.println("Nhập tên môn: ");
        String tenMon = sc.nextLine();

        System.out.println("Nhập học kì: ");
        int hocKy = Integer.parseInt(sc.nextLine());

        System.out.println("Nhập điểm: ");
        double diem = Double.parseDouble(sc.nextLine());

        String ketQua = "";
        if (diem > 5) {
        	ketQua = "Đạt";
        } else {
        	ketQua = "Không đạt";
        }

        JSONObject json = new JSONObject();
        json.put("tenMon", tenMon);
        json.put("hocKy", hocKy);
        json.put("diem", diem);
        json.put("ketQua", ketQua);

        return json;
    }

	public static void WriteInput(String fileName) {
	    try {
	        String content = new String(Files.readAllBytes(new File(fileName).toPath()));
	        JSONArray arrJson;

	        if (content.trim().isEmpty()) {
	            arrJson = new JSONArray();
	        } else {
	            arrJson = new JSONArray(content);
	        }

	        JSONObject json = inputUser();
	        arrJson.put(json);

	        FileWriter writer = new FileWriter(fileName);
	        writer.write(arrJson.toString(4));
	        writer.close();

	        System.out.println("Đã ghi dữ liệu");
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

}