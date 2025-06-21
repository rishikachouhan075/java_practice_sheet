import java.util.Scanner;

public class Automorphic{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to check if it's automorphic: ");
        int number = sc.nextInt();

        int square = number * number;

        if (isAutomorphic(number, square)) {
            System.out.println(number + " is an automorphic number.");
        } else {
            System.out.println(number + " is not an automorphic number.");
        }
    }

    public static boolean isAutomorphic(int number, int square) {
        int temp = number;
        int cnt = 0;
        while (temp > 0) {
            cnt++;
            temp = temp / 10;
        }

        int lastDigits = square % (int) Math.pow(10, cnt);

        return lastDigits == number;
    }
}
