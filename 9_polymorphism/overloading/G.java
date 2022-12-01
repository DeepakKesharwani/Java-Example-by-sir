class G{
	static void go(Car r){
		System.out.println("Car");
	}

	static void go(SportsCar r){
		System.out.println("SportsCar");
	}

	public static void main(String[] args){
		//Case 3:
		Car x = new SportsCar();
		go(x);

		//Case 2:
		//SportsCar x = new SportsCar();
		//go(x);

		//Case 1:
		//Car x = new Car();
		//go(x);
	}
}

class Car{ }

class SportsCar extends Car{ }
