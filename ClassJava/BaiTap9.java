package ClassJava;

public class BaiTap9 {
	public static void main(String[] args) {
		gradeExam(100);
		gradeExam(86);
		gradeExam(78);
		gradeExam(60);
		gradeExam(20);
		
	}
	static void gradeExam(int d) {
		if (d>= 90) {
			System.out.println("Xuất sắc");	
		} else if(d >= 80) {
			System.out.println("Giỏi");	
		}else if(d >= 70) {
			System.out.println("Khá");	
		}else if(d >= 60) {
			System.out.println("Trung Bình");	
		}else {
			System.out.println("Yếu");	
		}
	}
}
