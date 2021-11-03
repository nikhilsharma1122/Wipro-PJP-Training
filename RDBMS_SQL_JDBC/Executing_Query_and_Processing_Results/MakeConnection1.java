import java.sql.*;
public class MakeConnection1{
	Connection conn;
	Statement stmt;
	ResultSet rs;
	MakeConnection1(){
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","nikhil@123");
			stmt = conn.createStatement();
			rs = stmt.executeQuery("Select empno, ename from hr.emp");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2));
			}
			rs.close();
			stmt.close();
			conn.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException c) {
			System.out.println("Class Not Found");
			c.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MakeConnection1();
	}

}
