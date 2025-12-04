import java.util.Scanner;

interface StudentManagement {
    void input();
    void output(sinhVien sv);
}

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

class QuanLySinhVien implements StudentManagement {
    private SinhVien[] danhSach;
    private int soLuong;

    public QuanLySinhVien(int capacity) {
        danhSach = new SinhVien[capacity];
        soLuong = 0;
    }

    public void themSinhVien(SinhVien sv) {
        if (soLuong < danhSach.length) {
            danhSach[soLuong++] = sv;
            System.out.println("Added student successfully!\n");
        } else {
            System.out.println("Student list is full!\n");
        }
    }

    public void suaSinhVien(String maSV,SinhVien svsua) {
        for (int i = 0; i < soLuong; i++) {
            if (danhSach[i].getMaSV().equals(maSV)) {
                danhSach[i].setHoTen(svsua.getHoTen());
                danhSach[i].setNgaySinh(svsua.getNgaySinh());
                danhSach[i].setGioiTinh(svsua.getGioiTinh());
                danhSach[i].setCCCD(svsua.getCCCD());
                danhSach[i].setNganhNghe(svsua.getNganhNghe());
                danhSach[i].setTaiKhoan(svsua.getTaiKhoan());
                danhSach[i].setMatKhau(svsua.getMatKhau());
                System.out.println("Updated student successfully!\n");
                return;
            }
        }
        System.out.println("Student not found with ID: \n" + maSV);
    }

    public void xoaSinhVien(String maSV) {
        for (int i = 0; i < soLuong; i++) {
            if (danhSach[i].getMaSV().equals(maSV)) {
                for(int j=i;j<soLuong-1;j++){
                    danhSach[j]=danhSach[j+1];
                   
                }
                danhSach[soLuong-1]=null;
                soLuong--;

                System.out.println("Deleted student successfully!\n");
                return;
            }
        }
        System.out.println("Student not found with ID: \n" + maSV);
    }

    public void timKiemTheoTen(String hoTen) {
        for (int i = 0; i < soLuong; i++) {
            if (danhSach[i].getHoTen().equals(hoTen)) {
                output(danhSach[i]);
            }
        }
    }

    public void timKiemTheoMaSV(String maSV) {
        for (int i = 0; i < soLuong; i++) {
            if (danhSach[i].getMaSV().equals(maSV)) {
                output(danhSach[i]);
                return;
            }
        }
        System.out.println("Student not found with ID: \n" + maSV);
    }

    public void hienThiDanhSach() {
        if(soLuong!=0){
            for (int i = 0; i < soLuong; i++) {
                output(danhSach[i]);
            }
        }
        else{
            System.out.println("Danh sach rong!");
        }
    }
@Override
    private void output(SinhVien sv) {
        System.out.println("Name: " + sv.getHoTen());
        System.out.println("Date of Birth: " + sv.getNgaySinh());
        System.out.println("Gender: " + sv.getGioiTinh());
        System.out.println("CCCD: " + sv.getCCCD());
        System.out.println("Student ID: " + sv.getMaSV());
        System.out.println("Major: " + sv.getNganhNghe());
        System.out.println("Account: " + sv.getTaiKhoan());
        System.out.println("---------");
    }
    public SinhVien inputThongtin(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String hoTen = scanner.nextLine();
        System.out.print("Enter date of birth: ");
        String ngaySinh = scanner.nextLine();
        System.out.print("Enter gender: ");
        String gioiTinh = scanner.nextLine();
        System.out.print("Enter CCCD: ");
        String CCCD = scanner.nextLine();
        System.out.print("Enter student ID: ");
        String maSV = scanner.nextLine();
        System.out.print("Enter major: ");
        String nganhNghe = scanner.nextLine();
        System.out.print("Enter account: ");
        String taiKhoan = scanner.nextLine();
        System.out.print("Enter password: ");
        String matKhau = scanner.nextLine();
        SinhVien sinhVien = new SinhVien(maSV, nganhNghe, taiKhoan, matKhau, hoTen, ngaySinh, gioiTinh, CCCD);
        return sinhVien;
    }
    @Override
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String hoTen = scanner.nextLine();
        System.out.print("Enter date of birth: ");
        String ngaySinh = scanner.nextLine();
        System.out.print("Enter gender: ");
        String gioiTinh = scanner.nextLine();
        System.out.print("Enter CCCD: ");
        String CCCD = scanner.nextLine();
        System.out.print("Enter student ID: ");
        String maSV = scanner.nextLine();
        System.out.print("Enter major: ");
        String nganhNghe = scanner.nextLine();
        System.out.print("Enter account: ");
        String taiKhoan = scanner.nextLine();
        System.out.print("Enter password: ");
        String matKhau = scanner.nextLine();
        SinhVien sinhVien = new SinhVien(maSV, nganhNghe, taiKhoan, matKhau, hoTen, ngaySinh, gioiTinh, CCCD);
        
        themSinhVien(sinhVien);
    }
}

public class tx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuanLySinhVien qlSv = new QuanLySinhVien(100);

        while (true) {
            System.out.println("Select an option:");
            System.out.println("1. Add student");
            System.out.println("2. Edit student");
            System.out.println("3. Delete student");
            System.out.println("4. Search student by name");
            System.out.println("5. Search student by ID");
            System.out.println("6. Display student list");
            System.out.println("0. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    qlSv.input();
                    break;
                case 2:
                System.out.print("Nhập mã sinh viên để sửa: ");
                String maSVToEdit = scanner.nextLine();
                System.out.println("Nhập thông tin sinh viên mới:");
            
                SinhVien svsua = qlSv.inputThongtin();  // Nhập thông tin mới
                qlSv.suaSinhVien(maSVToEdit, svsua);
                break;
            
                case 3:
                    System.out.print("Enter student ID to delete: ");
                    String maSVToDelete = scanner.nextLine();
                    qlSv.xoaSinhVien(maSVToDelete);
                    break;
                case 4:
                    System.out.print("Enter student name to search: ");
                    String tenToFind = scanner.nextLine();
                    System.out.println("Student information:");
                    qlSv.timKiemTheoTen(tenToFind);
                    break;
                case 5:
                    System.out.print("Enter student ID to search: ");
                    String maSVToFind = scanner.nextLine();
                    qlSv.timKiemTheoMaSV(maSVToFind);
                    break;
                case 6:
                        qlSv.hienThiDanhSach();
                    break;
                case 0:
                    qlSv = null;
                    System.out.println("Exiting the program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please select again.");
            }
        }
    }
}

