import java.util.Scanner;

public class prime_number {
    public static void main(String[] args) {
        System.out.println("enter number");
        Scanner s = new Scanner(System.in);
        int c=0;
        int n = s.nextInt();
        for(int i=2;i<=n/2;i++)
        {
            c=i;
            if(n%i==0)
            {
                break;
            }
        }
        if((c+1)>(n/2))
        {
            System.out.println("it is prime number");
        }
        else
        {
            System.out.println("not a prime number");
        }
        s.close();
    }
}
