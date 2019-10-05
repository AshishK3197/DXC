package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Assessment2.Customer;
import Assessment2.CustomerDao;

@WebServlet("/MyFirstSrv2")
public class MyFirstSrv2 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		CustomerDao customerDao=new CustomerDao();
		ArrayList<Customer> customer = customerDao.getAllCustomers();
		PrintWriter out=response.getWriter();
		
		out.print("<table border='1px'>");
		out.print("<tr><th>Id</th><th>FName</th><th>LName</th><th>Address</th><th>DOB</th>");
		
		for(Customer c: customer)
		{
			 out.print("<tr>");
			 out.print("<td>"+c.getCustName()+"</td>");
			 out.print("<td>"+c.getCustLastName()+"</td>");
			 out.print("<td>"+c.getCustId()+"</td>");
			 out.print("<td>"+c.getAddress()+"</td>");
			 out.print("<td>"+c.getDob()+"</td>");
			 out.print("</tr>");
		}
			        
			    
			    out.print("</table>");
	}

	
}
	
