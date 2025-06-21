import java.util.Scanner;

public class SumOfElements {
    public static void main(String[] args) {
        int s = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array you want : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + "elements to store in an array: ");

        for(int i = 0 ; i<n ; i++)
        {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for(int j = 0 ; j< arr.length; j++)
        {
            sum = sum + arr[j];
        }
        System.out.println("sum of the elements of array: " + sum);

    }
    
}
