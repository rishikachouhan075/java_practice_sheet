// Given an array of integers nums, return the maximum number in the array.
// public class Leet_Quiz {
//     public static void main(String[] args) {
//         int[] nums = {2,4,6,32,1,0};
//         int size = nums.length;
//         int[] sorted = 
//     }

    
// }

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
// public class Leet_Quiz{
//     public static  void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter 5 values of array ");
//         String [] arr = new String[5];

//         // for  taking inputs
//         for(int i = 0; i<arr.length ; i++){
//             arr[i] = sc.next();
//         }
//         System.out.print(Arrays.toString(arr));
//     }
// }

//  change the object 
// public class Leet_Quiz {
//     public static void main(String[] args){
//         Scanner in = new Scanner(System.in);
//         int[] arr = {3,5,6,8,1};
//         System.out.println(Arrays.toString(arr));

//         change(arr);
//         System.out.println(Arrays.toString(arr));
//     }
//     static void change(int[] arr){
//         arr[1] = 101;

//     }
// }

// 2-D array
// CountSubArray 
// COUNT SUB ARRAY
// public class Leet_Quiz{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         ArrayList<Integer> list = new ArrayList<>();
//     }
// }

// --
/*
 * "hellosannasrishi"
 * find the longest palindrom from a given string
 * Palindrome + substring
 * 1.find the palindrome for every substring
 * 
 * 
 */

//  public class Leet_Quiz {
 
//     public static void main(String[] args) {
//         String str = "hellosannasrishi";
//         int l = str.length();
//         String org_str = str;
//         String rev = "";

//         for(int i= l-1; i<=0; i++)
//         {
//             rev = rev + str.charAt(i);
//         }


//         if(org_str.equals(rev))
//         {
//             System.out.println("Palindrome ");

//         }
//         else{
//             System.out.println("Not Palindrome: ");
//         }

//     }
//  }

// ----------------------------
 /**
  * arr = [4,8,6]
  make the array consecutive
  */

//   public class Leet_Quiz {
  
//     public static void main(String[] args) {
//         // int[] arr = {4,8,6};
//         int[] arr = {-2,0,4};
//         int size = arr.length;
//         Arrays.sort(arr);

//         int min = arr[0];
//         int max = arr[size-1];
//         int[] consecutive = new int[max - min + 1];

//         for (int i = 0; i < consecutive.length; i++) {
//             consecutive[i] = min + i;
//         }

//         int length = consecutive.length;
//         int ans = length-size;

//         System.out.println("Ans: " + Arrays.toString(consecutive));
//         System.out.println("No. of inserted elemnet: " + ans);

//     }
//   }

/*
 * string str = "123";
 * return the gratest no. containing the same digit
 * 
 * 
 */
// import java.lang.String;
//  public class Leet_Quiz {
 
//     public static void main(String[] args) {
//         String str = "123";

//         char[] str_num  = str.toCharArray();
//         Arrays.sort(str_num);
//         System.out.println(str_num);

//         StringBuilder sb = new StringBuilder(new String(str_num));
//         sb.reverse();
//         System.out.println("largest no. : " + sb.toString());
//     }
// }

/*
 * string = "123"
 * from the given string show the next largest no.
 * output = "132"
 */
public class Leet_Quiz {
    public static void main(String[] args){

        String str = "123";
        char[] str_num = str.toCharArray();

        
        System.out.println(str_num);




    }

    
}