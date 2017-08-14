import java.util.*;

class Harmonics
{
     public static void main(String[] args)
     {
       int n;
       Scanner scan = new Scanner(System.in);

       System.out.print("Enter value of N : ");
       n = scan.nextInt();
       double sum = 0.0;

       if (n!=0)
       {

        {
          for (int i = 1; i <= n; i++) {

           sum = sum + (1.0/i);
        }
      }
  System.out.println("Output of Harmonic Series is "+sum);
        }

        else
        {
        System.out.println("N cannot be zero");
        }
      }
}
