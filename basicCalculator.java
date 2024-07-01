package DAY3;
import java.util.*;

public class basicCalculator {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        float a = sc.nextFloat();
        System.out.println("Enter the second number:");
        float b = sc.nextFloat();
        System.out.println("Enter the operator");
        char c = sc.next().charAt(0);
        switch(c){
            case '+' : System.out.println(a+b);
            break;
            case '-' : System.out.println(a-b);
            break;
            case '%' : System.out.println(a%b);
            break;
            case '*' : System.out.println(a*b);
            break;
            case '/' : System.out.println(a/b);
            break;
            default: System.out.println("Invalid operator");

        }
        sc.close();


    }
    
}
