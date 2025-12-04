package hack1;
import java.io.*;
import java.util.ArrayList;
public class SINHVIENDAO {
public String filepath;
public SINHVIENDAO(String filepath) {
	this.filepath=filepath;
}
public void ghifile(ArrayList<SINHVIEN> danhSach) {
	try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(filepath)))
	{
		oos.writeObject(danhSach);
		System.out.println("Ghi vao danh sach thanh xong!");
	}
	catch (Exception e) {
		// TODO: handle exception
		System.out.println("Khong the thuc hien! "+e.getMessage());
	}
}
public ArrayList<SINHVIEN> docfile(){
	ArrayList<SINHVIEN> danhSach=new ArrayList<>();
	try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream(filepath))){
		danhSach=(ArrayList<SINHVIEN>) ois.readObject();
	}
	catch (FileNotFoundException e) {
		// TODO: handle exception
		System.out.println("Khong tim thay hoac file khong ton tai!"+e.getMessage());
	}
	catch (Exception e) {
		// TODO: handle exception
		System.out.println("Doc file khong thanh cong! "+e.getMessage());
	}
	return danhSach;
}
}
