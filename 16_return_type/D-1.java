class D{
	Dog abc(){
		//Case 2:
		Animal a = new Dog();
		return (Dog)a;
		
		//Case 1:
		//Dog d = new Dog();
		//return d;
	}
}

class Animal{ }
class Dog extends Animal{ }