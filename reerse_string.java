import java.util.*;

public class reerse_string {
    static String p="";
    static String reverse(String x,int i)
    {
        
        if(i<=-1)
        {
            return p;
        }
        char c=x.charAt(i);
        p+=c;
        i--;
        return reverse(x,i);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter sttring");
        String s= sc.next();
        System.out.println(reverse(s,s.length()-1));
        sc.close();
    }
}
