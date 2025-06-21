public class Second_largest_No {

    public static void main(String[] args) {
        int arr[] = {70,23,5,8,91,98};
        int size = arr.length;
        int temp = 0;

        System.out.print("Array: ");
        for(int num : arr)
        {
            System.out.print(num);
        }
        
        for(int i =0; i<size; i++)
        {
            for(int j=0;j<size-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }

        System.out.print(" Sorted Array: ");
        for(int num : arr)
        {
            System.out.print(num);
        }
        System.out.println("");
        System.out.println("Size of the array : " + size );
        System.out.println("Second Largest Element of the array : " + arr[size-2]);

    }
    
}
