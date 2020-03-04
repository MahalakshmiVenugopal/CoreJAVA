package OOP;

import java.util.Scanner;

public class Encapsulation {

	public static void main(String[] args) {
		
		Book bo = new Book();
		
		//Direct Access
		//bo.page_no = 100;
		//System.out.println(bo.page_no);
		
		//Controlled Access
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the page number");
		bo.setData(sc.nextInt());
		System.out.println("Page number is " + bo.getData());
	}

}
