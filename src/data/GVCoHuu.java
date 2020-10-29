package data;

public class GVCoHuu extends GiangVien implements TinhLuong{
	private int soGDM;

	public GVCoHuu(String ma, String hoTen, String hocVi, int soGDM) {
		super(ma, hoTen, hocVi);
		// TODO Auto-generated constructor stub
		this.soGDM=soGDM;
	}

	public int getSoGDM() {
		return soGDM;
	}

	public void setSoGDM(int soGDM) {
		this.soGDM = soGDM;
	}

	@Override
	public double getTienLinh() {
		// TODO Auto-generated method stub
		if(getHocVi()=="dai hoc") return soGDM*140;
		else if(getHocVi()=="thac si") return soGDM*1.2*140;
		else return soGDM*1.5*140;
	}

	@Override
	public String toString() {
		return getMa()+"\t"+getHoTen()+"\t"+getHocVi()+"\t"+soGDM;
	}
}
