package multithreading;

public class User3 extends Thread{
	String name;
	Hotstar h1;
	User3(String name, Hotstar h1){
		this.name=name;
		this.h1=h1;
	}
	
	public void run() {
		h1.play();
	}

}
