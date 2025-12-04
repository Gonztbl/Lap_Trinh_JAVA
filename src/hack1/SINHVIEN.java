package hack1;
import java.io.Serializable;
public class SINHVIEN extends NGUOI implements Serializable{
public String maSV;
public String nghe;
public String TK;
public String MK;
public int diem;
public SINHVIEN() {
	
}
public SINHVIEN(
		String name,
		String date,
		String address,
		String gioiTinh,
		String CCCD,
	String maSV,
	String nghe,
	String TK,
	String MK,
	int diem
		) {
	super(name,date,gioiTinh,address,CCCD);
	this.maSV=maSV;
	this.nghe=nghe;
	this.TK=TK;
	this.MK=MK;
	this.diem=diem;
	
	
}
public void setDiem(int diem){
	this.diem=diem;
}
public int getDiem(){
	return diem;
}
public String getMaSV() {
	return maSV;
}
public void setMaSV(String maSV) {
	this.maSV = maSV;
}
public String getNghe() {
	return nghe;
}
public void setNghe(String nghe) {
	this.nghe = nghe;
}
public String getTK() {
	return TK;
}
public void setTK(String tK) {
	TK = tK;
}
public String getMK() {
	return MK;
}
public void setMK(String mK) {
	MK = mK;
}

}
