package master;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class student
 */
public class student extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("nm");
		String roll = request.getParameter("rl");
		out.println("Student Name : " + name);
		out.println("<p>");
		out.println("Student Name : " + roll);
		
		ServletContext context = this.getServletContext();
		out.println(context.getInitParameter("Roll")); // Name of the Context file in web.xml
		
		ServletConfig config = this.getServletConfig();
		out.println(config.getInitParameter("Fax")); // from the same name as web xml
	}

}
