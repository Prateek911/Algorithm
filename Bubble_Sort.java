import java.util.*;
class Bubble_Sort{
	public static void main(String...args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter how many int data you want to enter");
	int data=sc.nextInt();
	System.out.println("Enter your data");
	int[] str=new int[data];
	for(int i=0;i<data;i++)
	{
		 str[i]=sc.nextInt();
	}
	System.out.println("after sorting ");

	Utility.bubbleSortInt(str,str.length-1);


	}
}
