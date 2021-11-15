package bean;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserRegistrationServlet
 */
@WebServlet("/UserRegistrationServlet")
public class UserRegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			String name = request.getParameter("username");
			String password = request.getParameter("password");
			
			userBean ub = new userBean();
			ub.setUsername(name);
			ub.setPassword(password);
			
			UserRegistrationDAO userDAO = new UserRegistrationDAO();
			if(userDAO.newUser(ub)) {
				response.getWriter().append("<h1>Successful Registration ").append(name).append("!</h1>");
			}
			else	{
				System.out.println("Exception occured while UserRegistrationDAO");
				response.getWriter().append("Please try again later!");
			}
		}catch(Exception e) {
			response.getWriter().append("Please try again later!");
			System.out.println("Exception occured in UserRegistrationServlet");
			e.printStackTrace();
		}
	}

}
