import java.util.Scanner;

public class Factorization {
    public static void main(String[] args) {
        System.out.print("Enter a positive number: ");
        Scanner scanner = new Scanner (System.in);
        int number = scanner.nextInt();
        int count;
        for (int i = 2; i<=(number); i++) {
            count = 0;
            while (number % i == 0) {
                number /= i;
                count++;}

                if (count == 0) {
                    continue;
                }

            System.out.println(i+ " x" + count);
        }
    }
}
