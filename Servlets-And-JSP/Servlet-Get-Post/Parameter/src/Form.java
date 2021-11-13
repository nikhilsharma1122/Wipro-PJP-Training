package Registration;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Form
 */
@WebServlet(description = "Display Parameters", urlPatterns = { "/login" })
public class Form extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=req.getParameter("name");
		String pass = req.getParameter("password");
		String age = req.getParameter("age");
		String date = req.getParameter("date");
		response(res,"Name: "+name);
		response(res,"Password: "+pass);
		response(res,"Age: "+age);
		response(res,"Date: "+date);
		
	}

	private void response(HttpServletResponse res, String msg) throws IOException {
		// TODO Auto-generated method stub
		PrintWriter out=res.getWriter();
		out.print("<html>");
		out.print("<head><title> Received Parameters</title></head>");
		out.println("<body align=\"center\">");
        out.println("<h3>" + msg + "</h3>");
        out.println("</body>");
        out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	

}
