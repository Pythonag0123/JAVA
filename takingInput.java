package DAY2;
import java.util.*;

public class takingInput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //String name = sc.next();//takes only one word
        System.out.println("Enter your name below:");
        String name= sc.nextLine();

        System.out.println("hi " +name);
        sc.close();
    }
    
}
