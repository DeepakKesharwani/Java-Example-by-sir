import java.util.*;

class Student implements Comparable<Student>{
	String name;
	Integer age;

	Student(String name, Integer age){
		this.name = name;
		this.age = age;
	}

	public int compareTo(Student s){
		return this.age.compareTo(s.age);
	}

	public String toString(){
		return name+" $ "+age;
	}
}


class D1{
	public static void main(String[] args){
		Student[] arr = {new Student("videsh",19),
						 new Student("ganesh",14),
						 new Student("sarvesh",7),
						 new Student("mukesh",15),
						 new Student("suresh",5)
			            };

		Arrays.sort(arr);

		for(Student tmp : arr){
			System.out.println(tmp);
		}
	}
}










