package firstWebApp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/registrationservlet")
public class registrationservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public registrationservlet() {
        super();
       
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String phnno=request.getParameter("phnno");
		String address=request.getParameter("address");
	String firstname=request.getParameter("firstname");
	String lastname=request.getParameter("lastname");
	String dateofbirth=request.getParameter("dob");
	String password=request.getParameter("password");

	user u1=new user();
	u1.setFirstname(firstname);
	u1.setLastname(lastname);
	u1.setPhnno(phnno);
	u1.setAddress(address);
	u1.setDob(dateofbirth);
	u1.setPassword(password);
	paymentsappDAO pd=new paymentsappDAO();
	pd.insert(u1);
	RequestDispatcher rd= request.getRequestDispatcher("/login.jsp");
	rd.forward(request, response);
}

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	// TODO Auto-generated method stub
	doGet(request, response);
}

}



