package Part_2;

import java.util.Scanner;

public class SanPham {
	Scanner sc = new Scanner(System.in);
	
	public String getMaSanPham() {
		return maSanPham;
	}
	public void setMaSanPham(String maSanPham) {
		this.maSanPham = maSanPham;
	}
	public String getTenSanPham() {
		return tenSanPham;
	}
	public void setTenSanPham(String tenSanPham) {
		this.tenSanPham = tenSanPham;
	}
	public int getGia() {
		return gia;
	}
	public void setGia(int gia) {
		this.gia = gia;
	}
	public String maSanPham;
	public String tenSanPham;
	public int gia;
	
	public SanPham(String maSP, String tenSP, int Gia) {
		this.maSanPham = maSP;
		this.tenSanPham = tenSP;
		this.gia = Gia;
	}
	
	public SanPham() {
		this.maSanPham = "";
		this.tenSanPham = "";
		this.gia = 0;
	}
	
	public void Nhap() {
		System.out.println("Nhập mã sản phẩm: ");
		this.maSanPham = sc.nextLine();
		
		System.out.println("Nhập tên sản phẩm: ");
		this.tenSanPham = sc.nextLine();
		
		System.out.println("Nhập giá sản phẩm: ");
		this.gia = Integer.parseInt(sc.nextLine());
	}
	
	public void TangGia(double phanTram) {
		this.gia =(int) (this.gia*(1 + phanTram/100)) ;
	}
	public void GiamGia(double phanTram) {
		this.gia =(int) (this.gia*(1 - phanTram/100)) ;
		
	}
	
	public void hienThi() {
		System.out.println("Tên: " + this.tenSanPham + " Giá: " + this.gia + " Mã: " + this.maSanPham);
	}
}

