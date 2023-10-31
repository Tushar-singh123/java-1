import java.util.*;

public class linear_search_fun {
    static int i=0;
    static int num(int x[],int y)
    {
         if(x[i]==y)
         {
            return i;
         } 
         i++;
         return num(x,y);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int[] n= {3,2,5,7,9};
        int m = sc.nextInt();
        System.out.println(num(n,m));
        sc.close();
    }
}
