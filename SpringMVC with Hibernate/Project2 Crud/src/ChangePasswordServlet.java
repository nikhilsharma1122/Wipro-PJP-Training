
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ChangePasswordServlet
 */
@WebServlet(name = "ChangePasswordServlets", urlPatterns = { "/ChangePasswordServlets" })
public class ChangePasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		
		try {
			Connection conn = DBUtil.getConn();
			PreparedStatement pstmt;
			String query;
			String table_name = "data_table_2";
			
			query = "SELECT * FROM hr."+table_name+" WHERE username="+name;
			pstmt = conn.prepareStatement(query);
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				
				String oldpwd = request.getParameter("oldpwd");
				String newpwd = request.getParameter("newpwd");
				
				query = "UPDATE hr."+table_name+" SET password="+newpwd+" WHERE password="+oldpwd;
				pstmt = conn.prepareStatement(query);
				int t = pstmt.executeUpdate();
				
				if(t==1) {
					/// pwd updated
					String message = "Password changed successfully!!";
					out.print("<!DOCTYPE html>\r\n" + 
							"<html>\r\n" + 
							"<head>\r\n" + 
							"<meta charset=\"ISO-8859-1\">\r\n" + 
							"<title>Project 2</title>\r\n" + 
							"<style>\r\n" + 
							"	h1,h3{\r\n" + 
							"		text-align: center;\r\n" + 
							"		text-size: 30px;\r\n" + 
							"		text-color: green;\r\n" + 
							"	}\r\n" + 
							"</style>\r\n" + 
							"</head>\r\n" + 
							"<body>\r\n" + 
							"	<h1>"+message+"</h1>\r\n" + 
							"	<h3><a href=\"index.html\">Click here to go to main menu</a></h3>\r\n" + 
							"</body>\r\n" + 
							"</html>");
				}
				else {
					/// old pwd does not match
					String message = "Old Password did not match!!";
					out.print("<!DOCTYPE html>\r\n" + 
							"<html>\r\n" + 
							"<head>\r\n" + 
							"<meta charset=\"ISO-8859-1\">\r\n" + 
							"<title>Project 2</title>\r\n" + 
							"</head>\r\n" + 
							"<body>\r\n" + 
							"	<h1 style=\"text-align:center;\">User Login portal</h1>\r\n" + 
							"	<h2 style=\"text-align:center; text-color:red;\">"+message+"</h2>\r\n" + 
							"	<p style=\"text-align:center; font-size:30px; text-color:blue\"><a href=\"index.html\">Click here to go to main menu</a></p>\r\n" + 
							"</body>\r\n" + 
							"</html>");
				}
				
			}
			else {
				///user does not exist
				String message = "User does not exist";
				out.print("<!DOCTYPE html>\r\n" + 
						"<html>\r\n" + 
						"<head>\r\n" + 
						"<meta charset=\"ISO-8859-1\">\r\n" + 
						"<title>Project 2</title>\r\n" + 
						"</head>\r\n" + 
						"<body>\r\n" + 
						"	<h1 style=\"text-align:center;\">User Login portal</h1>\r\n" + 
						"	<h2 style=\"text-align:center; text-color:blue;\">"+message+"</h2>\r\n" + 
						"	<p style=\"text-align:center; font-size:30px; text-color:blue\"><a href=\"Registration.html\">Click here to Register.</a></p>\r\n" + 
						"</body>\r\n" + 
						"</html>");
			}
			
		} 
		catch (Exception e) {
			response.sendRedirect("ChangePassword.html");
			e.printStackTrace();
		}
	}

}
