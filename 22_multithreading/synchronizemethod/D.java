class MyThread extends Thread{
	MyThread(String name){
		super(name);
	}

	public void run(){
		for(int i=0;i<5;i++){
			Synstem.out.println(i+" - "+Thread.currentThread().getName()+" going to withdraw");
			D.ac.makeWithdrawl(i);
		}
	}
}

class D{
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
	String accNum = "123445";
	String accType = "Saving";

	String getAccNum(){
		return accNum;
	}
	
	String getAccType(){
		return accType;
	}

	synchronized int getBal(){
		return bal;
	}

	synchronized void withdraw(int amt){
		bal = bal - amt;
	}

	synchronized void makeWithdrawl(int i){
		if(getBal()>=10){
			try{
				Thread.sleep(120);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			withdraw(10);
			System.out.println(i+" - "+Thread.currentThread().getName()+" bal: "+getBal());
		}
	}
}