import java.util.Scanner;

public class area_of_circle {
    public static void main(String[] args) {
         System.out.println("enter radius");
        Scanner s = new Scanner(System.in);
        int r = s.nextInt();
        float p=22/7,a;
        a= p*r*r;
        System.out.println("area is"+ a);
        s.close();
    }
}
