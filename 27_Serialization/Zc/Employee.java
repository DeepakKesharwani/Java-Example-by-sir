import java.io.Serializable;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.lang.ClassNotFoundException;

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

	private void writeObject(ObjectOutputStream oos) throws IOException{	
			oos.defaultWriteObject();

			oos.writeObject(employeeAddress.employeeCity.cityName);
			oos.writeObject(employeeAddress.employeeState.stateName);
			oos.writeObject(employeeAddress.pinCode);	
	}

	private void readObject(ObjectInputStream ois) throws IOException,ClassNotFoundException{
			ois.defaultReadObject();

			employeeAddress = new EmployeeAddress();
			employeeAddress.employeeCity = new EmployeeCity((String)ois.readObject());
			employeeAddress.employeeState = new EmployeeState((String)ois.readObject());
			employeeAddress.pinCode = (String)ois.readObject();
	}
}