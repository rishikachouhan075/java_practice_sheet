import java.util.ArrayList;

public class AlternateArraySplit_Arraylist {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};

        int size = arr.length;

        ArrayList<Integer> x = new ArrayList<>();
        ArrayList<Integer> y = new ArrayList<>();

        for(int i=0; i<size; i++){
            if( i%2==0){
                x.add(arr[i]);
            }else{
                y.add(arr[i]);
            }
        }

        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }   
}
