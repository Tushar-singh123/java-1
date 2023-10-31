import java.util.*;
public class area_and_parameter {
    static double area(double l,double b)
    {
        double x=l*b;
        return x;
    }
    static double parameter(double l,double b)
    {
        double x=2*(l+b);
        return x;
    }
    static void output(double a,double b)
    {
        System.out.println("area = "+ a+"\nparameter = "+b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double ar,para;
        System.out.println("enter length and breadth");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        ar = area(l,b);
        para = parameter(l,b);
        output(ar,para);
        sc.close();
    }

}
