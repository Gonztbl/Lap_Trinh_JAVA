package TX1Chuan;

public class NGUOI {
    private String hoTen;
    private String ngaySinh;
    private String gioiTinh;
    private String CCCD;

    public NGUOI() {
		// TODO Auto-generated constructor stub
	}

    public NGUOI(String hoTen, String ngaySinh, String gioiTinh, String CCCD) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.CCCD = CCCD;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }
}
package TX1Chuan;

public class SinhVien extends NGUOI {
	private String maSV;
    private String nganhNghe;
    private String taiKhoan;
    private String matKhau;

    public SinhVien() {}

    public SinhVien(String maSV, String nganhNghe, String taiKhoan, String matKhau, String hoTen, String ngaySinh, String gioiTinh, String CCCD) {
        super(hoTen, ngaySinh, gioiTinh, CCCD);
        this.maSV = maSV;
        this.nganhNghe = nganhNghe;
        this.taiKhoan = taiKhoan;
        this.matKhau = matKhau;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getNganhNghe() {
        return nganhNghe;
    }

    public void setNganhNghe(String nganhNghe) {
        this.nganhNghe = nganhNghe;
    }

    public String getTaiKhoan() {
        return taiKhoan;
    }

    public void setTaiKhoan(String taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }
}
package TX1Chuan;

public interface StudentManagement {
  void input();
  void output(SinhVien sv);
}
package TX1Chuan;

import java.security.PublicKey;
import java.util.Arrays;
import java.util.Scanner;

import Ontaptx1.STUDENT;

public class QuanLySinhVien implements StudentManagement{
//khoi tao danh sach
	SinhVien[] danhSach;
	int soluong;
	public QuanLySinhVien(int max) {
		danhSach=new SinhVien[max];
		soluong=0;
		
	}
	@Override
public void input() {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Nhap Ho ten: ");
	String name =scanner.next();
	scanner.nextLine();
	System.out.println("Nhap date: ");
	String date =scanner.next();
	scanner.nextLine();
	System.out.println("nhap gioi tinh: ");
	String gioitinh =scanner.next();
	scanner.nextLine();
	System.out.println("nhap cccd: ");
	String cccd=scanner.next();
	scanner.nextLine();
	System.out.println("nhap ma sv: ");
	String masv=scanner.next();
	scanner.nextLine();
	System.out.println("nhap nghe nghiep: ");
	String nghenghiep =scanner.next();
	scanner.nextLine();
	System.out.println("nhap tai khoan: ");
	String tk=scanner.next();
	scanner.nextLine();
	System.out.println("nhap mat khau: ");
	String mk=scanner.next();
	scanner.nextLine();
	SinhVien sVien=new SinhVien(masv,nghenghiep,tk,mk,name,date,gioitinh,cccd);
	them(sVien);
}
public SinhVien inputthongtinsinhvien() {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Nhap Ho ten: ");
	String name =scanner.next();
	scanner.nextLine();
	System.out.println("Nhap date: ");
	String date =scanner.next();
	scanner.nextLine();
	System.out.println("nhap gioi tinh: ");
	String gioitinh =scanner.next();
	scanner.nextLine();
	System.out.println("nhap cccd: ");
	String cccd=scanner.next();
	scanner.nextLine();
	System.out.println("nhap ma sv: ");
	String masv=scanner.next();
	scanner.nextLine();
	System.out.println("nhap nghe nghiep: ");
	String nghenghiep =scanner.next();
	scanner.nextLine();
	System.out.println("nhap tai khoan: ");
	String tk=scanner.next();
	scanner.nextLine();
	System.out.println("nhap mat khau: ");
	String mk=scanner.next();
	scanner.nextLine();
	SinhVien sVien=new SinhVien(masv,nghenghiep,tk,mk,name,date,gioitinh,cccd);
	return sVien;
}
@Override
public void output(SinhVien sv) {
	System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s\n",
           sv.getHoTen(), sv.getNgaySinh(), sv.getGioiTinh(), sv.getCCCD(), 
            sv.getMaSV(), sv.getNganhNghe(), sv.getTaiKhoan(), sv.getMatKhau());
}
public void them(SinhVien sv) {
	if(soluong<danhSach.length)//voi lenght =max
		{
		danhSach[soluong++]=sv;
		System.out.println("them thanh cong");
	}
	else {
		System.out.println("danh sach da day");
	}
	
}


public void xoa(String maSVX) {
	for(int i=0;i<soluong;i++) {
		if(danhSach[i].getMaSV().equals(maSVX)) {
			for(int j=i;j<soluong;j++) {
				danhSach[j]=danhSach[j+1];
			}
			danhSach[soluong-1]=null;
			soluong--;
			System.out.println("Xoa thanh cong!");
			return;
		}
		else {
			System.out.println("Khong tim thay sinh vien");
		}
	}
}
public void timma(String masvt) {
	for(int i=0;i<soluong;i++) {
		if(danhSach[i].getMaSV().equals(masvt))
		{
			System.out.println("Thong tin sinh vien can tim");
			System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s\n", 
                    "Tên", "Ngày sinh", "Giới tính", "CCCD", "Mã SV", "Ngành nghề", "Tài khoản", "Mật khẩu");
			output(danhSach[i]);
		}
		else {
			System.out.println("Khong tim thay sinh vien");
		}
	}
}
public void timten(String tensvt) {
	for(int i=0;i<soluong;i++) {
		if(danhSach[i].getMaSV().equals(tensvt))
		{
			System.out.println("Thong tin sinh vien can tim");
			System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s\n", 
                    "Tên", "Ngày sinh", "Giới tính", "CCCD", "Mã SV", "Ngành nghề", "Tài khoản", "Mật khẩu");
			output(danhSach[i]);
		}
		else {
			System.out.println("Khong tim thay sinh vien");
		}
	}
}
public void hienthidanhsach() {
if(soluong!=0) {
	System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s\n", 
            "Tên", "Ngày sinh", "Giới tính", "CCCD", "Mã SV", "Ngành nghề", "Tài khoản", "Mật khẩu");
	for(int i=0;i<soluong;i++) {
		output(danhSach[i]);
	}
}
else {
	System.out.println("danh sach rong");
}
}
public void sua(String masvs, SinhVien svs) {
	for(int i=0;i<soluong;i++) {
		if(danhSach[i].getMaSV().equals(masvs)) {
			danhSach[i].setCCCD(svs.getCCCD());
			danhSach[i].setGioiTinh(svs.getGioiTinh());
			danhSach[i].setHoTen(svs.getHoTen());
			danhSach[i].setNgaySinh(svs.getNgaySinh());
			danhSach[i].setTaiKhoan(svs.getTaiKhoan());
			danhSach[i].setMatKhau(svs.getMatKhau());
			danhSach[i].setNganhNghe(svs.getNganhNghe());
			return;
		}
		else {
			System.out.println("khong tim thay sinh vien ");
		}
	}

}
public void xapXep() {
     {
        int n = soluong;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // So sánh maSV của hai đối tượng SinhVien
                if (danhSach[j].getMaSV().compareTo(danhSach[j + 1].getMaSV()) > 0) {
                    // Hoán đổi vị trí danhSach[j] và danhSach[j+1] nếu cần
                    SinhVien temp = danhSach[j];
                    danhSach[j] = danhSach[j + 1];
                    danhSach[j + 1] = temp;
                }
            }
        }
    }
}


}
package TX1Chuan;


