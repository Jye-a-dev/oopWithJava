package ClassJava;

public class BaiTap8 {
	public static void main(String[] args) {
		checkEvenOdd(4);
		checkEvenOdd(9);
	}
	static void checkEvenOdd(int a) {
		if (a%2 == 0) {
			System.out.println(a + ": Chẵn");
		}else {
			System.out.println(a + ": Lẽ");
		}
	}
}
