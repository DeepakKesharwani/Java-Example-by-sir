import java.util.ArrayList;

class ScooterRental{
	ArrayList<Scooter> scooters = new ArrayList<Scooter>();

	void addScooter(Scooter scooter){
		scooters.add(scooter);
	}

	Scooter getScooter(){
		return scooters.get(0);
	}
}

class Scooter{
	String scooterName;

	Scooter(String scooterName){
		this.scooterName = scooterName;
	}
}


class CarRental{
	ArrayList<Car> cars = new ArrayList<Car>();

	void addCar(Car car){
		cars.add(car);
	}

	Car getCar(){
		return cars.get(0);
	}
}

class Car{
	String carName;

	Car(String carName){
		this.carName = carName;
	}
}

class W{
	public static void main(String[] args){
		CarRental cr = new CarRental();
		cr.addCar(new Car("Maruti"));
		cr.addCar(new Car("Scoda"));
		cr.addCar(new Car("BMW"));
		cr.addCar(new Car("Audi"));

		ScooterRental sr = new ScooterRental();
		sr.addScooter(new Scooter("Bajaj"));
		sr.addScooter(new Scooter("Vespa"));
		sr.addScooter(new Scooter("TVS"));
	}
}