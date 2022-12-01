import java.util.ArrayList;

class RentalGeneric<P>{
	ArrayList<P> products = new ArrayList<P>();

	void addProduct(P product){
		products.add(product);
	}

	P getProduct(){
		return products.get(0);
	}
}

class Scooter{
	String scooterName;

	Scooter(String scooterName){
		this.scooterName = scooterName;
	}
}



class Car{
	String carName;

	Car(String carName){
		this.carName = carName;
	}
}

class X{
	public static void main(String[] args){
		RentalGeneric<Car> cr = new RentalGeneric<Car>();
		cr.addProduct(new Car("Maruti"));
		cr.addProduct(new Car("Scoda"));
		cr.addProduct(new Car("BMW"));
		cr.addProduct(new Car("Audi"));
		//cr.addProduct(new Scooter("Audi"));

		RentalGeneric<Scooter> sr = new RentalGeneric<Scooter>();
		sr.addProduct(new Scooter("Bajaj"));
		sr.addProduct(new Scooter("Vespa"));
		sr.addProduct(new Scooter("TVS"));
	}
}

//######################################
/*
class ScooterRental{
	ArrayList<Scooter> scooters = new ArrayList<Scooter>();

	void addScooter(Scooter scooter){
		scooters.add(scooter);
	}

	Scooter getScooter(){
		return scooters.get(0);
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
}*/
