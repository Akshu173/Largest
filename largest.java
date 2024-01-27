import java.util.Scanner;

public class largest {
    public static void main(String args[])
    {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter Num1:");
        float a=in.nextFloat();
        System.out.println("Enter Num2:");
        float b=in.nextFloat();
        System.out.println("Enter Num3:");
        float c=in.nextFloat();
        if(a>b && a>c)
        {
            System.out.println("A is Largest Number");

        }
        else if(b>a && b>c)
        {
            System.out.println("B is Largest Number");

        }
        else
        {
            System.out.println("C is Largest Number");
        }


    }

}
