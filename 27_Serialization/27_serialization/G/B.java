import java.io.*;

class B{
	public static void main(String[] args){
		try{
			FileInputStream fis = new FileInputStream("mamta.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);

			Student st = (Student)ois.readObject();

			System.out.println(st.name);
			System.out.println(st.age);
			System.out.println(st.address);
			System.out.println(st.address.cityName);
			System.out.println(st.address.stateName);
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
}