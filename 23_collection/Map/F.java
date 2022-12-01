import java.util.HashMap;

class Student{
	String name;
	Integer age;

	Student(String name, Integer age){
		this.name = name;
		this.age = age;
	}

	public String toString(){
		return name+"-"+age;
	}

	public boolean equals(Object o){
		boolean flag = false;

		if(o instanceof Student){
			Student s1 = this;
			Student s2 = (Student)o;

			String nm1 = s1.name;
			String nm2 = s2.name;

			Integer ag1 = s1.age;
			Integer ag2 = s2.age;

			if(nm1.equals(nm2)&&ag1.equals(ag2)){
				flag = true;
			}
		}

		return flag;
	}

	public int hashCode(){
		int sum = 0;

		String abc = " abcdefghijklmnopqrstuvwxyz";

		for(int i=0;i<name.length();i++){
			sum = sum + abc.indexOf(name.charAt(i));
		}

		return sum;
	}
}

class F{
	public static void main(String[] args){
		HashMap map = new HashMap();

		map.put(new Student("mohan",12), 78);
		map.put(new Student("sohan",14), 45);
		map.put(new Student("rohan",10), 89);
		map.put(new Student("gohan",13), 67);
		map.put(new Student("tohan",17), 92);
		map.put(new Student("mohan",12), 18);

		System.out.println(map);
	}
}












