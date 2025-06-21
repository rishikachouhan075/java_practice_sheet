// Java Program to count the total number of characters in a string

import java.util.Scanner;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write a String to count total no. of Characters in it. ");
        String new_string = sc.nextLine();
        int count = 0 ;
        int length = new_string.length();


    //     for(int i =0;i<length;i++)
    //     {
    //         if(new_string.charAt(i)!='')
    //         {
    //             count++;

    //         }

    //     }

    //     System.out.println("Total No. of characters in the String:" + count);
    // }

    for(int i = 0; i < new_string.length(); i++) {    
        if(new_string.charAt(i) != ' ')    
            count++;    
    }    
        
    //Displays the total number of characters present in the given string    
    System.out.println("Total number of characters in a string: " + count);    
}    

    
