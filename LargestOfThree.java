
import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first No. : ");
        int a = sc.nextInt();
        System.out.println("Enter Second No. : ");
        int b = sc.nextInt();
        System.out.println("Enter third No. : ");
        int c = sc.nextInt();

        if (a>b && a>c) 
        {
            System.out.println(a + "is the largest no.");
        }
        else if (b>a && b>c) 
        {
            System.out.println(b + "is the largest no.");  
        }
        else
        {
            System.out.println(c + "is the largest no.");
        }
    }
    
}
