package hack1;
import java.io.Serializable;
public class NGUOI implements Serializable {
public String name;
public String date;
public String address;
public String gioiTinh;
public String CCCD;
public NGUOI() {
	// TODO Auto-generated constructor stub
}
public NGUOI(
	String name,
	String date,
	String address,
	String gioiTinh,
	String CCCD
		) {
	this.name=name;
	this.date=date;
	this.address=address;
	this.gioiTinh=gioiTinh;
	this.CCCD=CCCD;
	
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
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
public void setCCCD(String cCCD) {
	CCCD = cCCD;
}

}
