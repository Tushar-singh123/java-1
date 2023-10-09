import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
         System.out.println("enter number");
        Scanner s = new Scanner(System.in);
        int a,r=0;
        int n = s.nextInt();
        while(n>0)
        {
            a=n%10;
            r=r*10+a;
            n=n/10;
        }
        System.out.println("reverse number is "+r);
        s.close();
    }  
}
