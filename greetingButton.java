package DAY3;
import java.util.*;

public class greetingButton {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your button:");
        int button = sc.nextInt();
        switch(button){
            case 1:System.out.println("HELLO!");
            break;
            case 2: System.out.println("Namaste");
            break;
            case 3: System.out.println("Bonjour");
            break;
            case 4: System.out.println("Priviet");
            break;
            default:System.out.println("Invalid input");
        }
        sc.close();


    }
    
}
