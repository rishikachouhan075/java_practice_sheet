import java.util.Scanner;

public class New {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no. to get fibonacci series: ");
        int fib = sc.nextInt();
        int n1 = 0;
        int n2 = 1;
        int sum = 0;
        System.out.print(n1 + " " + n2);

        for(int i =2; i<fib ; i++)
        {
            sum = n1+n2;
            System.out.print(" "+sum);
            n1 = n2;
            n2 = sum;
        }
        

       
    } 
}