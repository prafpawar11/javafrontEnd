package ServletData;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class LoginPage extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
   

	protected void doGet(HttpServletRequest request, HttpServletResponse response) {

		System.out.println("Started");
		response.setContentType("text/html");
		String a=request.getParameter("uname");
		
		PrintWriter out;
		try {
			out = response.getWriter();
			out.print(a);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}

	

}
