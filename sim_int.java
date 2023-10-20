import java.util.*;
public class sim_int {
    static void si(double p,double r,double t)
    {
        System.out.println("simple intrest is = "+((p*r*t)*0.01));
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter principle");
       double p = sc.nextInt(); 
       System.out.println("enter rate");
       double r = sc.nextInt(); 
       System.out.println("enter time");
       double t = sc.nextInt(); 
       si(p,r,t);
       sc.close();
    }
}
