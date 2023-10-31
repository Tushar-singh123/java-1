import java.util.*;

public class reverse_no_fun {
    static int r=0;
    static void num(int x)
    {
        
        if(x==0)
        {
            System.out.println(r);
            return ;
        }
        
        int a=x%10;
        r=r*10+a; 
         num(x/10); 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter number");
        int n= sc.nextInt();
        num(n);
       
        sc.close();
    }
}
