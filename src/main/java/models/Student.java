package models;

public class Student {
	private String rollnumber;
	private String Studentname;
	private String email;
	private String address;
	private int pincode;
	private long phonenumber;
	private int gender;
	public String getRollnumber() {
		return rollnumber;
	}
	public void setRollnumber(String rollnumber) {
		this.rollnumber = rollnumber;
	}
	public String getStudentname() {
		return Studentname;
	}
	public void setStudentname(String studentname) {
		Studentname = studentname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String rollnumber, String studentname, String email, String address, int pincode, long phonenumber,
			int gender) {
		super();
		this.rollnumber = rollnumber;
		Studentname = studentname;
		this.email = email;
		this.address = address;
		this.pincode = pincode;
		this.phonenumber = phonenumber;
		this.gender = gender;
	}
	
}
