import java.util.Scanner;

public class pattern7 {
     public static void main(String[] args) {
    System.out.println("enter number");
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    for(int i=1;i<=n;i++)
        {
            for (int j=1;j<=i;j++){
            if((j>1)&&(n!=i)&&(j<i))
            {
                System.out.print("  ");
            }
            else
            {
                System.out.print("* ");
            }
        }
            System.out.println();
        }
    s.close();
}
}
