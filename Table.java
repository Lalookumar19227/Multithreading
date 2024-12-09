package multithreading;

public class Table {
	
	public  void printTable(int n) {
		System.out.println("Table Printing Starts");
		for(int i=1;i<=10;i++)
			System.out.println(n+"*"+i+"= "+n*i);
		System.out.println("Table Printing Ends");
	}
}
