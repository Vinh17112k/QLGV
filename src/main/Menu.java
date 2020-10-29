package main;
import java.util.Scanner;
import quanly.QLGV;
public class Menu {
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		QLGV q= new QLGV();
		while(true)
		{
			System.out.println("0: thoat.");
			System.out.println("1: nhap giang vien co huu.");
			System.out.println("2: nhap giang vien thinh giang.");
			System.out.println("3: viet danh sach giang vien.");
			System.out.println("4: sap xep giang vien theo tien linh.");
			System.out.println("5: xoa giang vien.");
			System.out.println("6: tong tien theo nhom hoc vi.");
			int choise=Integer.parseInt(in.nextLine());
			switch(choise)
			{
			case 0: 
				System.out.println("0: thoat.");
				System.exit(0);
				break;
			case 1: 
				System.out.println("1: nhap giang vien co huu.");
				q.nhapGVCH();
				break;
			case 2: 
				System.out.println("2: nhap giang vien thinh giang.");
				q.nhapGVTG();
				break;
			case 3: 
				System.out.println("3: viet danh sach giang vien.");
				q.vietDS();
				break;
			case 4: 
				System.out.println("4: sap xep giang vien theo tien linh.");
				q.sxTheoLuong();
				break;
			case 5: 
				System.out.println("5: xoa giang vien.");
				String Ma=in.nextLine();
				q.xoaGV(Ma);
				break;
			case 6: 
				System.out.println("6: tong tien theo nhom hoc vi.");
				q.luongHocVi();
				break;
			}
		}
	}
}
