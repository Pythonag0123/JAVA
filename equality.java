package DAY2;
import java.util.*;

public class equality {
    public static void main(String[] args){ 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        float a = sc.nextFloat();
        System.out.println("Enter the second number:");
        float b = sc.nextFloat();
        if (a==b){
            System.out.println("EQUAL");
        }
        else if(a <b){
            System.out.println("first number is smaller");
        }
        else if(a>b){
            System.out.println("First number is bigger");
        }
        sc.close();

    }
    
}
