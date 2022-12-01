import java.util.*;

class L{
	public static void main(String[] args){
		//Case 1:
		//ArrayList<Number> x = new ArrayList<Integer>();
		
		//Case 2:
		/*
		Animal[] x = new Animal[3];
		x[0] = new Cat();
		x[1] = new Dog();
		x[2] = new Animal();
		System.out.println(x[0]+" ~ "+x[1]+" ~ "+x[2]);
		*/		

		//Case 3:
		
		ArrayList<Animal> x = new ArrayList<Animal>();
		x.add(new Cat());
		x.add(new Dog());
		x.add(new Animal());
		System.out.println(x);
		
	}
}

class Animal{ }
class Cat extends Animal{ }
class Dog extends Animal{ }