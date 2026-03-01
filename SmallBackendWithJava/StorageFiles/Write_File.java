package SmallBackendWithJava.StorageFiles;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Write_File {
    public void Write(String fileName, String Content) {
    	try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))){
    		bw.write(Content);
    		bw.newLine();
    		System.out.println("Đã ghi xong");
    	} catch (IOException e) {
    		e.printStackTrace();
    	}
    }
}
