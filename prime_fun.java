import java.util.Scanner;

public class prime_fun {
    static void num(int x, int y)
    {
        if(y>x/2)
        {
            System.out.println("prime number");
            return;
        }
        if(x%y==0)
        {
            System.out.println("not a prime number");
            return;
        }
        y++;
        num(x,y); 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n= sc.nextInt();
        num(n,2);
        sc.close();
    }
}
