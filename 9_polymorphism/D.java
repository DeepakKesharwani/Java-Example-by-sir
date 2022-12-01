class Animal{
	void makeSound(){
		System.out.println("Animal Sound");
	}
}

class Cat extends Animal{
	void makeSound(){
		System.out.println("Cat Sound");
	}
}

class Dog extends Animal{
	void makeSound(){
		System.out.println("Dog Sound");
	}
}

class Cow extends Animal{
	void makeSound(){
		System.out.println("Cow Sound");
	}
}

class D{
	public static void main(String[] args){
		Cat x = new Cat();
		playSound(x);
		
		Cow y = new Cow();
		playSound(y);

		Dog z = new Dog();
		playSound(z);
		
	}
	
	static void playSound(Animal x){
		x.makeSound();
	}
	
	
	/*static void playSound(Dog x){
		x.makeSound();
	}
	
	static void playSound(Cow x){
		x.makeSound();
	}
	
	static void playSound(Cat x){
		x.makeSound();
	}*/
}