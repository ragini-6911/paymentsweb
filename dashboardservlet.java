package firstWebApp;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/dashboardservlet")
public class dashboardservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public dashboardservlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
				 
				 Connection  con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/userbankacc","root","Ragini@2001");
				 Statement stmt = con.createStatement();
				String query = "select * from BankAccounts";
				 List<bankaccounts> bankAccounts = new ArrayList<>();
				ResultSet rs=stmt.executeQuery(query);
				while(rs.next())
				{
					
					 bankaccounts BA = new bankaccounts();
		                BA.setBankAcctNo(rs.getString("bankAcctNo"));
		             BA.setBankName(rs.getString("bankName"));
		             BA.setAcctTypeId(rs.getString("acctTypeId"));
		             BA.setBankIFSCCode(rs.getString("bankIFSCCode"));
		             BA.setBankAcctPin(rs.getString("bankAcctPin"));
		             BA.setUserId(rs.getString("userId"));
		             BA.setCurrBankAcctBalance(rs.getString("currBankAcctBalance"));
		                
		                BA.add(bankAccounts);}
					
				
				//System.out.println(query);
		
				con.close();
				 

		      
		            request.setAttribute("BA", bankAccounts);

		           
		            RequestDispatcher dispatcher = request.getRequestDispatcher("/addaccsuccess.jsp");
		            dispatcher.forward(request, response);
		        } catch (Exception e) {
		            e.printStackTrace();
		            // Handle database errors
		        }
		

			
	}
		
	}


