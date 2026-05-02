package Part_2;

public class SanPhamThoiTrang extends SanPham {
	public int kichThuoc;

	public SanPhamThoiTrang() {
	}

	public SanPhamThoiTrang(String maSP, String tenSP, int Gia, int kichThuoc) {
		super(maSP, tenSP, Gia);
		this.kichThuoc = kichThuoc;
	}

	@Override
	public void Nhap() {
		super.Nhap();
		System.out.println("Nhập kích thước (cm): ");
		this.kichThuoc = Integer.parseInt(sc.nextLine());

	}

	@Override
	public void TangGia(double phanTram) {
		if (this.kichThuoc > 200) {
			phanTram += 5;
		} else if (this.kichThuoc > 100) {
			phanTram += 3;
		}

		super.GiamGia(phanTram);
		System.out.println("Giá thời trnag sau tăng: " + this.gia);
	}

	@Override
	public void hienThi() {
		super.hienThi();
		System.out.println("Kích thước: " + this.kichThuoc + " cm");
	}
}
