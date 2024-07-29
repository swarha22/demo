package Day10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test1 {
	public static void main(String[] args) {
		try {
			//load the driver class 
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("driver class loaded");
			
			// get the connection
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe" , "System","System");
			System.out.println("got the connection");
			
			//send the sql queries - create the statement
			Statement st= con.createStatement();
			
			st.addBatch("insert into student values (103, 'valli')");
			st.addBatch("update student set stname='sravani' where stid= 102");
			st.addBatch("delete from student where stid=106");
			
			int x[] = st.executeBatch();
			System.out.println(x[0] + "row(s) inserted");
			System.out.println(x[1] + "row(s) updated");
			System.out.println(x[2] + "row (s) deleted");
			
			//close the connection
			con.close();
			
			}
		catch(Exception e) {
			System.out.println(e);
		}
		
}
}
