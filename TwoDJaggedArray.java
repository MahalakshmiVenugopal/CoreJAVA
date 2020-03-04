
public class TwoDJaggedArray {

	public static void main(String[] args) {
		
		//Jagged Two-Dimensional Array
		// 3 classrooms with 3, 2 and 4 students respectively
		
		int[][] a = new int[3][];
		a[0] = new int[3];
		a[1] = new int[2];
		a[2] = new int[4];
		
		a[0][1] = 99;
		
		//print Array
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}

}
