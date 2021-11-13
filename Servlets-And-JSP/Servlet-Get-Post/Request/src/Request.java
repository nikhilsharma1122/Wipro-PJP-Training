package Registration;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

/**
 * Servlet implementation class Request
 */
@WebServlet(description = "Display requests", urlPatterns = { "/request" })
public class Request extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>\n" + "<head><title> HTTP Headers </title></head>\n"
				+ "<body bgcolor = \"#f0f0f0\">\n" + "<h1 align = \"center\"> HTTP Headers </h1>\n"
				+ "<table width = \"100%\" border = \"1\" align = \"center\">\n" + "<tr bgcolor = \"#949494\">\n"
				+ "<th>Header Name</th><th>Header Value(s)</th>\n" + "</tr>\n");
		Enumeration<String> headernames=request.getHeaderNames();
		while(headernames.hasMoreElements()) {
			String paramName=(String) headernames.nextElement();
			out.print("<tr><td>"+paramName+"</td>\n");
			String paramValue = request.getHeader(paramName);
			out.print("<td> "+paramValue+"</td><tr>\n");
		}
		out.println("</table>\n</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
