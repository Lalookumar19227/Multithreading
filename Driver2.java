package multithreading;

public class Driver2 {
	public static void main(String[] args) {
		System.out.println("Main Thread starts!!");
		System.out.println("Thread Name is: "+Thread.currentThread().getName());
		System.out.println("Thread ID is: "+Thread.currentThread().getId());
		System.out.println("Thread Priority is: "+Thread.currentThread().getPriority());
		System.out.println("=============================================");
		
		Rocket r1=new Rocket();
		r1.setPriority(11);
		r1.setName("PSLV");
		r1.setDaemon(false);
		r1.start();
	}

}
