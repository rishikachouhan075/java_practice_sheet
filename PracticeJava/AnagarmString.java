package PracticeJava;

import java.util.Scanner;
import java.util.Arrays;

/*Algorithm
STEP 1: START
STEP 2: DEFINE str1 ,str2 (get from user or define yourself)
STEP 3: CONVERT str1, str2 to lower-case.
STEP 4: IF length of str1, str2 are not equal then PRINT "Not Anagram"
else go to Step 5
STEP 5: CONVERT str1, str2 to character arrays.
STEP 6: SORT the arrays.
STEP 7: COMPARE the arrays, IF equal then PRINT "Anagram"
else
PRINT "Not Anagram"
STEP 8: END

 */


public class AnagarmString {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two Strings to check Anagram");
        String a = sc.nextLine();
        String b = sc.nextLine();
        a = a.toLowerCase();
        b = b.toLowerCase();
        if(a.length() != b.length())
        {
            System.out.println("The given Strings are not Anagram");
        }
        else
        {
            char[] string1 = a.toCharArray();
            char[] string2 = b.toCharArray();
            Arrays.sort(string1);
            Arrays.sort(string2);

            if(Arrays.equals(string1, string2))
            {
                System.out.println("the Strings are ANAGRAM");
            }else
            {
                System.out.println(" the strings are Not ANAGRAM");
            }
        }      
    }  
}
