package Day10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc {
			public static void main(String[] args)  {
					
				try {
				
					Class.forName("oracle.jdbc.driver.OracleDriver");
					System.out.println("driver class loaded");
					
				
					Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","System");
						
					System.out.println("got the connection");
					
					// send the sql queries - create the statement object
					
					Statement st  = con.createStatement();
				//create the query and process it 
					
							int x = st.executeUpdate("insert into student values(97,'Sarika')"); //static input
							System.out.println(x + "row(s) inserted");
							
							
							//close the connection 
							
							con.close();
				} catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					System.out.println(e);
				}
				
			}
}
