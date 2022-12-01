class I extends Thread
{
	public static void main(String[] args){
		I t=new I();
		System.out.println(I.currentThread().isAlive());
	}
}