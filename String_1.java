import java.util.Scanner;

public class String_1{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write a String to count total no. of Characters in it. ");
        String new_string = sc.next();
        int count = 0 ;
        int length = new_string.length();

        System.out.println("the length of the string is  " + length);


        for(int i =0;i<length;i++)
        {


            
            if(new_string.charAt(i)!=' ')
            {
                count++;

            }

        }


        // for(int i = 0; i < new_string.length(); i++) {    
        //     if(new_string.charAt(i) != ' ')    
        //         count++;    
        // }    
            

        System.out.println("Total No. of characters in the String:" + count);
    }
}