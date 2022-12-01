class B{
	public static void main(String[] args){
		
		Animal[] anm = new Dog[3];		
		
		//Case 1:
		//anm[0] = new Dog();
		
		//Case 2:
		anm[0] = new Cat();
	}
}

class Animal{ }
class Cat extends Animal{ }
class Dog extends Animal{ }