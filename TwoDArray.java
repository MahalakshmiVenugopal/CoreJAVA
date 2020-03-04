import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		//Regular Two-Dimensional Array
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no of rows");
		int r = sc.nextInt();
		
		System.out.println("Enter the no of columns");
		int c = sc.nextInt();
		
		int[][] a = new int[r][c];
		
		System.out.println("Enter the elements of array");
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		//printing Array
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
	}    
}
