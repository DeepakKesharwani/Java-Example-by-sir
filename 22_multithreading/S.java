class MyRunnable implements Runnable
{
	public void run(){
		String thName = Thread.currentThread().getName();
		try{
			if(thName.equals("mohan")){
				System.out.println(thName);
				S.t2.join();
			}else{
				System.out.println(thName);
				S.t1.join();
			}
		
		}catch(InterruptedException e){
			e.printStackTrace();
		
		}
		for(int i=0;i<20;i++){
			System.out.println(i+" - "+thName);
		}
	
	}
}
class S
{
	static Thread t1,t2;
	public static void main(String[] args) throws InterruptedException{
		MyRunnable r = new MyRunnable();
		t1 = new Thread(r,"mohan");
		t2 = new Thread(r,"sohan");

		t1.start();
		t2.start();

	}
}