package DAY3;
import java.util.*;

public class sumOfFirstNNaturals {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER THE VALUE FOR N:");
        int n = sc.nextInt();
        int sum=0;
        for(int i = 1;i<=n;i++){
            sum=sum+i;

        }
        System.out.println(sum);
        sc.close();


    }
}
