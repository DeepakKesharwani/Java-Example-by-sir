import java.sql.DriverManager;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.lang.ClassNotFoundException;
class A{
	public static void main(String[] args){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			//Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecart?user=root&password=krishna");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecart?user=root&password=1234");
			String query = "select city_id,city,state from cities as c inner join states as s where c.state_id=s.state_id";

			PreparedStatement ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				System.out.print(rs.getInt(1)+" ");
				System.out.print(rs.getString(2)+" ");
				System.out.print(rs.getString(3));
				System.out.println();
			}

		
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
}
