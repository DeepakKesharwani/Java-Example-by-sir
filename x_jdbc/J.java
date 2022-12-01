import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.lang.ClassNotFoundException;
import java.util.Scanner;


class J
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = sc.nextLine();
		System.out.println("Enter your email");
		String email = sc.next();
		System.out.println("Enter your password");
		String password = sc.next();
		System.out.println("Enter your contact");
		String contact = sc.next();
		System.out.println("Enter your Address");
		String address = sc.next();
		System.out.println("Enter your Local Address");
		String local_address = sc.nextLine();
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mra_hostel?user=root&password=1234");
			String query = "insert into students(student_name,email_id,password,contact,address,local_address) values ('"+name+"','"+email+"','"+password+"','"+contact+"','"+address+"','"+local_address+"')";
			PreparedStatement ps  = con.prepareStatement(query);
			int result = ps.executeUpdate();
			if(result==1){
				System.out.println("Updated Successfully");
			}else{
				System.out.println("failed!.. Try Again");
			}
			con.close();
		}catch(ClassNotFoundException | SQLException e){
			e.printStackTrace();
		}
	}
}