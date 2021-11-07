import java.sql.*;
class ConnectionMakingClass {
	Connection conn;
	Connection conmake() {
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","nikhil@123");
		
	}catch(Exception e) {
		e.printStackTrace();
		}
	return conn;
	}
	
}
public class JDBCCall {
	Connection conn;
	JDBCCall(){
		ConnectionMakingClass x = new ConnectionMakingClass();
		conn = x.conmake();
	}
	
	/*void create(String[] args) throws SQLException{
		String tablename = args[0];
		PreparedStatement pst = conn.prepareStatement("Create table "+tablename+" (RollNo number(4), Name varchar(20), Class varchar2(5), Admission date, Fees number(10,2))");
		pst.executeUpdate();
		System.out.println("Table Created Successfully");	
	}*/
	void insert(String[] args) throws SQLException{
		String tablename = "student";
		int rollno = Integer.parseInt(args[1]);
		String name = args[2];
		String stu_class = args[3];
		String dates = args[4];
		Float fees = Float.parseFloat(args[5]);
		PreparedStatement pst = conn.prepareStatement("insert into "+tablename+" values(?,?,?,?,?)");
		pst.setInt(1, rollno);
		pst.setString(2, name);
		pst.setString(3, stu_class);
		pst.setString(4, dates);
		pst.setFloat(5, fees);
		pst.executeUpdate();
		System.out.println("Record Inserted Successfully");
	}
	void display(String[] args) throws SQLException{
		String tablename = "student";
		try {
			int rollno = Integer.parseInt(args[1]);
			PreparedStatement pst = conn.prepareStatement("select * from "+tablename+" where rollno = "+rollno);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getFloat(5));
			}
		}catch(Exception e) {
			PreparedStatement pst = conn.prepareStatement("select * from "+tablename);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getFloat(5));
			}
		}
		
	}
	void modify(String[] args) throws SQLException{
		String tablename = "student";
		int rollno = Integer.parseInt(args[1]);
		Float fees = Float.parseFloat(args[2]);
		PreparedStatement pst = conn.prepareStatement("update "+tablename+" set fees = "+fees+" where rollno = "+rollno);
		pst.executeUpdate();
		System.out.println("Modifying Successfully");
	}
	void delete(String[] args) throws SQLException{
		String tablename = "student";
		int rollno = Integer.parseInt(args[1]);
		PreparedStatement pst = conn.prepareStatement("delete from "+tablename+" where rollno = "+rollno);
		pst.executeQuery();
		System.out.println("Deleted Successfully");
	}
}
