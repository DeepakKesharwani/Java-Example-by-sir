import java.util.*;

class Student{
	String name;
	Integer age;

	Student(String name, Integer age){
		this.name = name;
		this.age = age;
	}

	public String toString(){
		return name+" $ "+age;
	}
}

class NameSort implements Comparator<Student>{
	public int compare(Student e1, Student e2){
		return e1.name.compareTo(e2.name);
	}
}

class NameRevSort implements Comparator<Student>{
	public int compare(Student e1, Student e2){
		return e2.name.compareTo(e1.name);
	}
}

class AgeSort implements Comparator<Student>{
	public int compare(Student e1, Student e2){
		return e1.age.compareTo(e2.age);
	}
}

class AgeRevSort implements Comparator<Student>{
	public int compare(Student e1, Student e2){
		return e2.age.compareTo(e1.age);
	}
}


class D2{
	public static void main(String[] args){
		Student[] arr = {new Student("videsh",19),
						 new Student("ganesh",14),
						 new Student("sarvesh",7),
						 new Student("mukesh",15),
						 new Student("suresh",5)
			            };

		NameRevSort nrs = new NameRevSort();
		Arrays.sort(arr,nrs);

		for(Student tmp : arr){
			System.out.println(tmp);
		}
	}
}










