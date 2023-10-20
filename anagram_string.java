import java.util.Scanner;

public class anagram_string {
    public static void main(String[] args) {
         System.out.println("enter string");
        Scanner s = new Scanner(System.in);
        int c=0;
        String m = s.next();
        String n = s.next();
        for(int i=0;i<m.length();i++)
        {
            for(int j=0;j<n.length();j++)
            {
                if(m.charAt(i)==n.charAt(j))
                {
                    c++;
                }
            }
        }
        if((c==m.length())||(c==n.length()))
        {
            System.out.println("anagram string");
        }
        else
        {
            System.out.println("not a amagram string");
        }
        s.close();
    }
}
