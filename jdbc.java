package expt4;
import java.sql.*;

public class jdbc {
	static final String user = "root" ;
	static final String pass = "sumitbashetwar" ;
	static final String url = "jdbc:mysql://localhost:3306/minipro" ;//jdbc:mysql://localhost:3306/

	public static void main(String[] args) {
		try(Connection con = DriverManager.getConnection(url , user , pass);
				Statement stmt = con.createStatement() ;
				){
			System.out.println("Inserting records in Table........");
			String sql = "insert into company values('Cipchdtffshfedcyfgd','Nanded',1234);" ;
			stmt.executeUpdate(sql) ;
			String Query = "select * from company ;" ;
			Statement st = con.createStatement() ;
			ResultSet rs = st.executeQuery(Query) ;
			
			while(rs.next()) {
				String name = rs.getString("name") ;
				String address = rs.getString("address") ;
				long phone = rs.getLong("phone");//it is column names
				
				System.out.println(name+"	    "+address+"	   	  "+phone+" ") ;
			}
				
			
			st.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
