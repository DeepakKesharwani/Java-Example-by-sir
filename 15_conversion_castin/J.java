class J{
	public static void main(String[] args){
		System.out.println("~~~~~~~~~");
		Animal a = new Cat();
		System.out.println("#######");
		//a.xyz();
		Dog c = (Dog)a;
		System.out.println("^^^^^^");
		c.xyz();
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