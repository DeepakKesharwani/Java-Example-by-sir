import java.util.Scanner;
class D 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner("er,34,#$,67,true");
		Scanner sc2 = sc.useDelimiter(",");
		
		System.out.println(sc2==sc);

		/*
		while(sc2.hasNext()){
			System.out.println(sc2.next());
		}*/		
	}
}
