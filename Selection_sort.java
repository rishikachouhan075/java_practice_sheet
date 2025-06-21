public class Selection_sort {

    public static void main(String[] args) {
        
        int arr[] = {6,5,2,8,9,4};
        int size = arr.length;
        int temp =0;
        int minIndex = -1;

        for(int i=0;i<size-1;i++)
        minIndex = i;
        
        {
            for(int j=i+1;j<size;j++)
            {
                if(arr[minIndex] > arr[j] )
                {
                    minIndex = j;
                }
            }

            temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = arr[temp];
        }



        System.out.println("Selection Sort: ");
        for(int num : arr)
    {
        System.out.print(num);
    }
    

    }
    
}
