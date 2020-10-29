package data;

public class GiangVien {
	private String Ma, hoTen, hocVi;

	public GiangVien(String ma, String hoTen, String hocVi) {
		super();
		Ma = ma;
		this.hoTen = hoTen;
		this.hocVi = hocVi;
	}

	public String getMa() {
		return Ma;
	}

	public void setMa(String ma) {
		Ma = ma;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getHocVi() {
		return hocVi;
	}

	public void setHocVi(String hocVi) {
		this.hocVi = hocVi;
	}
	
}
