package SmallBackendWithJava.StorageFiles;

import java.io.File;

public class Delete_File {
	public void delete(String fileName) {
		File f = new File(fileName);
		if (f.delete()) {
			System.out.println("File đã xoá");
		}
		else {
			System.out.println("File xoá không thành công");
		}
	}
}
