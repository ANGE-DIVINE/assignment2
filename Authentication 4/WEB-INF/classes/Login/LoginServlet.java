package Login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	
	String correct_username = "divine";
	String correct_password = "divine";
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		String user = req.getParameter("username");
		String password = req.getParameter("password");
		
		if (user.equalsIgnoreCase(correct_username) && password.equals(correct_password)) {
			res.getWriter().write("Welcome " + user);
		} else {
			res.sendRedirect("forgot.html");
		}
	}
}


