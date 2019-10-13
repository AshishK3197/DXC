package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBCInsertData {
	
		void insertEmp(int EMPID, String EMPNAME, int AGE ,int DEPTID )
		{
			try
			{
				Class.forName("oracle.jdbc.OracleDriver");
				Connection con= DriverManager.getConnection
				("jdbc:oracle:thin:@localhost:1521:xe","dxc","pass");
				System.out.println("connected");
				
				String sql = "insert into emp values(?,?,?,?)";
				PreparedStatement stat = con.prepareStatement(sql);
				
				stat.setInt(1, EMPID);
				stat.setString(2, EMPNAME);
				stat.setInt(3, AGE);
				stat.setInt(4, DEPTID);
				
				
				stat.executeUpdate();
				System.out.println("executed");
			}
			
			catch (Exception e) {
				e.printStackTrace();
			}
		}

	public static void main(String[] args) {
		
		JDBCInsertData jdbcMain = new JDBCInsertData();
		jdbcMain.insertEmp(902, "AMIT", 48, 103);
		
		


	}

}
