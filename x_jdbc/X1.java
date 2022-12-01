import java.sql.DriverManager;
import java.sql.Connection;
import.java.sql.PreparedStatement;
import.java.sql.ResultSet;
import.java.sql.SQLException;

class X{
	public static void main(String[] args){
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecart:user=root&password=1234");
		String query = "insert into cities(city,state_id) value ('Rewa',1)";
		PreparedStatement ps =con.preparedStatement(query);

		int Result = ps.executeUpdate();
		System.out.println(result);
		con.close();
		}catch(ClassNotFoundException|SQLException e){
			e.printStackTrace();
		}
	}
}
