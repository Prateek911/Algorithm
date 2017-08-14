import java.util.*;
import java.io.*;

public class Arr
{
	public static void main(String args[])
  	{

		int row, col, i, j;
       		int arra[][] = new int[10][10];



	    	PrintWriter pw1=new PrintWriter(System.out,true);
		Scanner scan = new Scanner(System.in);
       		pw1.print("Enter Number of Row for Array (max 10) : ");
          pw1.flush();
       		row = scan.nextInt();

       		pw1.print("Enter Number of Column for Array (max 10) : ");
          pw1.flush();
       		col = scan.nextInt();

		pw1.print("Enter " +(row*col)+ " Array Elements : ");
	pw1.flush();

       		for(i=0; i<row; i++)
      		{
       	    		for(j=0; j<col; j++)
           		{
              			 arra[i][j] = scan.nextInt();
           		}
      		}
	  	PrintWriter pw2=new PrintWriter(System.out);
       		pw2.print("The Array is :\n");
          pw2.flush();
       		for(i=0; i<row; i++)
       		{
          		 for(j=0; j<col; j++)
          		 {
              			 pw2.print(arra[i][j]+ "  ");
           		 }
           	pw2.println();
            pw2.flush();

       		}

pw2.close();

}
}
