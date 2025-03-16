import java.sql.*;

public class Crudbase{
    public static void main(String arg[]){
    	Connection con=null;
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "");
		Statement s;
		s=con.createStatement();
		
		// s.executeUpdate("Insert into students(Id,Name) values(105,'Hitesh')");
		// System.out.println("record is inserted");
		
		// s.executeUpdate("Update students set Name='Sanjiv' where Id=104");
		// System.out.println("record is updated");
		
		// s.executeUpdate("Delete from students where Id=104");
		// System.out.println("record is deleted with id 104");
		
		// search data with name where a exit in name
		s.executeQuery("Select * from students where Name LIKE '%a%'");
		System.out.println("record found");
		
		con.close();
		s.close();

	}
	catch(Exception e){
		System.out.println(e);
	}
    }
}