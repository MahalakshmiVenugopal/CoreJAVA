package OOP;

public class Book {
	
	private int page_no;    //preventing direct access
	
	//setter
	public void setData(int x) {
		if(x>0) {
			page_no = x;
		}
		else {
			System.out.println("Invalid Input");
			System.exit(0);
		}
	}
	
	//getter
	public int getData() {
		return page_no;
	}
	
}
