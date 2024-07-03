package DAY4;
import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();
        for(int i = rows; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("*"); // Use print instead of println
            }
            System.out.println(); // Move to the next line after printing all stars in a row
        }
        sc.close();
    }
}
