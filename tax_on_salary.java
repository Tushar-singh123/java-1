

import java.util.*;
public class tax_on_salary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter salary");
        double i = s.nextDouble();
        if(i<=10000)
        {
            System.out.println("no tax");
        }
        if(i>10000 && i<=20000)
        {
            System.out.println(" tax is" + i*0.1);
        }
        if(i>20000 && i<=30000)
        {
            System.out.println(" tax is" + i*0.2);
        }
        if(i>30000 )
        {
            System.out.println(" tax is" + i*0.25);
        }
        s.close();
    }
    
}
