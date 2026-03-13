package getting_with_java;

import java.util.Scanner;

public class cauH {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhập tên bạn: ");
		String name = sc.nextLine();
		
		System.out.println("Nhập việc làm: ");
		String job = sc.nextLine();
		
		System.out.println("Nhập tuổi bạn: ");
		int age = sc.nextInt();
		
		System.out.println("Nhập địa chỉ nhà bạn: ");
		String address = sc.next();
		
		
		System.out.println("Nhập giới tính bạn (1: nam, 2 : nữ): ");
		int gender = sc.nextInt();
		
		String gender1 ;
		if (gender == 1) {
			gender1 = "Nam";
		}else {
			gender1 = "Nữ";
		}
		
		System.out.println("Cảm ơn " + name + " " + gender1+" "+ age+ " tuổi ở " + address +" đang làm việc ở "+ job + " đã sử dụng dịch vụ chatbot của chúng tôi");
	}
}
