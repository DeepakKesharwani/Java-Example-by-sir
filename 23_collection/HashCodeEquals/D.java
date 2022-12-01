class Student{
	String name;
	int age;

	Student(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String toString(){
		return name+" - "+age;
	}

	
	public boolean equals(Object o){
		boolean flag = false;

		if(o instanceof Student){
			Student x1 = this;				
			Student x2 = (Student)o;

			String nm1 = x1.name;
			String nm2 = x2.name;

			if(nm1.equals(nm2)){
				flag = true;
			}
		}

		return flag;
	}
}

class D{
	public static void main(String[] args){
		Student s1 = new Student("mohan", 12);
		Student s2 = new Student("mohan", 12);
		Student s3 = new Student("mohan", 12);

		D z = new D();
		
		//System.out.println(s1==s2);
		//System.out.println(s1.equals(s2));
		//System.out.println(s1.equals(z));
	
		//Case 1: reflexive
		//System.out.println(s1.equals(s1));
		//System.out.println(s2.equals(s2));

		//Case 2: symmetric
		//System.out.println(s1.equals(s2));
		//System.out.println(s2.equals(s1));

		//Case 3: transitive
		//System.out.println(s1.equals(s2));
		//System.out.println(s2.equals(s3));
		//System.out.println(s1.equals(s3));

		//Case 4: consistent
		//System.out.println(s2.equals(s3));
		//System.out.println(s2.equals(s3));
		//System.out.println(s2.equals(s3));

		//Case 5: null test
		System.out.println(s1.equals(null));
		System.out.println(s2.equals(null));
		System.out.println(s3.equals(null));
	}
}



    /*It is reflexive: for any non-null reference value x, x.equals(x)
	should return true.
    
	It is symmetric: for any non-null reference values x and y, x.equals(y) 
	should return true if and only if y.equals(x) returns true.
    
	It is transitive: for any non-null reference values x, y, and z,
	if x.equals(y) returns true and y.equals(z) returns true, 
	then x.equals(z) should return true.
    
	It is consistent: for any non-null reference values x and y,
	multiple invocations of x.equals(y) consistently return true or 
	consistently return false, provided no information used in equals
	comparisons on the objects is modified.
    
	For any non-null reference value x, x.equals(null) should return false. */









