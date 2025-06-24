import java.util.Scanner;

public class findSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any positive number to check the smallest digit: ");
        int num = sc.nextInt();

        int smallest_digit = 9; 

        while (num > 0) {
            int digit = num % 10;
            if (digit < smallest_digit) {
                smallest_digit = digit;
            }
            num = num / 10;
        }

        System.out.println("Smallest digit is: " + smallest_digit);
        sc.close();
    }
}
