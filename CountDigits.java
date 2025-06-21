import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no. to check its digits:");
        int num = sc.nextInt();
        int cnt = 0;

        while(num>0)
        {
            num=num/10;
            cnt++;

        }
        System.out.println("No. of digits = " + cnt);

        
    }
    
}
