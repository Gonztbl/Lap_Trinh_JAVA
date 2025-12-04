import java.util.Scanner;

class Nguoi {
    private String hoTen;
    private String ngaySinh;
    private String gioiTinh;
    private String CCCD;

    public Nguoi() {}

    public Nguoi(String hoTen, String ngaySinh, String gioiTinh, String CCCD) {
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

class SinhVien extends Nguoi {
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

class QuanLySinhVien implements Innertx1 {
    private SinhVien[] danhSach;
    private int soLuong;

    public QuanLySinhVien(int capacity) {
        danhSach = new SinhVien[capacity];
        soLuong = 0;
    }

    public void themSinhVien(SinhVien sv) {
        if (soLuong < danhSach.length) {
            danhSach[soLuong++] = sv;
            System.out.println("Them sinh vien thanh cong!\n");
        } else {
            System.out.println("Danh sach sinh vien da day!\n");
        }
    }

    public void suaSinhVien(String maSV) {
        for (int i = 0; i < soLuong; i++) {
            if (danhSach[i].getMaSV().equals(maSV)) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Nhap ho ten: ");
                danhSach[i].setHoTen(scanner.nextLine());
                System.out.print("Nhap ngay sinh: ");
                danhSach[i].setNgaySinh(scanner.nextLine());
                System.out.print("Nhap gioi tinh: ");
                danhSach[i].setGioiTinh(scanner.nextLine());
                System.out.print("Nhap so CCCD: ");
                danhSach[i].setCCCD(scanner.nextLine());
                System.out.print("Nhập nganh nghe: ");
                danhSach[i].setNganhNghe(scanner.nextLine());
                System.out.print("Nhập tai khoan: ");
                danhSach[i].setTaiKhoan(scanner.nextLine());
                System.out.print("Nhập mat khau: ");
                danhSach[i].setMatKhau(scanner.nextLine());
                System.out.println("Sua sinh vien thanh cong!\n");
                return;
            }
        }
        System.out.println("Khong tim thay sinh vien voi ma: \n" + maSV);
    }

    public void xoaSinhVien(String maSV) {
        for (int i = 0; i < soLuong; i++) {
            if (danhSach[i].getMaSV().equals(maSV)) {
                danhSach[i] = danhSach[soLuong - 1];
                danhSach[soLuong - 1] = null;
                soLuong--;
                System.out.println("Xoa sinh vien thanh cong!\n");
                return;
            }
        }
        System.out.println("Khong tim thay sinh vien voi ma: \n" + maSV);
    }

    public void timKiemTheoTen(String hoTen) {
        for (int i = 0; i < soLuong; i++) {
            if (danhSach[i].getHoTen().equals(hoTen)) {
                hienThiSinhVien(danhSach[i]);
            }
        }
    }

    public void timKiemTheoMaSV(String maSV) {
        for (int i = 0; i < soLuong; i++) {
            if (danhSach[i].getMaSV().equals(maSV)) {
                hienThiSinhVien(danhSach[i]);
                return;
            }
        }
        System.out.println("Khong tim thay sinh vien voi ma: \n" + maSV);
    }

    public void hienThiDanhSach() {
        for (int i = 0; i < soLuong; i++) {
            hienThiSinhVien(danhSach[i]);
        }
    }

    private void hienThiSinhVien(SinhVien sv) {
        System.out.println("Ho ten: " + sv.getHoTen());
        System.out.println("Ngay sinh: " + sv.getNgaySinh());
        System.out.println("Gioi tinh: " + sv.getGioiTinh());
        System.out.println("CCCD: " + sv.getCCCD());
        System.out.println("Ma sinh vien: " + sv.getMaSV());
        System.out.println("Nganh nghe: " + sv.getNganhNghe());
        System.out.println("Tai khoan: " + sv.getTaiKhoan());
        System.out.println("---------");
    }
}

public class tx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuanLySinhVien qlSv = new QuanLySinhVien(100);

        while (true) {
            System.out.println("Chon chuc nang:");
            System.out.println("1. Them sinh vien");
            System.out.println("2. Sua sinh vien");
            System.out.println("3. Xoa sinh vien");
            System.out.println("4. Tim kiem sinh vien theo ten");
            System.out.println("5. Tim kiem sinh vien theo ma");
            System.out.println("6. Hien thi danh sach sinh vien");
            System.out.println("0. Thoat");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Nhap ho ten: ");
                    String hoTen = scanner.nextLine();
                    System.out.print("Nhap ngay sinh: ");
                    String ngaySinh = scanner.nextLine();
                    System.out.print("Nhap gioi tinh: ");
                    String gioiTinh = scanner.nextLine();
                    System.out.print("Nhap CCCD: ");
                    String CCCD = scanner.nextLine();
                    System.out.print("Nhap ma sinh vien: ");
                    String maSV = scanner.nextLine();
                    System.out.print("Nhap nganh nghe: ");
                    String nganhNghe = scanner.nextLine();
                    System.out.print("Nhap tai khoan: ");
                    String taiKhoan = scanner.nextLine();
                    System.out.print("Nhap mat khau: ");
                    String matKhau = scanner.nextLine();
                    SinhVien sinhVien = new SinhVien(maSV, nganhNghe, taiKhoan, matKhau, hoTen, ngaySinh, gioiTinh, CCCD);
                    qlSv.themSinhVien(sinhVien);
                    break;
                case 2:
                    System.out.print("Nhap ma sinh vien can sua: ");
                    String maSVToEdit = scanner.nextLine();
                    qlSv.suaSinhVien(maSVToEdit);
                    break;
                case 3:
                    System.out.print("Nhap ma sinh vien de xoa: ");
                    String maSVToDelete = scanner.nextLine();
                    qlSv.xoaSinhVien(maSVToDelete);
                    break;
                case 4:
                    System.out.print("Nhap ten sinh vien can tim : ");
                    String tenToFind = scanner.nextLine();
                    System.out.println("Thong tin sinh vien:");
                    qlSv.timKiemTheoTen(tenToFind);
                    break;
                case 5:
                    System.out.print("Nhap ma sinh vien can tim : ");
                    String maSVToFind = scanner.nextLine();
                    qlSv.timKiemTheoMaSV(maSVToFind);
                    break;
                case 6:
                    qlSv.hienThiDanhSach();
                    break;
                case 0:
                    qlSv = null;
                    System.out.println("Thoat chuong trinh.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Lua chon khong hop le. Vui long chon lai");
            }
        }
    }
}
