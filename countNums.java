package DAY3 ;
import java.util.Scanner;

public class countNums {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to count to:");
        int num = sc.nextInt();
        for (int i=1;i<=num;i++){
            System.out.println(i);
        }
    }
    
}
