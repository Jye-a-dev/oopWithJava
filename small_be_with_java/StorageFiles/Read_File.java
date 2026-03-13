package SmallBackendWithJava.StorageFiles;
import java.io.FileInputStream;
import java.io.IOException;

public class Read_File {
    public void read(String fileName) {
        try (FileInputStream fileInputStream = new FileInputStream(fileName)) {
            int byteData;
            StringBuilder builder = new StringBuilder();
            while ((byteData = fileInputStream.read()) != -1) {
                builder.append((char) byteData);
            }
            System.out.println(builder.toString());
        } catch (IOException e) {
            System.out.println("Có lỗi khi đọc file");
        }
    }
}
