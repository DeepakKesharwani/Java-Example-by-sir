import java.sql.*; 
import java.util.*; 
class I
{ 
	public static void main(String a[]) 
	{ 
		//Creating the connection 
		String url = "jdbc:mysql://localhost:3306/vimal?user=root&password=1234";  

		//Entering the data 
		Scanner k = new Scanner(System.in); 
		System.out.println("enter name"); 
		String name = k.next(); 
		System.out.println("enter roll no"); 
		int roll = k.nextInt(); 
		System.out.println("enter class"); 
		String cls = k.next(); 

		//Inserting data using SQL query 
		String sql = "insert into student values('"+name+"',"+roll+",'"+cls+"')"; 
		Connection con=null; 
		try
		{ 
			//DriverManager.registerDriver(new oracle.jdbc.OracleDriver()); 
			Class.forName("com.mysql.jdbc.Driver");
			//Reference to connection interface 
			con = DriverManager.getConnection(url); 

			Statement st = con.createStatement(); 
			int m = st.executeUpdate(sql); 
			if (m == 1) 
				System.out.println("inserted successfully : "+sql); 
			else
				System.out.println("insertion failed"); 
			con.close(); 
		} 
		catch(Exception ex) 
		{ 
			System.err.println(ex); 
		} 
	} 
} 
