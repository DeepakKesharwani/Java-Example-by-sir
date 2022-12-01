class X
{
	int x;
	X(int x){
		System.out.println("class x constructor");
		this.x = x;
	}
}
class D
{
	public static void main(String[] args){
		X x = new X(12){
			{
				System.out.println("Anonmous class initialisation block");
				System.out.println("passed value :"+x);
			}
		};
	
	}
}