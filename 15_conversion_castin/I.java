class I{
	public static void main(String[] args){
		Animal a = new Cat();
		//a.abc();
		Cat c = (Cat)a;
		c.abc();
	}
}

class Animal{ 

}
class Cat extends Animal{ 
	void abc(){
		System.out.println("Cat method abc");
	}
}

class Dog extends Animal{
	void xyz(){
		System.out.println("Dog method xyz");
	}
}