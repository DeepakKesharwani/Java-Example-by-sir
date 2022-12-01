import java.util.*;

class U{
	public static void main(String[] args){
		ArrayList<? super Dog> s = new ArrayList<Dog>();
		ArrayList<? super Dog> t = new ArrayList<Animal>();
		ArrayList<? super Dog> u = new ArrayList<LivingBeing>();
		ArrayList<? super Dog> v = new ArrayList<Object>();
		//ArrayList<? super Dog> w = new ArrayList<BDog>();
	}
}

class LivingBeing{ }
class Animal extends LivingBeing{ }
class Dog extends Animal{ }
class BDog extends Dog{ }
