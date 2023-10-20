import java.util.*;
public class area_of_triangle {
    public static void main(String[] args) {
        System.out.println("enter hight and base");
        Scanner s = new Scanner(System.in);
        float r;
        int h = s.nextInt();
        int b = s.nextInt();
        r=(b*h)/2;
        System.out.println("area is"+ r);
        s.close();
    }
    
}
