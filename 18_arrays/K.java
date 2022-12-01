class K{
	public static void main(String[] args){
		//Student 2:
		City ct1 = new City();
		ct1.cityName = "Bhopal";
		
		State st1 = new State();
		st1.stateName = "MP";

		Address addr1 = new Address();
		addr1.city = ct1;
		addr1.state = st1;

		Student x1 = new Student();
		x1.name = "ganesh";
		x1.age = 14;
		x1.address = addr1;
		
		//Student 1:
		City ct = new City();
		ct.cityName = "Jabalpur";

		State st = new State();
		st.stateName = "MP";

		Address addr = new Address();
		addr.city = ct;
		addr.state = st;

		Student x = new Student();
		x.name = "mohan";
		x.age = 12;
		x.address = addr;

		Student[] z = new Student[2];
		z[0] = x;
		z[1] = x1;

		System.out.println(z[0].address.city.cityName);
		System.out.println(z[1].address.city.cityName);
	}
}

class Address{
	City city;
	State state;
}

class State{
	String stateName;
}

class City{
	String cityName;
}

class Student{
	String name;
	int age;
	Address address;
}