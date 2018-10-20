package tongcot;

import java.util.Scanner;

public class TongCot {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size: ");
        int size = sc.nextInt();
        int[][] array = new int[size][size];
        int sum=0;
        
        System.out.println("Enter a column: ");
        int column = sc.nextInt();
        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.println("Enter value of array["+i+"]: ");
                array[i][j]=sc.nextInt();
                if(j==column) sum+=array[i][j];
            }
        }      
        
        System.out.println("Sum of Column "+column+" is: "+sum);
    }
    
}
