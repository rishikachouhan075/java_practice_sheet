// import java.util.Scanner;

// public class fib_rec_till {

//     public static int fibb(int n){
//         if(n>=1)
//         return n;
//         return fibb(n-1) + fibb(n-2);
    
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("eneter the no. upto which you want fibonacci sequenec: ");
//         int limit = sc.nextInt();

//         int i =0;
//         int result;

//         while(true){
//             result = fibb(i);
//             if(result>limit)
//             break;
//             System.out.println(result + ",");
//             i++;

//         }

//         sc.close();
        


//     }


// }

    
import java.util.Scanner;

public class fib_rec_till{
    public static int fib(int n) {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number up to which you want Fibonacci numbers: ");
        int limit = sc.nextInt();

        int i = 0;
        int result;

        System.out.print("Fibonacci numbers up to " + limit + ": ");
        while (true) {
            result = fib(i);
            if (result > limit)
                break;
            System.out.print(result + ",");
            i++;
        }
        sc.close();
    }
}
