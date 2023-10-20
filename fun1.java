import java.util.*;
public class fun1 {
    static double hra(int s)
    {
        double h;
        h= s*0.3;
        return h;
    }
    static double da(int s)
    {
        double d;
        d= s*0.2;
        return d;
    }
    static double gross(int a, double b, double c, double d)
    {
        double g;
        g=a+b+c+d;
        return g;
    }
    static double netsal(double x, double y)
    {
        double n;
        n=x-y;
        return n;
    }
    static int ta()
    {
        int a;
        a=2000;
        return a;
    }
    static double tax(int s)
    {
        double x;
        x= s*0.1;
        return x;
    }
    static void det(String x,double a,double b,double c,double d,double e,double f)
    {
        System.out.print("details of "+ x);
        System.out.println(" is :-");
        System.out.println("hra = "+ a );
        System.out.println("da = "+ b);
        System.out.println("ta = "+ c);
        System.out.println("gross = "+ d);
        System.out.println("tax = "+ e);
        System.out.println("net salary = "+ f);
    }
    public static void main(String[] args) {
        double hr,d,gr,ns,t,T;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name");
        String name= sc.nextLine();
        System.out.println("enter salary");
        int sal = sc.nextInt();
        hr=hra(sal);
        d=da(sal);
        T= ta();
        gr=gross(sal,hr,d,T);
        t=tax(sal);
        ns=netsal(gr,t);
        det(name,hr,d,T,gr,t,ns);
        sc.close();
    }
    
}
