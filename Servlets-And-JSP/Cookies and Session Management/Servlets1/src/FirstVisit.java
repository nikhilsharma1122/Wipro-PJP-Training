package Registration;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstTime
 */

@WebServlet(description = "Remember First Visit", urlPatterns = { "/first" })
public class FirstTime extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1>"+"Welcome to Visit"+"</h1>");
		Cookie[] cookies = request.getCookies();
		out.println("<h1>"+"Cookies Are Getted"+"</h1>");
		
		if(cookies!=null) {
			for(int i=0;i<cookies.length;i++) {
				if(cookies[i].getName().equals("FirstVisit")) {
					out.print("Welcome Back");
				}
			}
		}else {
			Cookie firstcookie = new Cookie("FirstVisit","No");
			response.addCookie(firstcookie);
			out.println("Welcome! You are visiting for the first time.");
		}
		out.close();
	}

}
