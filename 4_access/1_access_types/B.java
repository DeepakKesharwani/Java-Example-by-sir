class Student extends Pen{
	public static void main(String[] args){
		Student s = new Student();

		s.write(); //Access Through Inheritance
	}
}

class Pen{
	void write(){
		System.out.println("########");
	}
}