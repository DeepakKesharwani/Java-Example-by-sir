class Student
{
	private String name;
	private int age;
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
	return name;

	}
	public void setAge(int age){
	this.age=age;

	}
	public int getAge(){
	return age;
	}
	
}
class H
{
	public static void main(String... args){
		Student s1 = new Student();
		//s1.name = "mohan"; 
		//s1.age = 12;
		s1.setName("r@ghav");
		s1.setAge(230);
		//System.out.println(s1.name);
		//System.out.println(s1.getName());
		//System.out.println(s1);
		System.out.println(s1.toString());
	}
}