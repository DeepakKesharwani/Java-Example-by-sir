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

	public int hashCode(){
		int sum = 0;

		String abc = " abcdefghijklmnopqrstuvwxyz";
		
		String nm = this.name;

		for(int i=0;i<nm.length();i++){
			sum = sum + abc.indexOf(nm.charAt(i));
		}

		return sum;
	}
}

class E{
	public static void main(String[] args){
		Student s1 = new Student("mohan", 12);
		Student s2 = new Student("sohan", 32);
		Student s3 = new Student("tohan", 22);

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}












