package bean;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ChangePasswordServlet
 */
@WebServlet("/ChangePasswordServlet")
public class ChangePasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		
		String name = request.getParameter("username");
		String pass = request.getParameter("password");
		String newpas = request.getParameter("newpass");
		
		userBean ub = new userBean();
		ub.setUsername(name);
		ub.setPassword(pass);
		ub.setNewPass(newpas);
		
		ChangePassword cp = new ChangePassword();
		if(cp.change(ub)) {
			response.getWriter().append("<h1>Successful Changed ").append(name).append("!</h1>");
		}
		
	}

}
