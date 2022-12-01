class S{
	public static void main(String[] args){
		Animal[] x = new Dog[3];

		Dog z = new Dog();
		Animal w = new BDog();

		Animal e = new Cat();

		x[0] = z;
		x[1] = w;
		x[2] = e;//NOT OK ArrayStoreException

		for(Animal a : x){
			System.out.println(a);
		}
	}
}