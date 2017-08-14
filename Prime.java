import java.util.Scanner;

class Prime
{ public static void main(String[] args)
  { int flag = 0;
     for(int i=0; i<=1000; i++)
     {
        for (int j = 2; j<i; j++)
        {
          if(i%j == 0)
          {
            flag = 0;
            break;

          }
          else
          {
            flag = 1;
          }

        }

        if(flag == 1)
        {
            System.out.println(i);

        }
    }
 }

 }

 
