import java.io.*;

class Employee implements Serializable{
	String employeeName;
	int employeeAge;
	transient EmployeeAddress employeeAddress;
	
	Employee(){
	
	}

	Employee(String employeeName,int employeeAge,EmployeeAddress employeeAddress){
		this.employeeName = employeeName;
		this.employeeAge = employeeAge;
		this.employeeAddress = employeeAddress;
	}

	private void writeObject(ObjectOutputStream oos){
		try{
			oos.defaultWriteObject();

			oos.writeObject(employeeAddress.employeeCity.cityName);
			oos.writeObject(employeeAddress.employeeState.stateName);
			oos.writeObject(employeeAddress.pinCode);
		}catch(IOException e){
			e.printStackTrace();
		}
	}

	private void readObject(ObjectInputStream ois){
		try{
			ois.defaultReadObject();

			employeeAddress = new EmployeeAddress();
			employeeAddress.employeeCity = new EmployeeCity((String)ois.readObject());
			employeeAddress.employeeState = new EmployeeState((String)ois.readObject());
			employeeAddress.pinCode = (String)ois.readObject();
		}catch(IOException e){
			e.printStackTrace();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
}