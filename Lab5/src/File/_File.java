package File;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;


public class _File {
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

    public void check(String fileName) {
        File f = new File(fileName);
        if (f.exists()) {
            System.out.println(fileName + " có tồn tại");
        } else {
            System.out.println(fileName + " không tồn tại");
        }
    }
    public void Write(String fileName, String Content) {
    	try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))){
    		bw.write(Content);
    		bw.newLine();
    		System.out.println("Đã ghi xong");
    	} catch (IOException e) {
    		e.printStackTrace();
    	}
    }
    public void clone(String FileName1, String FileName2) {
        try (BufferedInputStream fileA = new BufferedInputStream(new FileInputStream(FileName1));
             BufferedOutputStream fileB = new BufferedOutputStream(new FileOutputStream(FileName2))) {

            byte[] buffer = new byte[1024];
            int length;
            while ((length = fileA.read(buffer)) > 0) {
                fileB.write(buffer, 0, length);
            }
            System.out.println("Đã copy file");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void ReadLine(String fileName) throws IOException {
    	try (BufferedReader bw = new BufferedReader(new FileReader(fileName))){
    		String line = "";
    		while( (line = bw.readLine()) != null ){
    			System.out.println(line);
    		}
    	}catch (IOException e) {
    		e.printStackTrace();
    	}
    }
    public void count(String fileName) throws IOException {
    	FileInputStream fileInputStream = new FileInputStream(fileName);
    	InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
    	BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

    	String line;
    	int wordCount = 0;
    	int characterCount = 0;
    	int lineCount = 0;  

    	while ((line = bufferedReader.readLine()) != null) {
    	    lineCount++;  
    	    characterCount += line.length();
    	    String words[] = line.split("\\s+");
    	    wordCount += words.length;
    	}

    	System.out.println("Tổng từ = " + wordCount);
    	System.out.println("Kí tự = " + characterCount);
    	System.out.println("Tổng dòng = " + lineCount);
        }
    }
    
    
