import java.util.HashSet;

class Student{
	String name;
	int age;

	Student(String name, int age){
		this.name = name;
		this.age = age;
	}

	public String toString(){
		return name+" ~ "+age;
	}

	public boolean equals(Object o){
		boolean flag = false;

		if(o instanceof Student){
			Student x1 = this;
			Student x2 = (Student)o;

			String nm1 = x1.name;
			String nm2 = x2.name;

			System.out.println(nm1+" ~ "+nm2+" ~ "+"EQUALS");

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

		System.out.println(nm+" INSIDE HASHCODE");

		for(int i=0;i<nm.length();i++){
			sum = sum + abc.indexOf(nm.charAt(i));
		}

		return sum;
	}
}

class C{
	public static void main(String[] args){
		HashSet set = new HashSet();

		set.add(new Student("mohan",23));
		set.add(new Student("sohan",12));
		set.add(new Student("hanmo",14));
		set.add(new Student("gohan",27));
		set.add(new Student("hamno",8));
		set.add(new Student("mohan",12));

		System.out.println(set);

		System.out.println("###################");

		Student x = new Student("mohan", 14);
		
		System.out.println(set.contains(x));
		System.out.println(set.remove(x));
		System.out.println(set);
	}
}














