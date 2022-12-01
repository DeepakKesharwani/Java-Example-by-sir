// Java program to illustrate 
// stopping a thread 
// using the interrupt() method 

class MyThread implements Runnable { 

	Thread t; 

	MyThread() 
	{ 
		t = new Thread(this); 
		System.out.println("New thread: " + t); 
		t.start(); // Starting the thread 
	} 

	// execution of thread starts from run() method 
	public void run() 
	{ 
		while (!Thread.interrupted()) { 
			System.out.println("Thread is running"); 
		} 
		System.out.println("Thread has stopped."); 
	} 
} 

// Main class 
public class Z { 
	public static void main(String args[]) 
	{ 
		// creating objects t1 of MyThread 
		MyThread t1 = new MyThread(); 

		try { 
			Thread.sleep(1); 

			// t1 is an object of MyThread 
			// which has an object t 
			// which is of type Thread 
			t1.t.interrupt(); 

			Thread.sleep(5); 
		} 
		catch (InterruptedException e) { 
			System.out.println("Caught:" + e); 
		} 
		System.out.println("Exiting the main Thread"); 
	} 
} 
