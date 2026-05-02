package Part_2;

public class SanPhamThucPham extends SanPham {

	public int hanSuDung;

	public SanPhamThucPham() {
	}

	public SanPhamThucPham(String maSP, String tenSP, int Gia, int hanSuDung) {
		super(maSP, tenSP, Gia);
		this.hanSuDung = hanSuDung;
	}

	@Override
	public void Nhap() {
		super.Nhap();
		System.out.println("Nhập hạn sử dụng (ngày): ");
		this.hanSuDung = Integer.parseInt(sc.nextLine());

	}

	@Override
	public void GiamGia(double phanTram) {
		if (this.hanSuDung > 3) {
			phanTram += 15;
		} else if (this.hanSuDung > 5) {
			phanTram += 10;
		}

		super.GiamGia(phanTram);
		System.out.println("Giá thực phẩm sau giảm: " + this.gia);
	}

	@Override
	public void hienThi() {
		super.hienThi();
		System.out.println("Hạn sử dụng còn: " + this.hanSuDung + " ngày");
	}
}
