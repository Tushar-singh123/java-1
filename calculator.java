import java.util.*;
public class calculator {
    static double add(double x,double y)
    {
        double z=x+y;
        return z;
    }
    static double subs(double x,double y)
    {
        double z=x-y;
        return z;
    }
    static double mult(double x,double y)
    {
        double z=x*y;
        return z;
    }
    static double divi(double x,double y)
    {
        double z=x/y;
        return z;
    }
    static void output(int c,double x)
    {
        if(c==1)
            System.out.println("add = "+ x);
        else if(c==2)
            System.out.println("substraction = "+ x);
        else if(c==3)
            System.out.println("multiply = "+ x);
        else
            System.out.println("divide = "+x);
    }
   public static void main(String[] args)  {
    Scanner sc = new Scanner(System.in);
    double ad,sub,mul,div;
    System.out.println("enter 2 numbers");
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    System.out.println("choose your option");
    System.out.println("1. add \n 2. substraction \n 3. multiply \n 4. divide");
    int choice = sc.nextInt();
    switch(choice)
    {
        case 1:
            ad  = add(a,b);
            output(choice,ad);
            break;
        case 2:
            sub = subs(a,b);
            output(choice,sub);
            break;
        case 3:
            mul = mult(a,b);
             output(choice,mul);
            break;
        case 4:
            div = divi(a,b);
             output(choice,div);
            break;
        default :
            System.out.println("wrong choicee");
    }
       
    sc.close();
   } 
}
