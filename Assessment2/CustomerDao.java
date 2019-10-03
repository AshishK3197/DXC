package Assessment2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
			String sql = "insert into customersave values(?,?,?,?)";
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
			
			int res = stat.executeUpdate();
			if (res>0) {
				return "Customer Saved";
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Customer Not Saved";
	}
	

}

