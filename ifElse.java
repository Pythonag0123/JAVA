package DAY2;
import java.util.*;

public class ifElse {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        float age = sc.nextFloat();
        if (age>=18){
            System.out.println("You can Vote.");
        }
        else{
            System.out.println("You have to be 18 first.");
        }
        sc.close();

    }
    
}
