class K1
{
	public static void main(String [] args){
		City ct1 = new City();
		ct1.cityName = "Jabalpur";
		City ct2 = new City();
		ct2.cityName = "Bangalore";

		State state1  = new State();
		state1.stateName = "Madhya Pradesh";
		State state2 = new State();
		state2.stateName = "Karnataka";

		Address addr1 = new Address();
		addr1.city = ct1;
		addr1.state = state1;

		Address addr2 = new Address();
		addr2.city = ct2;
		addr2.state = state2;

		Student st1 = new Student();
		st1.name = "Virat Kholi";
		st1.age = 30;
		st1.address= addr1;

		Student st2 =  new Student();
		st2.name = "MS Dhoni";
		st2.age = 39;
		st2.address = addr2;

		Student [] s1 = new Student[2];

		s1[0] = st1;
		s1[1] = st2;
		System.out.println(s1[0].address.city.cityName);
		System.out.println(s1[1].address.state.stateName);
	}
}

class Students
{
	String name;
	Integer age;
	Address address;

}

class Address
{
	City city;
	State state;
}

class City
{
	String cityName;
}

class State
{
	String stateName;
}