// Palindrom logic  is to be build .. 
// Factorial
// Fibonacci
// Prime No.
// Reverse a no.
// Reverse a String
// Array all types Questions.
// Automorphic Number
// PetersonNumber
// AnagramString

// Count the characters in a string


import java.util.Scanner;

public class New1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no. to check Automorphic");
        int num = sc.nextInt();
        int square = num*num;


        if(isAutomorphic( num , square))
        {
            System.out.println("The No. is AutoMorphic.");
        }
        else
        {
            System.out.println("The No. is  not AutoMorphic.");
        }

    }

    public static boolean isAutomorphic(int num, int square)

    {
        int cnt = 0;
        int temp = num;
        while(temp>0)
        {
            temp = temp/10;
            cnt++;
        }

        int lastDigits = square % (int) Math.pow(10, cnt);

        return lastDigits == num;

    }
    
}

// if the class is not public we can make multiple classes in a class.