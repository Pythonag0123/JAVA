package DAY3;
import java.util.*;

public class doWhileLoopExample {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to count to:");
        int count = sc.nextInt();
        int i =1;
        do{
            System.out.println(i);
            i++;
        }
        while(i<=count);
        sc.close();
        
    }

    
}
