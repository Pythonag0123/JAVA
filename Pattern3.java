package DAY4;
import java.util.*;

public class Pattern3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();
        
        for(int i = 0; i < rows; i++) {
            // Print asterisks
            for(int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }
        sc.close();
    }
}
