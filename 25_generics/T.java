import java.util.*;

class T{
	public static void main(String[] args){
		ArrayList<? extends CharSequence> s = new ArrayList<CharSequence>();
		ArrayList<? extends CharSequence> t = new ArrayList<String>();
		ArrayList<? extends CharSequence> u = new ArrayList<StringBuffer>();
		ArrayList<? extends CharSequence> v = new ArrayList<StringBuilder>();
	}
}