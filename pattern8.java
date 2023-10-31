import java.util.*;
public class pattern8 {
    public static void main(String[] args) {
        System.out.println("enter number");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i=1;i<+n;i++)
        {
                for(int j=n-i;j>0;j--)
                {
                    System.out.print("  ");
                }
                for(int k=i;k<=(2*i-1);k++)
                {
                    System.out.print(k+" ");
                }
                for(int l=(2*i-2);l>i-1;l--)
                {
                    System.out.print(l+" ");
                } 
            System.out.println();
        }
        s.close();
    }
}
