import java.sql.*;
public class MakeConnection2{
	Connection conn;
	Statement stmt;
	ResultSet rs;
	MakeConnection1(){
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","nikhil@123");
			stmt = conn.createStatement();
			rs = stmt.executeQuery("Select first_name,job_id,salary,commission_pct from hr.employees where salary between 1000 and 2000");
			while(rs.next()) {
				System.out.println(rs.getString(1)+"    "+rs.getString(2)+"    "+rs.getInt(3)+"    "+rs.getInt(4));
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
