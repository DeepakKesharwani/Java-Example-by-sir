class E{
	public static void main(String[] args){
		//Machine x = process();

		Car x = process();
		System.out.println(x);
	}

	static Machine process(){
		//Case 2:
		Machine m = new Car();
		return m;

		//Case 1:
		//Car c = new Car();
		//return c;
	}
}

interface Machine{ }
class Car implements Machine{ }