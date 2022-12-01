class EmployeeAddress{
	EmployeeCity employeeCity;
	EmployeeState employeeState;
	String pinCode;
	
	EmployeeAddress(){
	
	}

	EmployeeAddress(EmployeeCity employeeCity,EmployeeState employeeState,String pinCode){
		this.employeeCity = employeeCity;
		this.employeeState = employeeState;
		this.pinCode = pinCode;
	}
}