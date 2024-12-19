package services;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbconnections.studentdbconnection;
import models.Student;
@WebServlet("/update")
public class updateServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String Studentname=req.getParameter("Studentname");
		String address=req.getParameter("address");
		String email=req.getParameter("email");
		int pincode=Integer.parseInt(req.getParameter("pincode"));
		long phonenumber=Long.parseLong(req.getParameter("phonenumber"));
		int gender=Integer.parseInt("gender");
		String password=req.getParameter("password");
		Student s=new Student();
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
