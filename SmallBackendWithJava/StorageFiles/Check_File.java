package SmallBackendWithJava.StorageFiles;

import java.io.File;
public class Check_File {
    public boolean check(String fileName) {
        File f = new File(fileName);
        if (f.exists()) {
            return true;
        } else {
            System.out.println(fileName + " không tồn tại");
            return false;
        }
    }
}
