public class Bubble_sort {
    public static void main(String[] args) {
        int nums[] = {6,5,2,9,4};
        int size = nums.length;
        int temp = 0;


        System.out.println("original Array:");
        for(int num:nums){
            System.out.print(num);
        }

        for( int i=0; i<size;i++)
        {
            for(int j=0;j<size-1;j++)
            {
                if( nums[j] > nums[j+1])
                {
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;

                }
            }


        }

        System.out.print("Sorted Array: ");
        for(int num:nums)
        {

            System.out.print( "" + num);
        }

    }
}


