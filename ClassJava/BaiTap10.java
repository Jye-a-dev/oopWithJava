package classjava;

public class BaiTap10 {
	public static void main(String[] args) {
		convertNumberToMonth(12);
		convertNumberToMonth(13);
	}
	static void convertNumberToMonth(int a) {
		switch(a) {
		case 1 -> System.out.println("Tháng 1");
		case 2 -> System.out.println("Tháng 2");
		case 3 -> System.out.println("Tháng 3");
		case 4 -> System.out.println("Tháng 4");
		case 5 -> System.out.println("Tháng 5");
		case 6 -> System.out.println("Tháng 6");
		case 7 -> System.out.println("Tháng 7");
		case 8 -> System.out.println("Tháng 8");
		case 9 -> System.out.println("Tháng 9");
		case 10 -> System.out.println("Tháng 10");
		case 11 -> System.out.println("Tháng 11");
		case 12 -> System.out.println("Tháng 12");
		default -> System.out.println("Tháng không hợp lệ");
		}
	}
}
