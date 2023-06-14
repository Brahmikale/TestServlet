package ServletPackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.jar.Attributes.Name;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Dummy")
public class NewDummy extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String Testname = req.getParameter("name");
		PrintWriter writer = resp.getWriter();
		writer.print("Hello "+Testname);
	}
}
