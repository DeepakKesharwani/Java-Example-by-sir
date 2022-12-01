import java.io.Serializable;

class W implements Serializable {
	float g = 21.56f;

	transient Student s = new Student("Harshit",34);
	transient int y =23;
}