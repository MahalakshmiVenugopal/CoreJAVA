import java.util.Scanner;
public class OneDArray {
    public static void main(String args[]) {
        
        //Standard method
        //Array data structure to store marks of students
        int[] marks = new int[3]; //declaration
        
        marks[0] = 100;  //initialisation
        marks[1] = 98;
        marks[2] = 95;
      
      for(int i=0; i<=marks.length-1; i++){
        System.out.println("Marks of students are" + " " + marks[i]);   
        }
        //Scanner method
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array length");
        int len = sc.nextInt();
        
        int[] m = new int[len];
        
        System.out.println("Enter the marks of student");
        for(int i=0; i<=m.length-1; i++){
            m[i] = sc.nextInt();
        }
        
        for(int i=0; i<=m.length-1; i++){
            System.out.println(" marks:" + m[i] );
        }
        
      
    }
}