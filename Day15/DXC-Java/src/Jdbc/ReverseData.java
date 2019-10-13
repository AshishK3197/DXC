package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ReverseData {

		
		String reverse(String s) {
			String revString="";
			for (int i = s.length()-1; i >=0; i--) {
				revString = revString+s.charAt(i);
			}
			System.out.println(revString);
			return revString;
		}
		
		void getreverseData(String getreverseData) {
	
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con= DriverManager.getConnection
			("jdbc:oracle:thin:@localhost:1521:xe","dxc","pass");
			
			String[] arrSplit = getreverseData.split(",");
		    for (int i=0; i < arrSplit.length; i++)
		    {
		    	arrSplit[i]=reverse(arrSplit[i]);
		    }
			
			String sql;
			
			for(String s:arrSplit) {
			sql = "insert into politicians values(?)";

			PreparedStatement stat = con.prepareStatement(sql);
			
			
			stat.setString(1, s);  
		    stat.executeUpdate();
			}
				
			System.out.println("inserted");
	}
		 catch(Exception e) {
			 e.printStackTrace();
			 
		}
		
}
	
	  
	
	public static void main(String[] args) {
		ReverseData reverseData = new ReverseData();
		reverseData.getreverseData("ijidom,ijhahs,uppap,lawirjek");

	}

}
