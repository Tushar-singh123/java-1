import java.util.*;

public class prime_no_in_range {
    public static void main(String[] args) {
        System.out.println("enter range");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        prime(n,m);
        s.close(); 
    }
    static void prime(int n,int m)
    {
        int c=0;
        for(int j=n;j<=m;j++)
        {
            for(int i=2;i<=j/2;i++)
            {
                c=i;
                if(j%i==0)
                {
                    break;
                }
            }
            if((j==2)||(j==3))
            {
                System.out.print(j+",");
            }
            else if((j==4)||(j==1))
            {
            }
            else if((c+1)>(j/2))
            {
                System.out.print(j+",");
            }
        }  
    } 
}
