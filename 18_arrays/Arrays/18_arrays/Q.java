class Q{
	public static void main(String[] args){
		Animal x = new BDog();
		Animal y = new Cat();
		Animal z = new Dog();
		Dog t = new BDog();
		Object o = new BDog();
		Object w = new Cat();

		Animal[] arr = {new Animal(),x,y,z,t,(Animal)o,(Cat)w};

		for(Animal a : arr){
			System.out.println(a);
		}
	}
}

class Animal{ }

class Cat extends Animal{ }

class Dog extends Animal{ }

class BDog extends Dog{ }