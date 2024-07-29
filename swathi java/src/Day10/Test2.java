package Day10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test2 {
		public static void main(String[] args) throws Exception {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe" , "System" ,"System");
			
			//con.setAutoCommit(false);
			Statement st = con.createStatement();
			st.addBatch("update swathi set bal=bal-3000 where accno = 101");
			st.addBatch("update sarika set bal= bal+3000 where accno = 103");
			
//			int x[] = st.executeBatch();
//			if(x[0]>0 & x[1]>0) {
//				con.commit();
				System.out.println("funds transeferred successfully. Have a nice day");
//			}
//			else {
//				con.rollback();
//				System.out.println("try again");
//			}
			
		}
}