import java.lang.classfile.TypeAnnotation.TargetInfo;
import java.util.Scanner;


public class Main {
public static void main(String args[]) {
	Scanner scanner=new Scanner(System.in);
	
	QuanLySinhVien qlsv=new QuanLySinhVien(100);
	

	while (true) {
		System.out.println("Chon cac tuy chon sau");
		System.out.println("1.them sinh vien");
		System.out.println("2.sua thong tin");
		System.out.println("3.xoa sinh vien co masv");
		System.out.println("4.tim sinh vien co ten");
		System.out.println("5.tim sinh vien co masv");
		System.out.println("6.hien thi danh sach");
		System.out.println("7.sap xep");
		System.out.println("8.close");
		int chon=scanner.nextInt();
		switch (chon) {
		case 1:
			//them
			qlsv.input();;
			break;
		case 2:
			//sua
			System.out.println("Nhap ma sinh vien can sua");
			String masvs=scanner.next();
			SinhVien sVien=qlsv.inputthongtinsinhvien();
			qlsv.sua(masvs, sVien);
			break;
		case 3:
			System.out.println("Nhap ma sinh vien can xoa: ");
			String msvx=scanner.next();
			qlsv.xoa(msvx);
			System.out.println("Xoa thanh cong");
			break;
		case 4:
			System.out.println("Nhap ma sinh vien can tim: ");
			String msvt=scanner.next();
			qlsv.timma(msvt);
			break;
		case 5:
			System.out.println("Nhap ma sinh vien can tim: ");
			String tensvt=scanner.next();
			qlsv.timma(tensvt);	
				break;	
		case 6:
			qlsv.hienthidanhsach();
			break;
		case 7:
			qlsv.xapXep();
			break;
		default:
			System.out.println("Invalid choice. Please select again.");
		}
	}
		
	}
}
