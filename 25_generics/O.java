import java.util.*;
abstract class F{

}
class O extends F{
	public static void main(String[] args){
		ArrayList<? extends Number> x = new ArrayList<Integer>();
		//ArrayList<Number> x = new ArrayList<Integer>();
	}
}