package firstWebApp;

import java.io.IOException;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/loginservlet")
public class loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public loginservlet() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String phonenumber1=request.getParameter("phnno");
		String password1=request.getParameter("password");
		paymentsappDAO pd=new paymentsappDAO();
		if(pd.validateuser(phonenumber1, password1)) {
			RequestDispatcher rd=request.getRequestDispatcher("/dashboard.jsp");
			rd.forward(request, response);
			
		}
		else {
			response.getWriter().write("Invalid user");
			response.setContentType("text/html");
			RequestDispatcher rd=request.getRequestDispatcher("/login.jsp");
			rd.include(request, response);
			
			
		}

	}

	
		

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
