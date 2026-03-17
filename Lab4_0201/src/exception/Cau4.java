package exception;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Cau4 {
	public static void main(String[] args) throws IOException {
		nhapPhanTuMang();
	}
	public static void nhapPhanTuMang() throws IOException {
			try {
				ArrayList<Integer> Mang = new ArrayList<>(Arrays.asList());
				Scanner sc = new Scanner(System.in); 
				System.out.println("Nhập n phần tử cho mảng: ");
				int n = Integer.parseInt(sc.nextLine());
				
				for (int i = 1; i < n+1; i++) {
					System.out.println("Nhập số thứ: " +i);
					int a = Integer.parseInt(sc.nextLine());
					
					if (a < 0) {
						throw new IOException("Có số âm");
					}
					Mang.add(a);
				}		
				System.out.println(Mang + " : là mảng đã nhập");
			}catch(NumberFormatException e) {
				System.out.println("Không phải số");
			}
		}
	}

