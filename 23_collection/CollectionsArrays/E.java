import java.util.*;

class E{
	//public static void main(String[] args){
		/*Float[] x = {22.34f,12.3f,45.33f,2.43f};

		List<Float> list = Arrays.asList(x);

		//System.out.println(list);
		for(Float y : list){
			System.out.println(y);
		}

		//list.add(23f);
		//list.set(1,34.22f);
		x[2] = 44.44f;

		System.out.println("################3");
		for(Float y : list){
			System.out.println(y+" $");
		}*/
public static int fun(int a ,int b){
		if(a>1|| b>1){
			return fun(0,0)+fun(0,1)+fun(a-1,a-1);
		}
		else{
			a= a+2-b;
		}

		return a+2-b;
}
		public static void main(String [] args){
			System.out.println(fun(3,3));
		}
	}









