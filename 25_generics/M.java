import java.util.*;

class M{
	public static void main(String[] args){
		playSound(new Cat());
		playSound(new Dog());
		playSound(new Animal());
	}

	static void playSound(Animal animal){
		animal.makeSound();
	}
}

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