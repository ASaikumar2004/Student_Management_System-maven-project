package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbconnections.studentdbconnection;
import services.studentservice;
@WebServlet("/delete")
public class deletestudentServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String rollnumber=req.getParameter("rollnumber");
		studentservice service=new studentservice(studentdbconnection.getConnection());
		boolean f=service.deletebyrollnumber(rollnumber);
		if(f) {
			resp.sendRedirect("");
		}
		else {
			resp.sendRedirect("");
		}
	}

}
