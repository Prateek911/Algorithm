import java.util.*;

class leapyear
{
    public static void main(String args[])
    {
       int yr;
       Scanner scan = new Scanner(System.in);

       System.out.print("Enter Year : ");
       yr = scan.nextInt();

       if(yr >999)
       {
       if((yr%400 == 0) || (yr%4==0) && (yr%100!=0))
         {
           System.out.print("This is a Leap Year");
         }

        else
         {
           System.out.print("This is not a Leap Year\n");
        }

       }

else
{
System.out.println("Not a valid year");
}
     }
}
