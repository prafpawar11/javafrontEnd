package ServletData;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



public class CreateAccount extends HttpServlet {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		
		String firstName=request.getParameter("fname");
		String mname=request.getParameter("mname");
		String lastname=request.getParameter("lastname");
		String DOB=request.getParameter("DOB");
		String email=request.getParameter("email");
		String mobno=request.getParameter("mobno");
		String gender=request.getParameter("gender");
		String add=request.getParameter("add");
		String country=request.getParameter("country");
		String ssn=request.getParameter("ssn");
		
		
		CreateAccountPOJO createAccount =new CreateAccountPOJO(firstName,mname,lastname,DOB,email,mobno,gender,add,country,ssn);
		
		
		CreateAccountDeo createaccountdao=new CreateAccountDeo();
		
		try {
			createaccountdao.validate(createAccount);
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		out.print("User is Created Sucessfully.");
		
		
	}

}
