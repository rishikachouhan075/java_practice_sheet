// public class Selection_sort {

//     public static void main(String[] args) {
        
//         int arr[] = {6,5,2,8,9,4};
//         int size = arr.length;
//         int temp =0;
//         int minIndex = -1;

//         for(int i=0;i<size-1;i++)
//         minIndex = i;
        
//         {
//             for(int j=i+1;j<size;j++)
//             {
//                 if(arr[minIndex] > arr[j] )
//                 {
//                     minIndex = j;
//                 }
//             }

//             temp = arr[minIndex];
//             arr[minIndex] = arr[i];
//             arr[i] = arr[temp];
//         }



//         System.out.println("Selection Sort: ");
//         for(int num : arr)
//     {
//         System.out.print(num);
//     }
    

//     }
    
// }
public class Selection_sort {
    // Function to perform selection sort
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in the remaining unsorted array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Function to print the array
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        int[] numbers = {64, 25, 12, 22, 11};
        System.out.println("Original array:");
        printArray(numbers);

        selectionSort(numbers);

        System.out.println("Sorted array:");
        printArray(numbers);
    }
}
