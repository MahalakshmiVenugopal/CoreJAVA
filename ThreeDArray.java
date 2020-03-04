import java.util.Scanner;

public class ThreeDArray {

	public static void main(String[] args) {
		
		//Regular ThreeDArray
		//Blocks-rows-columns
		int[][][] a = new int[3][4][3];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements of Array");
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				for(int k=0; k<a[i][j].length; k++) {
					a[i][j][k] = sc.nextInt();
				}
			}
		}
		
		//print Array
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				for(int k=0; k<a[i][j].length; k++) {
					System.out.print(a[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}

	}

}
