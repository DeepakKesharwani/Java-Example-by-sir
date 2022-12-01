import java.util.HashSet;

class Student
{
	String name;
	int age;

	Student(String name,int age){
		 this.name = name;
		 this.age = age;
	}

	public String toString(){
		return name+"~"+age;
	}

	public boolean equals(Object o){
		boolean flag = false;

		Student x1 = this;
		Student x2 = (Student)o;

		String nm1 = x1.name;
		String nm2 = x2.name;

		if(nm1.equals(nm2)){
			flag = true;
		}	
		System.out.println("Equals:!!!!!!!!");
		return flag;
		
	}

	public int hashCode(){
		int sum = 0;

		String abc = " abcdefghijklmnopqrstuvwxyz";
		
		String nm = this.name;

		for(int i=0;i<nm.length();i++){
			sum = sum + abc.indexOf(nm.charAt(i));
		}
		System.out.println("hash Code");
		return sum;
	}
}
class F
{
	public static void main(String[] args){
		HashSet set= new HashSet();
			set.add(new Student("mohan",23));
			set.add(new Student("sohan",12));
			set.add(new Student("hamno",14));
			set.add(new Student("hanmo",27));
			set.add(new Student("rohan",8));
			set.add(new Student("mohan",12));
			
			System.out.println(set);
			//Student x = new Student("hanmo",27);
			Student x = new Student("mohan",12);
			System.out.println(set.contains(x));
			System.out.println(set.remove(x));
			System.out.println(set);
		
	}
}