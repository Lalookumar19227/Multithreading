package multithreading;

public class A extends Thread{
	Table t;
	A(Table t){
		this.t=t;
	}
	public void run() {
		t.printTable(8);
	}

}
