import java.sql.*;

class C{
	public static void main(String[] args){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecart?user=root&password=1234");
			
			String query = "insert into cities (city,state_id) value ('"+args[0]+"',"+args[1]+")";
			PreparedStatement ps = con.prepareStatement(query);

			int result = ps.executeUpdate();
			
			System.out.println(result);


			con.close();
		}catch(ClassNotFoundException|SQLException e){
			e.printStackTrace();
		}
	}
}