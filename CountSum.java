import java.util.Scanner;

public class CountSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any no. to get it's digit sum : ");
        int num = sc.nextInt();
        int sum = 0;
        int rem = 0;

        while(num>0)
        {
            rem = num%10;
            sum = sum + rem;
            num = num/10;


        }

        System.out.println("sum = " + sum);
    }
    
}
