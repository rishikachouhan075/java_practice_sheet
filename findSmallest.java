package PracticeJava;

import java.util.Scanner;

public class findSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any positive no. to check the smallest digit: ");
        int num = sc.nextInt();
        // int smallest_digit = 0;

        while(num>0)
        {
            int digit = num%10;
            int smallest_digit = 0;
            if(digit>0)
            {
                smallest_digit = digit;

            }
            num = num/10;
        }
        System.out.println("smallest Digit is " + smallest_digit);

    }
    
    
}
