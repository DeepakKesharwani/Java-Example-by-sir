import java.util.*;

class V{
	public static void main(String[] args){
		ArrayList<? super Dog> s = new ArrayList<Dog>();
		ArrayList<? super Dog> t = new ArrayList<Animal>();
		ArrayList<? super Dog> u = new ArrayList<LivingBeing>();
		ArrayList<? super Dog> v = new ArrayList<Object>();
		
		//Case 4:
		/*
		v.add(new BDog());
		v.add(new Dog());
		v.add(new Animal());
		v.add(new LivingBeing());
		v.add(new Object());*/

		//Case 3:
		//u.add(new BDog());
		//u.add(new Dog());
		//u.add(new Animal());
		//u.add(new LivingBeing());
		//u.add(new Object());

		//Case 2:
		//t.add(new BDog());
		//t.add(new Dog());
		//t.add(new Animal());
		//t.add(new LivingBeing());
		//t.add(new Object());


		//Case 1:
		//s.add(new BDog());
		//s.add(new Dog());
		//s.add(new Animal());
		//s.add(new LivingBeing());
		//s.add(new Object());

	}
}

class LivingBeing{ }
class Animal extends LivingBeing{ }
class Dog extends Animal{ }
class BDog extends Dog{ }
