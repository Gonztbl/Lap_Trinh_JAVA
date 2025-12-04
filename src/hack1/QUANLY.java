package hack1;

import java.util.ArrayList;
import java.util.Scanner;



public class QUANLY implements GIAODIENHACK1 {
	ArrayList<SINHVIEN> list;
	public QUANLY() {
		list=new ArrayList<>();
	}
@Override
public SINHVIEN nhap() {
	Scanner scanner=new Scanner(System.in);
	System.out.println("------Nhap thong tin sinh vien-----");
	System.out.println("Name: ");
	String name =scanner.next();
	System.out.println("Date: ");
	String date=scanner.next();
	System.out.println("Gioi tinh: ");
	String gioiTinh=scanner.next();
	System.out.println("Address: ");
	String address=scanner.next();
	System.out.println("CCCD: ");
	String cccd=scanner.next();
	System.out.println("Ma SV: ");
	String maSV=scanner.next();
	System.out.println("Nghe: ");
	String nghe=scanner.next();
	System.out.println("Tai khoan: ");
	String tk=scanner.next();
	System.out.println("Mat khau: ");
	String mk=scanner.next();
	System.out.println("Diem: ");
	int diem=scanner.nextInt();
	scanner.nextLine();
	SINHVIEN svSinhvien=new SINHVIEN(name,date,gioiTinh,address,cccd,maSV,nghe,tk,mk,diem);
	return svSinhvien;
}
@Override
public void xuat(SINHVIEN sv) {
	System.out.println("Ho ten: "+sv.getName());
	System.out.println("Date: "+sv.getDate());
	System.out.println("Gioi tinh: "+sv.getGioiTinh());
	System.out.println("Address: "+sv.getAddress());
	System.out.println("CCCD: "+sv.getCCCD());
	System.out.println("Ma sv: "+sv.getMaSV());
	System.out.println("Nghe: "+sv.getNghe());
	System.out.println("TK: "+sv.getTK());
	System.out.println("MK "+sv.getMK());
	System.out.println("Diem: "+sv.getDiem());
}
public void them() {
	SINHVIEN sv= nhap();
	list.add(sv);
	System.out.println("Them sinh vien thanh cong!");
	return;
	
}
public void sua(String masua, SINHVIEN svs) {
	for(int i=0; i<list.size();i++) {
		if(list.get(i).getMaSV().equals(masua)) {
			list.set(i,svs);
			System.out.println("Sua thanh cong!");
		}
		else {
			System.out.println("Khong tim thay sinh vien can sua");
		}
	}
}
public void xoa(String maxoa) {
	boolean check=false;
	for(int i=0; i<list.size();i++) {
		if(list.get(i).getMaSV().equals(maxoa)) {
			list.remove(i);
			System.out.println("Xoa thanh xong!");
			check=true;
			break;
		}
		
	}
	if(!check){
		System.out.println("Khong tim thay sinh vien can xoa");
	}
}
public void timten(String ten) {
	boolean check=false;
	for(SINHVIEN sv:list) {
		if(sv.getName().equals(ten)) {
			xuat(sv);
			check=true;
		}
		
	}
	if(!check){
		System.out.println("Khong tim thay sinh vien");
	}
}
public void sapxepTen() {
	list.sort((sv1,sv2)->sv1.getName().compareToIgnoreCase(sv2.getName()));
}
public void sapxepDiem(){
	//list.sort((sv1,sv2)-> Integer.compare(sv1.getDiem(),sv2.getDiem()));
	list.sort((sv1,sv2)-> Double.compare(sv1.getDiem(),sv2.getDiem()));
}
public void hienthids() {
	System.out.println("---------Danh sach sinh vien---------");
	int i=1;
	for(SINHVIEN sv: list) {
		System.out.println("-------------Thong tin sinh vien thu "+i+"----------------");
		xuat(sv);
		i++;
	}
}
}
