package oop_json;

import java.util.Scanner;

public class home {
    public static void main(String[] args) {

        method Method = new method();
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tên file: ");
        String fileName = sc.nextLine() + ".json";
        
        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Create file");
            System.out.println("2. Read file");
            System.out.println("3. Write (input)");
            System.out.println("4. Delete field");
            System.out.println("5. Delete file");
            System.out.println("6. Đổi file");
            System.out.println("0. Exit");
            System.out.print("Chọn: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    Method.Create(fileName);
                    break;

                case 2:
                    Method.Read(fileName, "user");
                    break;

                case 3:
                    Method.WriteInput(fileName);
                    break;

                case 4:
                    System.out.print("Nhập key cần xóa: ");
                    String key = sc.nextLine();
                    Method.DeleteField(fileName, key);
                    break;

                case 5:
                    Method.DeleteFile(fileName);
                    break;

                case 6:
                    System.out.print("Nhập tên file mới: ");
                    fileName = sc.nextLine() + ".json";
                    break;

                case 0:
                    System.out.println("Thoát chương trình");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }

        } while (choice != 0);

        sc.close();
    }
}