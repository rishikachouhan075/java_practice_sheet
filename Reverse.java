import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no.");

        int num = sc.nextInt();

        // Using algorithm

        int rev = 0;
        while(num!=0){
            rev = rev*10 + num%10;
            num = num/10;

        }
        System.err.println("Reversed No. is " + rev);
        
       
    }
    
}






