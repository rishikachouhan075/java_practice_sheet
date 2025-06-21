package PracticeJava;

import java.util.Scanner;

public class EvenOddCnt {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no. : ");
        int num = sc.nextInt();
        int evencnt=0;
        int oddcnt=0;

        while(num>0)
        {
            int rem = num%10;


            if(rem%2==0)
            {
                evencnt++;
            }
            else
             {
                oddcnt++;
            }
            num = num/10;

        }
        System.out.println("even count:" + evencnt + "odd count:" + oddcnt);
    }
    
}



