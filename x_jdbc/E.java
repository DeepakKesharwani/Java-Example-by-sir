import java.sql.*;
import java.io.Console;

class E{
	public static void main(String[] args){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecart?user=root&password=1234");
			

			Console c = System.console();
			String cityName = c.readLine();
			String stateId = c.readLine();

			String query = "insert into cities (city,state_id) value (?,?)";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1,cityName+"~");
			ps.setInt(2,Integer.parseInt(stateId));

			int result = ps.executeUpdate();
			
			System.out.println(result);


			con.close();
		}catch(ClassNotFoundException|SQLException e){
			e.printStackTrace();
		}
	}
}