package SmallBackendWithJava.StorageFiles;
import java.io.File;
import java.io.IOException;

public class Create_File {
    public void create(String fileName) {
        try {
        	  File f = new File(fileName);
            if (f.createNewFile()) {
                System.out.println("Tạo thành công");
            } else {
                System.out.println("File đã tồn tại");
            }
        } catch (IOException e) {
            System.out.println("Lỗi tạo file");
            e.printStackTrace();
        }
    }
}
