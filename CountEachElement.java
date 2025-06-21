import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class CountEachElement{
    
        public static Map<Integer, Integer> countElements(int[] arr) {
            Map<Integer, Integer> countMap = new HashMap<>();
            
            for(int element : arr) {
                countMap.put(element, countMap.getOrDefault(element, 0) + 1);
            }
            
            return countMap;
        }
    
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {1,1,3,4,2,2,2};
        Map<Integer,Integer> result = countElements(array);

        for(Map.Entry<Integer, Integer> entry : result.entrySet()) {
            System.out.println("Element " + entry.getKey() + 
                             " occurs " + entry.getValue() + " times");
        }

    }
    

// allow me to count all the elements occured in an array
