import java.util.Scanner;
import java.lang.*;

// 153 = 1*1*1 + 5*5*5 + 3*3*3 , 1634

public class Armstrong {
    
    public static boolean isArmstrong(int num) {
        int originalno = num;
        int sum = 0;
        int digitcnt = 0;

        while(num>0)
        {
            num=num/10;
            digitcnt++;
        }
        num = originalno;

        while(num>0)
        {
            int digit = num%10;
            sum += Math.pow(digit , digitcnt);
            num = num/10;

        }

                return sum == originalno;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no. to check ArmStrong No :  " );
        int number = sc.nextInt();

        if (isArmstrong(number))
        {
            System.out.println("the given no. is armstrong no. ");

        }else
        {
            System.out.println("not Armstrong");
        }

        sc.close();
        
       }

    }
    
