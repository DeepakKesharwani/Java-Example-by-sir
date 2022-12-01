class C{
	public static void main(String[] args){
		System.out.println("~~~~~~~ 1");
		
		Animal a = new Dog();
		//Dog d = (Dog)a;
		Cat c = (Cat)a;

		System.out.println("~~~~~~~ 2");
	}
}

class Animal{ }

class Dog extends Animal{ }

class Cat extends Animal{ }