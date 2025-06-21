// take an array as input from user , search for a given no. "x" and print the index at which it occurs. 
//  
import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int size = sc.nextInt();
        int numbers[] = new int[size];


        // input array elements
        for(int i=0; i<size; i++)
        {
            System.out.println("enter"+ size + "elemmts in the array : ");
            numbers[i] = sc.nextInt();
        }

        // output 
        for(int i=0; i<size; i++)
        {
            System.out.println(numbers[i]);
        }

        System.out.println("Enter the no. which you want to find in the array:  ");
    }
    
}











