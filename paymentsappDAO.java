package firstWebApp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import com.mysql.*;

public class paymentsappDAO {
	 
	public  void insert(user u1) {
	
		try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
				 
			 Connection con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/registration","root","Ragini@2001");
				Statement stmt = con.createStatement();
				String query = "insert into udetails(firstname,lastname,phnno,address,dob,userpassword)values('"+u1.getFirstname()+"','"+u1.getLastname()+"','"+u1.getPhnno()+"','"+u1.getAddress()+"','"+u1.getDob()+"','"+u1.getPassword()+"')";
				
				stmt.executeUpdate(query);
				System.out.println(query);
				con.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
	}
	public boolean validateuser(String phonenumber1,String password1)
	{
		try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
				 
				 Connection  con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/registration","root","Ragini@2001");
				 Statement stmt = con.createStatement();
				String query = "select phnno,userpassword from udetails";
				ResultSet rs=stmt.executeQuery(query);
				while(rs.next())
				{
					if(rs.getString("phnno").equals(phonenumber1)&& rs.getString("userpassword").equals(password1))
					{
						return true;
					}
					
				}
				//System.out.println(query);
		
				con.close();
		}
				catch(Exception e)
				{
					e.printStackTrace();
				}
		return false;
			
	}
}