import java.util.Scanner;

class Triplet

{

	public static void main(String[] args)

  {

    int count=0;

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter how many numbers: ");

		int n = scan.nextInt();

		int[] arr = new int[n];

    System.out.println("Enter the numbers");

		for (int l = 0; l < n; l++)

    {

		        arr[l] = scan.nextInt();
		}







       for (int i = 0; i < arr.length - 2; i++)
       {

           for (int j = i + 1; j < arr.length - 1; j++)
           {

               for (int k = j + 1; k < arr.length; k++)
               {
                   if (arr[i] + arr[j] + arr[k] == 0)
                   {
										   count++;
                       System.out.print("Triplet is " + arr[i] + " ," + arr[j]
                                                             + " ," + arr[k]);
                       break;
                   }
               }
           }
       }

System.out.println("total "+count);

}
}
