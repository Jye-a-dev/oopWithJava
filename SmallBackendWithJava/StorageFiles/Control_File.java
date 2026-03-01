package SmallBackendWithJava.StorageFiles;

import java.util.Scanner;

public class Control_File {

    private final Scanner sc = new Scanner(System.in);

    private final Create_File C_file = new Create_File();
    private final Read_File R_File = new Read_File();
    private final Write_File W_File = new Write_File();
    private final Check_File Ch_File = new Check_File();
    private final Delete_File D_File = new Delete_File();
    private final List_File L_File = new List_File();
    
    public void control() {
        System.out.println("Thao tác File có thể giống database");
        int option;
        do {
            showMenu();
            option = Integer.parseInt(sc.nextLine());
            String fileName = inputFileName();
            switch (option) {
                case 1 -> create(fileName);
                case 2 -> read(fileName);
                case 3 -> write(fileName);
                case 4 -> delete(fileName);
                case 5 -> showTables();
            }

        } while (option != 0);
    }
    // ================= MENU =================
    private void showMenu() {
        System.out.println("=========MENU==============");
        System.out.println("0: Dừng");
        System.out.println("1: Tạo");
        System.out.println("2: Đọc");
        System.out.println("3: Nhập");
        System.out.println("4: Xoá");
        System.out.println("5: Hiện tất cả Table");
    }
    // ================= COMMON =================
    private String inputFileName() {
        System.out.println("Nhập tên file:");
        return "Tables/"+ sc.nextLine() + ".txt";
    }
    
    private boolean checkExist(String fileName) {
        if (!Ch_File.check(fileName)) {
            System.out.println("File không tồn tại!");
            return false;
        }
        return true;
    }
    
    // ================= CRUD =================
    private void create(String fileName) {
        C_file.create(fileName);
    }
    
    private void read(String fileName) {
        if (checkExist(fileName))
            R_File.read(fileName);
    }
    
    private void write(String fileName) {
        if (!checkExist(fileName))
            return;
        System.out.println("Nhập nội dung:");
        String content = sc.nextLine();
        W_File.Write(fileName, content);
    }
    
    private void delete(String fileName) {
        if (checkExist(fileName))
            D_File.delete(fileName);
    }
    private void showTables() {
        L_File.showTables();
    }
}