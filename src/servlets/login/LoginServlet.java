package servlets.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8292048947516860040L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		req.getRequestDispatcher("link.html").include(req, resp);

		String name = req.getParameter("name");
		String password = req.getParameter("password");

		if (password.equals("admin")) {
			out.println("You are successfully logged in");
			out.print("<h1>Welcome " + name + "</h1>");

			// Creating cookie currently logged in user
			Cookie c = new Cookie("name", name);
			resp.addCookie(c);
		} else {
			out.print("you entered incorrectly username or password");
			req.getRequestDispatcher("login.html").include(req, resp);
		}
		out.close();
	}

}
