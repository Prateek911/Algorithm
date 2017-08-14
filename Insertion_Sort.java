import java.util.*;
class Insertion_Sort{
	public static void main(String...args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter how many words you want to enter");
	int data=sc.nextInt();
	System.out.println("ENter your data");
	String[] str=new String[data];
	for(int i=0;i<data;i++)
	{
		 str[i]=sc.next();
	}
	System.out.println("after sorting ");
	Utility.insertionSortString(str,data-1);

}
}
