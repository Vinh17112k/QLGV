package data;

public class GVTG extends GiangVien implements TinhLuong{
	private int gioGD;

	public GVTG(String ma, String hoTen, String hocVi, int gioGD) {
		super(ma, hoTen, hocVi);
		// TODO Auto-generated constructor stub
		this.gioGD=gioGD;
	}

	public int getGioGD() {
		return gioGD;
	}

	public void setGioGD(int gioGD) {
		this.gioGD = gioGD;
	}

	@Override
	public double getTienLinh() {
		// TODO Auto-generated method stub
		if(getHocVi()=="dai hoc") return gioGD*60;
		else if(getHocVi()=="thac si") return gioGD*1.2*60;
		else return gioGD*1.5*60;
	}

	@Override
	public String toString() {
		return getMa()+"\t"+getHoTen()+"\t"+getHocVi()+"\t"+gioGD;
	}
	
}
