class Car
{
}
class SportsCar extends Car
{
}
class ACar extends SportsCar
{
}

class I
{
	void pro(SportsCar scr){
		System.out.println("pro(SportsCar)");
	}

	void pro(Car cr){
		System.out.println("pro(Car) ");
	}
	public static void main(String[] args){
		I s = new I();
		Car c = new SportsCar();
		s.pro(c);
	}
}