import java.util.regex.*; 

class E
{		
	public static void main(String[] args){
		//Case 1:
		/*
		Pattern p = Pattern.compile("mohan");
		Matcher m = p.matcher("mohan is a good boy and mohan likes to eat banana");		
		System.out.println(m.find()+" - "+m.start()+" - "+m.end());
		System.out.println(m.find()+" - "+m.start()+" - "+m.end());
		System.out.println(m.find()+" - "+m.start()+" - "+m.end());
		

		//Case 2:
		/*
		Pattern p = Pattern.compile("mohan");
		//Matcher m = p.matcher("mohan is a good boy and mohan likes to eat banana");		
		Matcher m = p.matcher("mohan");		
		System.out.println(m.matches()+" - "+m.start()+" - "+m.end());
		System.out.println(m.matches()+" - "+m.start()+" - "+m.end());
		System.out.println(m.matches()+" - "+m.start()+" - "+m.end());
		System.out.println(m.matches()+" - "+m.start()+" - "+m.end());
		*/

		//Case 3:
		
		Pattern p = Pattern.compile("mohan");
		Matcher m = p.matcher("mohan is a good boy and mohan likes to eat banana");
		//Matcher m = p.matcher("mohan is a good boy and mohan likes to eat banana");
		System.out.println(m.lookingAt()+" - "+m.start()+" - "+m.end());
		System.out.println(m.lookingAt()+" - "+m.start()+" - "+m.end());
		System.out.println(m.lookingAt()+" - "+m.start()+" - "+m.end());
		System.out.println(m.lookingAt()+" - "+m.start()+" - "+m.end());
		
	}
}

