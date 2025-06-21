import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no. to get Upto fibonacci ");
        int num = sc.nextInt();
        int a = 0;
        int b = 1;
        
        for (int i = 1; i <= num; i++) {
            System.out.print(a+ " ");

            int next = a + b;
            a=b;
            b=next;
        }

        
    }
    
}


