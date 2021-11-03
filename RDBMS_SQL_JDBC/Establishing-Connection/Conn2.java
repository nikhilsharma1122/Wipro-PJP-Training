import java.sql.*;
public class class1 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection conn = null;
		try {
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","nikhil@123");
			System.out.println("Connection Successfull");
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Connection could not establish");
		}finally {
			if(conn!=null)
				conn.close();
		}
		
	}

}
