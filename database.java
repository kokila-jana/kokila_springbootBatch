package batch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class database {

	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "LIVEWIRE123", "Kokila Janarthanan");
			System.out.println("db connected..");
			
			Statement s=con.createStatement();
//			s.executeUpdate("insert into batch values (12,'Kokila','Python')");
//			System.out.println("inserted...");
			
			ResultSet rs=s.executeQuery("select * from batch");
			while(rs.next())
			{
				System.out.println(rs.getInt("id")+" "+rs.getString("name")+" "
						+ ""+rs.getString("course"));
			}
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
