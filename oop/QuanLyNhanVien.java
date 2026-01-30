package oop;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyNhanVien {
	ArrayList<NhanVienFullTime> Full = new ArrayList<>();
	ArrayList<NhanVienPartTime> Part = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	public void themNhanVien(int luaChon) {
		switch(luaChon) {
		
		case 1 -> {
                    System.out.println("Nhập mã nhân viên:");
                    String MaNV = sc.nextLine();
                    
                    System.out.println("Nhập tên:");
                    String TenNV = sc.nextLine();
                    
                    System.out.println("Nhập Lương Cơ Bản:");
                    double LuongCB = Double.parseDouble(sc.nextLine());
                    System.out.println("Nhập Hệ số lương:");
                    double HeSo = Double.parseDouble(sc.nextLine());
                    
                    NhanVienFullTime nv = new NhanVienFullTime(MaNV,TenNV,LuongCB,HeSo);
                    Full.add(nv);
                }
		case 2 -> {
                    System.out.println("Nhập mã nhân viên:");
                    String MaNv = sc.nextLine();
                    
                    System.out.println("Nhập tên:");
                    String TenNv = sc.nextLine();
                    
                    System.out.println("Nhập Lương Cơ Bản:");
                    double LuongCb = Double.parseDouble(sc.nextLine());
                    
                    System.out.println("Nhập giờ làm:");
                    int gioLam = Integer.parseInt(sc.nextLine());
                    
                    System.out.println("Nhập lương theo giờ: ");
                    double LuongGio = Double.parseDouble(sc.nextLine());
                    
                    NhanVienPartTime nv1 = new NhanVienPartTime(MaNv,TenNv, LuongCb, gioLam, LuongGio);
                    Part.add(nv1);
                }
		}
	}
	
	public void hienThiTatCa() {
		for (NhanVienFullTime i : Full) {
			i.hienThiThongTin();
		}
		for (NhanVienPartTime i : Part) {
			i.hienThiThongTin();
		}
	}
	
	public void timTheoMa(String a) {
		for (NhanVienFullTime i : Full) {
			if (i.maNV.equals(a)) {
				i.hienThiThongTin();
			}
		}
		for (NhanVienPartTime i : Part) {
			if (i.maNV.equals(a)) {
				i.hienThiThongTin();
			}
		}
	}
	
	public double tinhTongLuong() {
		double Sum1 = 0, Sum2 = 0;
		for (NhanVienFullTime i : Full) {
			Sum1 += i.tinhLuong();
		}
		 for (NhanVienPartTime i : Part) {
			Sum2 +=i.tinhLuong();
		}
		return Sum1 + Sum2;
	}
	

	
	public void Menu() {
		int options;
		do {
			System.out.println("1: Nhập, 2: Xuát, 3: Tìm theo ID, 4 Tổng lương, 0 Thoát");
			options = Integer.parseInt(sc.nextLine());
			switch(options) {
			case 1 -> {
                            System.out.println("1: Full, 2: Part");
                            int a = Integer.parseInt(sc.nextLine());
                            themNhanVien(a);
                        }
			case 2 -> hienThiTatCa();
			case 3 -> {
                            System.out.println("Nhập mã nhân viên:");
                            String ma = sc.nextLine();
                            timTheoMa(ma);
                        }
			case 4 -> System.out.println("Tổng lương: " + tinhTongLuong());
			}
		} while (options != 0);
	}
}