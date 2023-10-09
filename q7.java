import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        System.out.println("enter number");
        Scanner s = new Scanner(System.in);
        int f=1;
        int n = s.nextInt();
        for(int i=1;i<=n;i++)
        {
            f=f*i;
        }
        System.out.println("factorial is "+ f);
        s.close();
    }
}
