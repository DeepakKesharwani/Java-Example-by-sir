import java.util.regex.*; 

class D
{		
	public static void main(String[] args){
		//Case 1:
		/*
		Pattern p = Pattern.compile("mohan");
		Matcher m = p.matcher("mohan is a good boy and mohan likes to eat banana");		
		System.out.println(m.find()+" - "+m);
		System.out.println(m.find()+" - "+m);
		System.out.println(m.find()+" - "+m);
		*/

		//Case 2:
		/*
		Pattern p = Pattern.compile("mohan");
		//Matcher m = p.matcher("mohan is a good boy and mohan likes to eat banana");		
		Matcher m = p.matcher("mohan");		
		System.out.println(m.matches()+" - "+m);
		System.out.println(m.matches()+" - "+m);
		System.out.println(m.matches()+" - "+m);
		System.out.println(m.matches()+" - "+m);
		*/

		//Case 3:
		
		Pattern p = Pattern.compile("mohan");
		Matcher m = p.matcher("mohan is a good boy and mohan likes to eat banana");				
		System.out.println(m.lookingAt()+" - "+m);
		System.out.println(m.lookingAt()+" - "+m);
		System.out.println(m.lookingAt()+" - "+m);
		System.out.println(m.lookingAt()+" - "+m);
		
	}
}

