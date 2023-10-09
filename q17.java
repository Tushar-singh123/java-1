import java.util.*;
public class q17 {
    public static void main(String[] args) {
        System.out.println("enter number");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i=0;i<n;i++)
        {
                for (int j=0;j<n;j++){
                 if(((i==0)||(i==n-1))||((j==0)||(j==n-1)))
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
        }
        System.out.println();
    }
        s.close();
    }
    
}


