package Part_2;

public class SanPhamDienTu extends SanPham {

	public int baoHanh;

	public SanPhamDienTu() {
	}

	public SanPhamDienTu(String maSP, String tenSP, int Gia, int BaoHanh) {
		super(maSP, tenSP, Gia);
		this.baoHanh = BaoHanh;
	}

	@Override
	public void Nhap() {
		super.Nhap();
		System.out.println("Nhập tháng bảo hành: ");
		this.baoHanh = Integer.parseInt(sc.nextLine());

	}

	@Override
	public void GiamGia(double phanTram) {
		if (this.baoHanh > 12) {
			phanTram += 5;
		} else if (this.baoHanh > 6) {
			phanTram += 2;
		}

		super.GiamGia(phanTram);
		System.out.println("Giá điện tử sau giảm: " + this.gia);
	}

	@Override
	public void hienThi() {
		super.hienThi();
		System.out.println("Bảo hành: " + this.baoHanh + " tháng");
	}
}
