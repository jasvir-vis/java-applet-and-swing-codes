import java.sql.*;

public class conndatabase{
    public static void main(String arg[]){
    	Connection con=null;
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", ""); // change mydb(database name) according to your database
		Statement s;
		s=con.createStatement();
		ResultSet rs;
		rs=s.executeQuery("Select * from students"); // students table name as your
		int id;
		String name;
		while(rs.next()){
			id=rs.getInt("Id"); 
			name=rs.getString("Name");
			System.out.println("Id:"+id);
			System.out.println("Name:"+name);
		}
		con.close();
		rs.close();

	}
	catch(Exception e){
		System.out.println(e);
	}
    }
}
