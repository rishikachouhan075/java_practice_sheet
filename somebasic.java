import java.util.Scanner;

public class somebasic {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");

        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the element of array:");

        for(int i=0; i<size; i++){

            arr[i] = sc.nextInt();
        }






        





        System.out.print("Entered Array ");
        for(int nums:arr){
            System.out.print(nums + " ");
        }
    }   
}
