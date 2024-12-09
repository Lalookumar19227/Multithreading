package multithreading;

public class Driver1 {
	public static void main(String[] args) {
		System.out.println("Thread name is: "+Thread.currentThread().getName());
		System.out.println("Thread Prio");
		
		
		Vehicle v1=new Vehicle();
		Vehicle v2=new Vehicle();
		Vehicle v3=new Vehicle();
		
		Thread t1=new Thread(v1);
		Thread t2=new Thread(v2);
		Thread t3=new Thread(v3);
		t2.setDaemon(true);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
