import java.util.*;
public class Even_and_odd_in_range {
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("enter range");
        int m = s.nextInt();
        int n = s.nextInt();
        System.out.println("for odd press 1\n for even press 2\n");
        int c = s.nextInt();
        for(int i=m;i<=n;i++)
        {
            switch(c)
            {
                case 1:
                  if(i%2!=0)
                  {
                    System.out.println( i);
                  }
                  break;
                case 2:
                  if(i%2==0)
                  {
                    System.out.println( i);
                  }
                  break;
                  default:
                  {
                    System.out.println("wrong choice");
                  }
            }
        }
        s.close();
    }
}
