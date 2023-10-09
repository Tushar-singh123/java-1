import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        System.out.println("enter number");
        Scanner s = new Scanner(System.in);
        int a,r=0,m;
        int n = s.nextInt();
        m=n;
        while(n>0)
        {
            a=n%10;
            r=r*10+a;
            n=n/10;
        }
        if(r==m)
        {
            System.out.println("it is palimdome number");
        }
        else
        {
            System.out.println("not a palimdrome number");
        }
        s.close();
    }
}
