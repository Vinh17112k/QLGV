package quanly;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;
import data.GiangVien;
import data.GVCoHuu;
import data.GVTG;
public class QLGV implements ChucNang{
	private List<GiangVien> list;
	private Scanner in;
	public QLGV()
	{
		list=new ArrayList<>();
		in=new Scanner(System.in);
		list.add(new GVCoHuu("RY3845","Phan Thi Ha","thac si", 50));
		list.add(new GVCoHuu("RY5332","Ha Quoc Cuong","thac si", 45));
		list.add(new GVCoHuu("TR5434","Bui Thi Dung","dai hoc", 30));
		list.add(new GVTG("DE3845","Phan Thi Ha","thac si", 30));
		list.add(new GVTG("SR8845","Phan Thi Ha","thac si", 40));
	}
	public GiangVien info()
	{
		String Ma, hoTen, hocVi;
		while(true)
		{
			System.out.print("Ma: ");
			Ma=in.nextLine().toUpperCase();
			if(Ma.matches("^[A-Z]{2}\\d{4}"))
				break;
			else
				System.out.println("nhap lai");
		}
		System.out.print("Ho Ten: ");
		hoTen=in.nextLine();
		System.out.print("Hoc Vi: ");
		hocVi=in.nextLine();
		return new GiangVien(Ma, hoTen, hocVi);
	}
	@Override
	public void nhapGVCH()
	{
		GiangVien t=info();
		System.out.print("gio day: ");
		int gioDay=Integer.parseInt(in.nextLine());
		GVCoHuu n=new GVCoHuu(t.getMa(),t.getHoTen(),t.getHocVi(),gioDay);
		list.add(n);
	}
	@Override
	public void nhapGVTG()
	{
		GiangVien t=info();
		System.out.print("gio day: ");
		int gioDay=Integer.parseInt(in.nextLine());
		GVTG n=new GVTG(t.getMa(),t.getHoTen(),t.getHocVi(),gioDay);
		list.add(n);
	}
	@Override
	public void vietDS()
	{
		System.out.println("Ma\tho ten\thoc vi\t gio day");
		for(int i=0;i<list.size();i++)
			if(list.get(i) instanceof GVCoHuu)
				System.out.println(list.get(i).toString());
		System.out.println("Ma\tho ten\thoc vi\t gio day");
		for(int i=0;i<list.size();i++)
			if(list.get(i) instanceof GVTG)
				System.out.println(list.get(i).toString());
	}
	@Override
	public void sxTheoLuong()
	{
	}
	private int getVTMa(String Ma)
	{
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).getMa().equalsIgnoreCase(Ma))
				return i;
		}
		return -1;
	}
	@Override
	public void xoaGV(String Ma)
	{
		int VT=getVTMa(Ma);
		if(VT==-1)
			System.out.println("khong tim thay");
		else
			list.remove(VT);
	}
	@Override
	public double luongHocVi()
	{
		return 0;
	}
}
