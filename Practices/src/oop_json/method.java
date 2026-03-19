package oop_json;

import oop_json.modules.user;
import org.json.JSONObject;

import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class method {

    public void Create(String fileName) {
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

    public void Read(String fileName, String modules) {
        try {
            String content = new String(Files.readAllBytes(Paths.get(fileName)));
            JSONObject json = new JSONObject(content);

            switch (modules.toLowerCase()) {
                case "user":
                    handleUser(json);
                    break;

                default:
                    System.out.println("Module không tồn tại");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

 
    public void WriteInput(String fileName) {
        try {
            user u = user.input(); 

            JSONObject json = u.UserJson();

            FileWriter writer = new FileWriter(fileName);
            writer.write(json.toString(4));
            writer.close();

            System.out.println("Đã ghi dữ liệu");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void DeleteFile(String fileName) {
        File file = new File(fileName);

        if (file.exists()) {
            file.delete();
            System.out.println("Đã xóa file");
        } else {
            System.out.println("File không tồn tại");
        }
    }

    public void DeleteField(String fileName, String key) {
        try {
            String content = new String(Files.readAllBytes(Paths.get(fileName)));
            JSONObject json = new JSONObject(content);

            if (json.has(key)) {
                json.remove(key);

                FileWriter writer = new FileWriter(fileName);
                writer.write(json.toString(4));
                writer.close();

                System.out.println("Đã xóa field: " + key);
            } else {
                System.out.println("Không tìm thấy key");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void handleUser(JSONObject json) {
        int id = json.optInt("id");
        String name = json.optString("name");
        String email = json.optString("email");
        int age = json.optInt("age");
        boolean gender = json.optBoolean("gender");
        String address = json.optString("address");
        double salary = json.optDouble("salary");
        
        if (!Double.isFinite(salary)) {
            salary = 0.0;
        }

        user u = new user(id, name, email, age, gender, address, salary);

        System.out.println("Dữ liệu đọc:");
        System.out.println(u.UserJson().toString(4));
    }
}