package multithreading;

public class B extends Thread{
	
	Table t;
	B(Table t){
		this.t=t;
	}
	public void run() {
		t.printTable(12);
	}

}
