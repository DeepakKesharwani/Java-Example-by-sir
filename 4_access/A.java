class Student{
	public static void main(String[] args){
		Pen p = new Pen();

		p.write(); //Access Through Instantation
	}
}

class Pen{
	void write(){
		System.out.println("~~~~~~");
	}
}