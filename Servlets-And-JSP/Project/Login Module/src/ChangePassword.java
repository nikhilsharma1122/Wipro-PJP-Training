package bean;

import java.sql.*;

public class ChangePassword {
	public boolean change(userBean ub) {
		boolean status = false;
		Connection conn;
		String query = "Update hr.loginuser set password = ? where username = ? AND password = ?";
		try{
			conn = DBUtil.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setString(1, ub.getNewPass());
			pstmt.setString(2, ub.getUsername());
			pstmt.setString(3, ub.getPassword());
			pstmt.execute();
			status = true;
			System.out.println("Password Change Successfully");
		}catch(Exception e) {
			System.out.println("Password Change Error "+e);
		}
		return false;
		
	}
}
