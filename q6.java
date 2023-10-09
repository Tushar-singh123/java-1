import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        System.out.println("enter number");
        Scanner s = new Scanner(System.in);
        int a=0,t=0;
        int n = s.nextInt();
        //m=n;
        while(n>0)
        {
            a=n%10;
            t=t+a;
            n=n/10;
        }
        System.out.println("sum is "+ t);
        s.close();
    }
}
