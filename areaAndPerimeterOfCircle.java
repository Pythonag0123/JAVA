package DAY2;
import java.util.*;

public class areaAndPerimeterOfCircle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        float rad = sc.nextFloat();
        float perimeter = (float) (2*Math.PI*rad);
        float area = (float)(Math.PI*(rad*rad));
        System.out.println("perimeter is: " +perimeter);
        System.out.println("area is :" +area);
        sc.close();


    }
    
}
