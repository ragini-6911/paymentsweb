package firstWebApp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/addbankacc")
public class addbankacc extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public addbankacc() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	
		    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		        
		        String BankAcctNo = request.getParameter("BankAcctNo");
		        String BankName = request.getParameter("BankName");
		        String AcctTypeId = request.getParameter("AcctTypeId");
		        String BankIFSCCode = request.getParameter("BankIFSCCode");
		        String BankAcctPin = request.getParameter("BankAcctPin");
		        String UserId = request.getParameter("UserId");
		        String CurrBankAcctBalance = request.getParameter("CurrBankAcctBalance");

		        try {
		            
		            Class.forName("com.mysql.cj.jdbc.Driver");
		            
		            Connection  con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/userbankacc","root","Ragini@2001");
		            

	            String sql = "INSERT INTO BankAccounts (BankAcctNo, BankName, AcctTypeId,BankIFSCCode,BankAcctPin,UserId,CurrBankAcctBalance) VALUES (?, ?, ?,?,?,?,?)";
		          PreparedStatement  stmt = con.prepareStatement(sql);
		            stmt.setString(1, BankAcctNo);
		            stmt.setString(2, BankName);
		            stmt.setString(3, AcctTypeId);
		            stmt.setString(4, BankIFSCCode);
		            stmt.setString(5, BankAcctPin);

		            stmt.setString(6, UserId);
		            stmt.setString(7, CurrBankAcctBalance);
		           
		            int i= stmt.executeUpdate();
		            if(i>0) {
		            	System.out.println("insertion done");
		            }
		            else {
		            	System.out.println("not done");
		            }
		            response.setContentType("text/html");

		           
		          

		            RequestDispatcher rd = request.getRequestDispatcher("/seeaccount.jsp");
		            rd.include(request, response);
		            response.getWriter().write("<h1>You have Successfully added your bank account</h1>");

		        } catch (Exception e) {
		            e.printStackTrace();
		            
	}

}
}
