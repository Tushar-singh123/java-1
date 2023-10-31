import java.util.*;

public class tk {
    static int p(String s,int ch,int x)
    {
        String s2 = "]";
        int z;
        z=ch;
        for(int i=1;i<=x;i++)
        {
            ch=z;
            while(s.equals(s2));
            {
            System.out.println(s.charAt(ch));
            ch++;
            }
        }
        return ch;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter strting");
        String s = sc.next();
        String s1 = "[";
        int ch,x,t;
        System.out.println(s.charAt(0));
        for(int i=0;i<=s.length();i++)
        {
            x=s.charAt(i);
            i++;
            //System.out.println(s.charAt(i));
            //c=s.charAt(i);
            if(s.equals(s1))
            {
                ch=i+1;
                t=p(s,ch,x);
                i=t;
            }
            else{
                System.out.println("wrong string");
            }
        }
        sc.close();
    }
}
