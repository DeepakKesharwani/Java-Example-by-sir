class MyThread extends Thread{
	MyThread(String name){
		super(name);
	}

	public void run(){
		for(int i=0;i<5;i++){
			System.out.println(i+" - "+Thread.currentThread().getName()+" going to withdraw");
			if(A.ac.getBal()>=10){
				try{
					Thread.sleep(120);
				}catch(InterruptedException e){
					e.printStackTrace();
				}
				A.ac.withdraw(10);
				System.out.println(i+" - "+Thread.currentThread().getName()+" bal: "+A.ac.getBal());
			}
		}
	}
}

class A{
	static Account ac = new Account();

	public static void main(String[] args){
		MyThread t1 = new MyThread("mohan");
		MyThread t2 = new MyThread("sohan");
		
		t1.start();
		t2.start();
	}
}


class Account{
	private int bal = 50;

	synchronized int getBal(){
		return bal;
	}

	void withdraw(int amt){
		bal = bal - amt;
	}
}