import java.util.*;
public class q5 {
    public static void main(String[] args) {
        System.out.println("enter number");
        Scanner s = new Scanner(System.in);
        int c=0;
        int n = s.nextInt();
        //m=n;
        while(n>0)
        {
            c++;
            n=n/10;
        }
        System.out.println("range is "+ c);
        s.close();
    }
    
}
