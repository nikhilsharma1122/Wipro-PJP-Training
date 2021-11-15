package bean;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AucServ
 */
@WebServlet("/AucServ")
public class AucServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/hmtl");
		String itemname = request.getParameter("itemname");
		int itemId = Integer.parseInt(request.getParameter("itemid"));
		String Sname = request.getParameter("name");
		String Smail = request.getParameter("email");
		int Samount = Integer.parseInt(request.getParameter("amount"));
		String Scheck = request.getParameter("check");
		AucBean b = new AucBean(itemId,itemname, Sname, Smail, Samount, Scheck);
		request.setAttribute("b", b);
		request.getRequestDispatcher("Aucjsp.jsp").forward(request, response);
	}

}
