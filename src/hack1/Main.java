package hack1;

import java.util.Scanner;

public class Main {
public static void main(String [] args) {
	Scanner scanner=new Scanner(System.in);
	QUANLY qlsv=new QUANLY();
	SINHVIENDAO dao=new SINHVIENDAO("student.dat");
	qlsv.list=dao.docfile();
	while(true) {
		System.out.println("Select an option:");
        System.out.println("1. Add student");
        System.out.println("2. Edit student");
        System.out.println("3. Delete student");
        System.out.println("4. Search student by name");
        System.out.println("5. Sap xep danh sach theo name");
		System.out.println("8. Sap xep diem theo thu tu tang dan");
        System.out.println("6. Display student list");
        System.out.println("7. Exit");
        int chon=scanner.nextInt();
        switch(chon) {
        case 1:
        	qlsv.them();
        	break;
        case 2:
        	System.out.println("Nhap ma sinh vien can sua: ");
        	String mas=scanner.next();
        	SINHVIEN svs=qlsv.nhap();
        	qlsv.sua(mas,svs);
        	break;
        case 3:
        	System.out.println("Nhap ma sinh vien can xoa: ");
        	String max=scanner.next();
        	qlsv.xoa(max);
        	break;
        case 4:
        	System.out.println("Nhap ten sinh vien can tim: ");
        	String namet=scanner.next();
        	qlsv.timten(namet);
        	break;
        case 5:
        	qlsv.sapxepTen();
        	break;
        case 6:
        	qlsv.hienthids();
        	break;
        case 7:
        	dao.ghifile(qlsv.list);
        	System.out.println("Thoat thanh cong");
        	scanner.close();
        	return;
		case 8:
			qlsv.sapxepDiem();
			break;
        default:
            System.out.println("Invalid choice. Please select again.");
        }
	}
}
}
