package DAY3;
import java.util.*;

public class multiplicationTable {
    public static void main(String[] args){
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i= 1;i<11;i++){
            System.out.println(n +"X" + i + "=" + n*i);
        }
        sc.close();
    }
    
}
