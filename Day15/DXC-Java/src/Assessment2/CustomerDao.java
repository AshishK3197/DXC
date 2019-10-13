package Assessment2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;

import Assessment2.DbUtil;
import Assessment2.Customer;
public class CustomerDao {
	
	public int generateCustID() {
		try {
		Connection con = DbUtil.getConnection();
		
		String sql = "select seqcust.nextval from dual";
		PreparedStatement stat = con.prepareStatement(sql);
		ResultSet rs = stat.executeQuery();
		
		if (rs.next()) {
			return rs.getInt(1);
		}
		
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return 0;
		
	}
	
	
	
	public String saveCustomer(Customer customer) {
		try {
			
			String seq_id = "";
			
			Connection con = DbUtil.getConnection();
			String sql = "insert into customersave values(?,?,?,?,?)";
			PreparedStatement stat = con.prepareStatement(sql);
			int seqNum = generateCustID();
			if(seqNum<=9) {
			seq_id+=customer.getCustName().substring(0, 2)+customer.getCustLastName().substring(0, 2)+"00"+generateCustID();
			customer.setCustId(seq_id);
			}
			
			else if(seqNum<=99 && seqNum>=10) {
				seq_id+=customer.getCustName().substring(0, 2)+customer.getCustLastName().substring(0, 2)+"0"+seqNum;
				customer.setCustId(seq_id);
			}
			stat.setString(1, customer.getCustName());
			stat.setString(2, customer.getCustLastName());
			stat.setString(3, customer.getCustId());
			stat.setString(4, customer.getAddress());
			java.util.Date dob=customer.getDob();

			Date sqlDate=new Date(dob.getYear(), dob.getMonth(), dob.getDate());


			stat.setDate(5,sqlDate);
			
			int res = stat.executeUpdate();
			if (res>0) {
				return "Customer Saved";
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Customer Not Saved";
	}
	
	
	
	
	
	
	
	
	
	public ArrayList<Customer>getAllCustomers()
	{
		ArrayList<Customer> custList=new ArrayList<Customer>();
		Connection con= DbUtil.getConnection();

		String sql="select * from customer";
		PreparedStatement stat;
		try {
			stat = con.prepareStatement(sql);
			ResultSet rs=stat.executeQuery();
			if(rs.next())
			{
				do {
					Customer customer = new Customer();
					customer.setCustName(rs.getString(1));	
					customer.setCustLastName(rs.getString(2));	
					customer.setCustId(rs.getString(3));
					customer.setAddress(rs.getString(4));
					customer.setDob(rs.getDate(5));	
					custList.add(customer);
					}
				while(rs.next());
				
				
			}
			else
			{
				return custList;
			}
		} 
		catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return custList;

		
	}
	

}

