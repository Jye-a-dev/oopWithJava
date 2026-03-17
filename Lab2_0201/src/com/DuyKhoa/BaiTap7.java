package com.DuyKhoa;

public class BaiTap7 {
	public static void main(String[] args) {
		System.out.println(calculateRectangleArea(5, 9));
		System.out.println(calculateTriangleArea(8, 9));
		System.out.println(calculateSquareArea(9));
	}
	static double calculateRectangleArea(double d, double r) {
		return (d*r);
	}
	
	static double calculateTriangleArea(double d, double c) {
		return (d*c)/2;
	}
	static double calculateSquareArea(double a) {
		return a*a;
	}
}
