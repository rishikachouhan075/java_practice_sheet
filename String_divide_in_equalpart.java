import java.util.Scanner;



// define "n" to divide string into n equal parts , here we take n=2


public class String_divide_in_equalpart {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to Divide it in equal parts: ");

        // Scanner scn = new Scanner(System.in);
        // System.out.println("state in how many parts you want to divide the string:");
        // int n = scn.nextInt();

        String str = sc.nextLine();
        int length = str.length();
        int temp = 0; 
        int chars = length/2;
        
        if(length % 2 !=0)
        {
            System.out.println("Sorry your string is not divisble in 2 equal parts");

           
        }

        else
        {
            for(int i=0; i<length;i=i+chars)
            {


            }


        }



    }
    
}



