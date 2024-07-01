package DAY3;
import java.util.Scanner;

public class whileEx {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to count to: ");
        int a = sc.nextInt();
        int i=1;
        while(i<=a){
            System.out.println(i);
            i++;


        }

        sc.close();

    }
    
}
