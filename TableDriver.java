package multithreading;

public class TableDriver {
	public static void main(String[] args) {
		Table t=new Table();
		
		A a=new A(t);
		B b=new B(t);
		
		a.start();
		b.start();
	}

}
