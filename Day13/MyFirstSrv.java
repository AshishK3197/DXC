package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Assessment2.Customer;
import Assessment2.CustomerDao;

@WebServlet("/MyFirstSrv")
public class MyFirstSrv extends HttpServlet {

@Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
try{
//PrintWriter out= response.getWriter();

String customerName= request.getParameter("custName");
String customerLastName = request.getParameter("custLastName");
String customerId=request.getParameter("custId");
String customeraddress=request.getParameter("address");
String customerdob=request.getParameter("dob");

Customer customer=new Customer();
customer.setCustName(customerName);
customer.setCustLastName(customerLastName);
customer.setCustId(customerId);
customer.setAddress(customeraddress);


SimpleDateFormat sd=new SimpleDateFormat("yyyy-MM-dd");
Date dob=sd.parse(customerdob);
customer.setDob(dob);


CustomerDao dao=new CustomerDao();
dao.saveCustomer(customer);



}
catch (Exception e) {
e.printStackTrace();
}


}


}