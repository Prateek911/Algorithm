import java.util.Scanner;

class First
{
   public static void main(String args[])
   {
      String s;

      Scanner in = new Scanner(System.in);

      System.out.println("Enter a string");
      s = in.nextLine();

      if(s.length()>3)
      {
      System.out.println("Hello "+s);
      }

      else
      {
        System.out.println("The minimum length should be 3!");

      }

   }
}
