import java.util.regex.*; 

class F
{		
	public static void main(String[] args){
		//Case 1:
		/*
		Pattern p = Pattern.compile("mohan");
		Matcher m = p.matcher("mohan is a good boy and mohan likes to eat banana");		
		System.out.println(m.find()+" - "+m.group());
		System.out.println(m.find()+" - "+m.group());
		System.out.println(m.find()+" - "+m.group());
		*/

		//Case 2:
		/*
		Pattern p = Pattern.compile("mohan");
		//Matcher m = p.matcher("mohan is a good boy and mohan likes to eat banana");		
		Matcher m = p.matcher("mohan");		
		System.out.println(m.matches()+" - "+m.group());
		System.out.println(m.matches()+" - "+m.group());
		System.out.println(m.matches()+" - "+m.group());
		System.out.println(m.matches()+" - "+m.group());
		*/

		//Case 3:
		
		Pattern p = Pattern.compile("mohan");
		Matcher m = p.matcher("mohani is a good boy and mohan likes to eat banana");				
		System.out.println(m.lookingAt()+" - "+m.group());
		System.out.println(m.lookingAt()+" - "+m.group());
		System.out.println(m.lookingAt()+" - "+m.group());
		System.out.println(m.lookingAt()+" - "+m.group());
		
	}
}

