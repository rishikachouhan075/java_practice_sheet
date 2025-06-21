// "What is the difference between A hero 1 and the enemy 2"

import java.util.Arrays;
import java.lang.Math;

public class Enemy {

    public static void main(String[] args) {
        
        int arr[] = { 0, 0, 2, 0, 0, 0,1,2,0 };

        int heroIndex = -1;
        int minDistance = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                heroIndex = i;
                break; 
            }
        }

        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                minDistance = Math.min(minDistance, Math.abs(heroIndex - i));
            }
        }

        System.out.println(minDistance == Integer.MAX_VALUE ? "No enemy found!" : "Minimum distance: " + minDistance);
    }
}