package practice;
import java.sql.*;

public class Yash {
	static void printthis(ResultSet rs) throws SQLException
	{
		do
	      {
	    	  rs.next();
	    	  String roll=rs.getString("roll");
		      String name=rs.getString("name");
		      String marks=rs.getString("Marks");
		      String grade=rs.getString("Grade");
		      System.out.println(roll+"\t"+name+"\t"+marks+"\t"+grade);
	      }while(!rs.isLast());
	}
	
	public static void main(String[] args) throws ClassNotFoundException {
		 Connection con = null;

		    String url = "jdbc:mysql://localhost:3306/test";
		    String username = "root";
		    String password = "root";
		    String query= "select * from java where roll<=3";
		    try {
		      Class.forName("com.mysql.cj.jdbc.Driver");
		      con = DriverManager.getConnection(url, username, password);

		      System.out.println("Connected!");
		      Statement st=con.createStatement();
		      //String abc="ALTER TABLE java DROP COLUMN last_name";
		      //st.execute(abc);
		      ResultSet rs= st.executeQuery(query);
		      printthis(rs);
		     
		    } catch (SQLException ex) {
		        throw new Error("Error ", ex);
		    } finally {
		      try {
		        if (con != null) {
		            con.close();
		        }
		      } catch (SQLException ex) {
		          System.out.println(ex.getMessage());
		      }
		    }

	}

}
