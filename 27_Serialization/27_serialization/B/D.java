import java.io.*;

class D{
	public static void main(String[] args){
		File file = new File("kejri.txt");

		try{
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);

			Student st = (Student)ois.readObject();

			System.out.println(st.name);
			System.out.println(st.age);
			System.out.println(st.address.city.cityName);
			System.out.println(st.address.state.stateName);
		}catch (FileNotFoundException e){
			e.printStackTrace();
		}catch (IOException e){
			e.printStackTrace();
		}catch (ClassNotFoundException e){
			e.printStackTrace();
		}
	}
}