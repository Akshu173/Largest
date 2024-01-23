import java.util.Scanner;

public class fib {
        public static void main(String args[])
        {
            int i;int fib;int n1=0,n2=1;
            Scanner in =new Scanner(System.in);
            System.out.println("Enter Number:");
            int a=in.nextInt();
            System.out.println("Fibonacci series are:");

            System.out.println(n1+"\n"+n2);

            for(i=2;i<a;i++)
            {
                fib=n1+n2;
                System.out.println(fib);
                n1=n2;
                n2=fib;
            }


    }
}
