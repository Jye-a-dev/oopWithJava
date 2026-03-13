package classjava;

public class BaiTap11 {
	public static void main(String[] args) {
		simpleCalculator('+', 2, 5);
		simpleCalculator('/', 2, 0);
	}
	static void simpleCalculator(char o,int a, int b) {
		switch(o) {
			case '+' -> System.out.println(a+b);
			case '-' -> System.out.println(a-b);
			case '*' -> System.out.println(a*b);
			case '/' -> {
                            try {
                                System.out.println(a/b);
                            } catch(Exception e) {
                                System.out.println("Phép tính không thể chia cho 0");
                            }
                }
			default -> System.out.println("Phép tính không hợp lệ");
		}
	}
}
