import java.io.Serializable;

class Q implements Serializable{
	float g;

	transient Student student = new Student("mohan",12);
	transient int y = 45;
}