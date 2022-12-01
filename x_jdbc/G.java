import java.util.ArrayList;
class G
{
	public static void main(String... args){
	ArrayList a = new ArrayList();
	//System.out.println(a.size());
	a.add(23);
	a.add(90);
	a.add(45);
	a.add(42);
	a.add(40);
	a.add(32);
	System.out.println(a.size());
	System.out.println(a);
	System.out.println(a.get(1));
	System.out.println(a.remove(1));
	System.out.println(a.size());
	System.out.println(a);

	}
}