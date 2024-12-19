package services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import models.Student;

public class studentservice {
	private Connection conn;

	public studentservice(Connection conn) {
		super();
		this.conn = conn;
	}

	public boolean addstudent(Student std) {
		boolean f = false;
		try {
			String sql = "insert into studentdetails(rollnumber,name,address,email,pincode,phonenumber,gender) values(?,?,?,?,?,?,?)";
			PreparedStatement pmst = conn.prepareStatement(sql);
			pmst.setString(1, std.getRollnumber());
			pmst.setString(2, std.getStudentname());
			pmst.setString(3, std.getEmail());
			pmst.setString(4, std.getAddress());
			pmst.setInt(5, std.getPincode());
			pmst.setLong(5, std.getPhonenumber());
			pmst.setInt(5, std.getGender());
			int i = pmst.executeUpdate();
			if (i == 1) {
				f = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}
	
	public List<Student> getallstudents(){
		List<Student> li=new ArrayList<Student>();
		Student s=null;
		try {
			String sql="select * from studentdetails";
			PreparedStatement pmst=conn.prepareStatement(sql);
			ResultSet rs=pmst.executeQuery();
			while(rs.next()) {
				s=new Student();
				s.setRollnumber(rs.getString(1));
				s.setStudentname(rs.getString(2));
				s.setEmail(rs.getString(3));
				s.setAddress(rs.getString(4));
				s.setPincode(rs.getInt(5));
				s.setPhonenumber(rs.getLong(6));
				s.setGender(rs.getInt(7));
				li.add(s);		
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return li;
	}

}
