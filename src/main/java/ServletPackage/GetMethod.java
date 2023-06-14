package ServletPackage;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/GetDetails")
public class GetMethod extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String Testname = req.getParameter("name");
		System.out.println(Testname);
		String tempString = req.getParameter("mobilenumber");
		System.out.println(tempString);
		String string = req.getParameter("mobilenumber");
		System.out.println(string);
		PrintWriter writer = resp.getWriter();
		writer.print(string);
		
	}
	

}
