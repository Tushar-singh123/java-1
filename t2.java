public class t2 {
    
        public static void main(String[] args) {
            int sum = 0;
            for(int i=1;i<=5;i++){
            int num1 = Integer.parseInt(args[i]);
            //int num2 = Integer.parseInt(args[1]);
            sum = num1 + sum;
            }
            System.out.println("thi is the sum of cmd line args:"+ sum);
        }
    }
