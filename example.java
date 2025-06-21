// import java.util.Scanner;

// public class example {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter n to get Fibbonacci: ");
//         int n = sc.nextInt();

//         int a = 0;
//         int b = 1;
//         int count = 2;


//         while(count<=n){

//             int temp = b;
//             b = b+a;
//             a = temp;
//             count++;

//         }

//         System.out.println( b);
        
//     }
    
// }

//---------------------------------------------------------------------

    // float f = (2/5)*1;
    // float     a = Math.round(f);   // -- output = 0.0
    // // int a = Math.round(f); --output = 0
    // System.out.println(a);
//---------------------------------------------------------------------
/*You are passing a reference to an array as the argument to the method.
The method may not modify the passed object reference but it can modify
the object itself.
below */

// int[] a = {1};
//     example t = new example();
//     t.increment(a);
//     System.out.println(a[a.length-1]);

// }


// void increment(int[] j){
//     j[j.length-1]++;
// }

//---------------------------------------------------------------------

// }



// to check the count of a perticular digit in a no. 


// public class example{
//     public static void main(String[] args) {
//         int n = 855545;
//         int count=0;
//         int rem = 0;
//         while(n>0){
//             rem = n%10;
//             if(rem ==5 ){
//                 count++;
//             }

//             n =n/10;

//         }

//         System.out.println(count);
//     }
// }
//---------------------------------------------------------------------

// to print the reverse of the given no.

// public class example{
//     public static void main(String[] args) {
//     int num = 5432;
//     int ans = 0;
//     int rem = 0;

//     while(num>0){

//         rem = num%10; //5 //4

//         ans = ans*10 + rem; //5 // 50+4 

//         num = num/10;

//     }
//     System.out.println(ans);

//     }
// }
//---------------------------------------------------------------------
// Basic Calculator
// import java.util.Scanner;
// public class example{
//     public static void main(String[] args) {
//         int ans = 0;
//         Scanner sc = new Scanner(System.in);
//         //Take input from user utill user does not press X or x
        

//         while(true){
//             char op =sc.next().trim().charAt(0);


//             if(op == '+' || op == '-' || op == '*' || op == '/' || op =='%'){

//                 //input two numbers
//                 int num1 = sc.nextInt();
//                 int num2 = sc.nextInt();



//             }




//         }
//     }
// }

//---------------------------------------------------------------------
// functions/methods

//Palindrome no.

// import java.util.Scanner;

// class Solution{
//     // public int isPalindrome(int a){

//     //     while()


//     // }

//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.println("Enter a no. to check Palindrome: ");
//         int num = in.nextInt();
//         int og = num;
//         int rev = 0;
//         int rem = 0;

//         while(num>0){
//             rem = num%10;
//             rev = rev*10 + rem;
//             num = num/10;
//             // System.out.println(num);

//         }
//          System.out.println(rev);
//         if (rev == og)

//         {
//             System.out.println( "is palindrome");
//         }else{
//             System.out.println("is not palindrome");
//         }
    
        
//     }
// }

public class example {

    public static void main(String[] args) {
        // System.out.println(Integer.MAX_VALUE);
        // System.out.println(Integer.MIN_VALUE);

        // String str = "hello";
        // str.concat(" world");
        // System.out.println(str);

        // char ch = 'A';
        // ch++;
        // System.out.println(ch);

        int[] arr = new int[5];
        System.out.println(arr[0]);
    }
}
