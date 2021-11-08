import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
public class JDBCOperation {
	static Connection conn;
	ResultSet rs;
	static void getConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","nikhil@123");
			System.out.println("Connection Establish Successfully");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public String getUserType(String userID) throws SQLException {
		getConnection();
		try {
			System.out.println("----User Type -----");
			String user = userID;
			PreparedStatement pstmt = conn.prepareStatement("Select usertype from hr.jdbcoperation where userid = '"+user+"'");
			rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString(1));
			}
			pstmt.close();
			rs.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return userID;
	}
	public String getIncorrectAttempts(String userID) throws SQLException{
		getConnection();
		try {
			System.out.println("----- Incorrect Input Attempts ------");
			PreparedStatement pstmt = conn.prepareStatement("select incorrectattempts from hr.jdbcoperation where userid = '"+userID+"'");
			rs = pstmt.executeQuery();
			while(rs.next()) {
				int att = Integer.parseInt(rs.getString(1));
				if(att == 0) {
					System.out.println("No InCorrect Attempt");
					return "No InCorrect Attempt";
				}
				else if(att == 1) {
					System.out.println("One Time");
					return "One Time";
				}
				else {
					System.out.println("Incorrect Attempt Exceeded");
					return "Incorrect Attempt Exceeded";
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return userID;
	}
	public String changeUserType(String userID) throws SQLException{
		getConnection();
		try {
			System.out.println("----- Update UserType ------");
			PreparedStatement pstmt = conn.prepareStatement("update hr.jdbcoperation set usertype = 'Admin' where userid = '"+userID+"'");
			int rowsAffected = pstmt.executeUpdate();
			if(rowsAffected >=1) {
				System.out.println("Update Success");
			}
			else {
				System.out.println("Update Failed");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return userID;
	}
	public int getLockStatus() throws SQLException{
		getConnection();
		try {
			System.out.println("----- Get Lock Status ------");
			PreparedStatement pstmt = conn.prepareStatement("Select lockstatus from hr.jdbcoperation where lockstatus = 0");
			int count = pstmt.executeUpdate();
			System.out.println(count);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	public String changeName(String id,String name) {
		getConnection();
		try {
			System.out.println("----- Change Name using UserID ------");
			PreparedStatement pstmt = conn.prepareStatement("Update hr.jdbcoperation set name = '"+name+"' where userid = '"+id+"'");
			pstmt.executeUpdate();
			System.out.println("Success");
		}catch(Exception e) {
			System.out.println("Failed");
			e.printStackTrace();
		}
		return name;	
	}
	public String changePassword(String password) {
		getConnection();
		try {
			System.out.println("----- Change Password using UserType ------");
			PreparedStatement pstmt = conn.prepareStatement("Update hr.jdbcoperation set password = '"+password+"' where usertype = 'Admin'");
			pstmt.executeUpdate();
			System.out.println("Success");
		}catch(Exception e) {
			System.out.println("Failed");
			e.printStackTrace();
		}
		return password;
	}
	public String addUser_1(UserBean bean) {
		getConnection();
		try {
			System.out.println("----- Insert in Database ------");
			PreparedStatement pstmt = conn.prepareStatement("insert into hr.jdbcoperation values(?,?,?,?,?,?)");
			pstmt.setString(1, bean.getID());
			pstmt.setString(2, bean.getPassword());
			pstmt.setString(3, bean.getName());
			pstmt.setInt(4, bean.getIncorrectAttempts());
			pstmt.setInt(5, bean.getLockStatus());
			pstmt.setString(6, bean.getUserType());
			pstmt.execute();
			System.out.println("Success");
			
		}catch(Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
		return null;

	}
	public String addUser_2(UserBean bean) {
		getConnection();
		try {
			System.out.println("----- Insert in Database if and only if lockStatus is 0 ------");
			if(bean.getLockStatus() == 0) {
				PreparedStatement pstmt = conn.prepareStatement("insert into hr.jdbcoperation values(?,?,?,?,?,?)");
				pstmt.setString(1, bean.getID());
				pstmt.setString(2, bean.getPassword());
				pstmt.setString(3, bean.getName());
				pstmt.setInt(4, bean.getIncorrectAttempts());
				pstmt.setInt(5, bean.getLockStatus());
				pstmt.setString(6, bean.getUserType());
				pstmt.execute();
				System.out.println("Success");
			}
			else {
				System.out.println("Fail");
			}
		}catch(Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
		return null;
	}
	public ArrayList<UserBean> storeAllRecords(){
		getConnection();
		ArrayList<UserBean> list = new ArrayList();
 		try {
 			System.out.println("----- Add Database All Values in ArrayList ------");
 			PreparedStatement pstmt = conn.prepareStatement("Select * from hr.jdbcoperation");
 			rs = pstmt.executeQuery();
 			UserBean bean = new UserBean();
 			while(rs.next()) {	
 				bean.setID(rs.getString(1));
 				bean.setPassword(rs.getString(2));
 				bean.setName(rs.getString(3));
 				bean.setIncorrectAttempts(rs.getInt(4));
 				bean.setLockStatus(rs.getInt(5));
 				bean.setUserType(rs.getString(6));
 				list.add(bean);
 			}
 			
 			System.out.println("Successfully added the values in the ArrayList");
 			
		}catch(Exception e) {
			e.printStackTrace();
		}
 		
 		
		return list;
	}
	public ArrayList<UserBean> getUsers(String userType){
		getConnection();
		ArrayList<UserBean> list = new ArrayList();
		try {
			System.out.println("----- Add Database Specified UserType Values in ArrayList ------");
			PreparedStatement pstmt = conn.prepareStatement("Select * from hr.jdbcoperation where usertype = '"+userType+"'");
			rs = pstmt.executeQuery();
			while(rs.next()) {
				UserBean bean = new UserBean();
				bean.setID(rs.getString(1));
				bean.setPassword(rs.getString(2));
				bean.setName(rs.getString(3));
				bean.setIncorrectAttempts(rs.getInt(4));
				bean.setLockStatus(rs.getInt(5));
				bean.setUserType(rs.getString(6));
				list.add(bean);
			}
			System.out.println("Successfully added the values in the ArrayList");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	public String[] getNames() {
		getConnection();
		
		try {
			System.out.println("----- Add data into String Array using Database ------");
			PreparedStatement pstmt = conn.prepareStatement("Select name from hr.jdbcoperation");
			rs = pstmt.executeQuery();
			while(rs.next()) {
				String[] name = new String[1];
				for(int i = 0;i<name.length;i++) {
					name[i] = rs.getString(1);
					System.out.println(name[i]);
					//System.out.println("Added Successfully");
				}
				//System.out.println(rs.getString(1));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		JDBCOperation j = new JDBCOperation();
		j.getUserType("AB1001");
		j.getIncorrectAttempts("RS1003");
		j.changeUserType("RS1003");
		j.getLockStatus();
		j.changeName("AB1001", "OM");
		j.changePassword("AB2002");
		//UserBean bean = new UserBean("CD1001", "CD1001", "Hari", 0, 0, "Employee");
		//j.addUser_1(bean);
		//UserBean bean = new UserBean("EF1001", "EF1001", "Ajit", 0, 0, "Employee");
		//j.addUser_2(bean);
		j.storeAllRecords();
		j.getUsers("Admin");
		j.getNames();
		
	}

}
