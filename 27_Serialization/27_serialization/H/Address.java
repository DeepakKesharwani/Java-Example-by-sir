class Address{
	City city;
	State state;
	int pinCode;

	Address(){
		
	}

	Address(City city,State state,int pinCode){
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
	}
}