package SmallBackendWithJava.StorageFiles;

import java.io.File;

public class List_File {

    public void showTables() {

        File folder = new File("Tables");

        if (!folder.exists()) {
            System.out.println("Thư mục Tables chưa tồn tại!");
            return;
        }

        File[] files = folder.listFiles();

        if (files == null || files.length == 0) {
            System.out.println("Không có bảng nào.");
            return;
        }

        System.out.println("===== DANH SÁCH TABLE =====");

        for (File f : files) {
            if (f.isFile()) {
                System.out.println(
                    f.getName().replace(".txt", "")
                );
            }
        }
    }
}