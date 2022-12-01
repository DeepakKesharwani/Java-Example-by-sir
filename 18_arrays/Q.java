class Q
{
	public static void main(String[]args){
		Animal x=new BDog();
		Animal y=new Cat();
		Animal z=new Dog();
		Object o=new BDog();
		Object k=new Dog();
		Dog t=new BDog();
		Animal[] arr= {new Animal(),x,y,z,t};
		for(Animal a:arr){
			System.out.println(a);
		}
	}
}
	    class Animal{}
		class Cat extends Animal{}
		class Dog extends Animal{}
		class BDog extends Dog{}
		