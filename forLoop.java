package DAY3;
import java.util.*;

public class forLoop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of times you want to print:");
        int count = sc.nextInt();
        sc.nextLine();  // Consume the newline character left by nextInt()
        System.out.println("Enter the statement you want to print:");
        String statement = sc.nextLine();
        for(int i = 0; i < count; i++){
            System.out.println(statement);
        }
        sc.close();
    }
}

