package servlets.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LogoutServlet extends HttpServlet {
 
	private static final long serialVersionUID = -8379047079247077333L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");

		req.getRequestDispatcher("link.html").include(req, resp);

		// Clear cookie data when you logout
		Cookie cookie = new Cookie("name", "");
		cookie.setMaxAge(0);
		resp.addCookie(cookie);

		out.print("you are successfully logged out!");

	}

}
