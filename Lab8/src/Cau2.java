import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.JSONObject;

public class Cau2 {
	public static void main(String[] args) {
		String fileName = "sinhvien.json";
		Read(fileName);
	}

	public static void Read(String fileName) {
        try {
            String content = new String(Files.readAllBytes(Paths.get(fileName)));
            JSONObject json = new JSONObject(content);
            
            System.out.println("Họ tên: " + json.get("hoTen"));
            System.out.println("Tuổi: " + json.get("tuoi"));
            System.out.println("Điểm trung bình: " + json.get("diemTrungBinh"));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
