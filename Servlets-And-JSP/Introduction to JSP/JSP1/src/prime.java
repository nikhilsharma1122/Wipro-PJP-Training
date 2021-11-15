package Registration;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class prime
 */
@WebServlet("/prime")
public class prime extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("Hello this is servlet page");
		ArrayList<Integer> arr = new ArrayList();
		int num = Integer.parseInt(request.getParameter("prime"));
		for(int i=0;i<num;i++) {
			if(isPrime(i)) {
				arr.add(i);
			}
		}
		request.setAttribute("primearrlist", arr);
		request.getRequestDispatcher("primeList.jsp").forward(request, response);
		out.close();
	}
	public static boolean isPrime(int num) {
		if(num<=1) {
			return false;
		}
		for(int i=2;i<=(int)Math.sqrt(num);i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}

}
