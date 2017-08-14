import java.util.*;

class Power
{
     public static void main(String[] args)
     {
       int n;
       Scanner scan = new Scanner(System.in);

       System.out.print("Enter value of N : ");
       n = scan.nextInt();

       int i = 0;
       int power = 1;

       if ((n>0) && (n<31))
       {
            System.out.println("Powers of 2 that are less than 2^"+n);
            while (i <= n)
            {
                System.out.println("2^"+i+" = " + power);
                power = power * 2;
                i++;
            }

        }

        else
        {
        System.out.println("Value of N should be between 0 and 31 only");
        }
      }
}
