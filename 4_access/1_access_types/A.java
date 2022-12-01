class Student{
	public static void main(String[] args){
		Pen p = new Pen();

		p.write(); //Access Through Instantiation
	}
}

class Pen{
	void write(){
		System.out.println("~~~~~~");
	}
}