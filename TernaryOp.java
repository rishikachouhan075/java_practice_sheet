import java.util.Scanner;

public class TernaryOp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first no. : ");
        int a = sc.nextInt();

        System.out.println("Enter second no. : ");
        int b = sc.nextInt();

        System.out.println("Enter third no. : ");
        int c = sc.nextInt();

        int largest = a>b?a:b;
        largest = c>largest?c:largest;

        System.out.println("the Largest Among the three numbers is : " + largest);

    }
    
}
