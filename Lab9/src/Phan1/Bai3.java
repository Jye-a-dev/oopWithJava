package Phan1;

import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
		int[] a = { 42, 7, 89, 13, 65, 2, 97, 28, 54, 11, 76, 33, 90, 5, 68, 21, 84, 39, 1, 73, 56, 18, 92, 47, 30, 61,
				9, 100, 24, 71 };
		for (int i : a) {
			checkSNT(i);
		}
	}

	public static void checkSNT(int n) {
		try {
			if (n == 2 || n == 3 || n == 5 || n == 7) {
				System.out.println(n + " là số nguyên tố");
			} else if (n % 2 == 0 || n % 3 == 0 || n % 5 == 0 || n % 7 == 0) {
				System.out.println(n + " không là số nguyên tố");
			} else {
				System.out.println(n + " là snt");
			}
		} catch (Exception e) {
			return;
		}

	}
}
