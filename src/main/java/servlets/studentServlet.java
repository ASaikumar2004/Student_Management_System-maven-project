package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbconnections.studentdbconnection;
import models.Student;
import services.studentservice;
@WebServlet("/register")
public class studentServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String rollnumber=req.getParameter("rollnumber");
		String Studentname=req.getParameter("Studentname");
		String email=req.getParameter("email");
		String address=req.getParameter("address");
		int pincode=Integer.parseInt(req.getParameter("pincode"));
		long phonenumber=Long.parseLong(req.getParameter("phonenumber"));
		int gender=Integer.parseInt("gender");
		String password=req.getParameter("password");
		Student s=new Student(rollnumber,Studentname,email,address,pincode,phonenumber,gender,password);
		studentservice service=new studentservice(studentdbconnection.getConnection());
		boolean f=service.addstudent(s);
		if(f) {
			resp.sendRedirect("");	
		}
		else {
			resp.sendRedirect("");
		}
	}

}
