import java.io.Serializable;

class Student implements Serializable{
	String name;
	int age;
	transient Address address;
	transient boolean flag;
}