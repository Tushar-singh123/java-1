import java.util.Scanner;

public class q12 {
    public static void main(String[] args) {
        System.out.println("enter range");
        Scanner s = new Scanner(System.in);
        int a=0,b=1,c=0;
        int n = s.nextInt();
        System.out.println(a);
        System.out.println(b);
        for(int i=2;i<n;i++)
        {
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
        s.close();
    }
}
