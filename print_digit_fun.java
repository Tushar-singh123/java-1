import java.util.*;

public class print_digit_fun {
    static void num(int x)
    {
        if(x==0)
        {
            return;
        }
        num(x/10);
        System.out.println(x%10);  
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n= sc.nextInt();
        num(n);
        sc.close();
    }
}
