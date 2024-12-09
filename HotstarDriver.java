package multithreading;

public class HotstarDriver {
	public static void main(String[] args) {
		Hotstar h1=new Hotstar();
		
		User1 u1=new User1("Mohan", h1);
		User1 u2=new User1("Sohan", h1);
		User1 u3=new User1("Rohan", h1);
		
		u1.start();
		u2.start();
		u3.start();
		
	}

}
