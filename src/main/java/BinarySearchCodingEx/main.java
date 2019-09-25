package BinarySearchCodingEx;

import java.util.Arrays;

public class main {

    public static void main(String[] args) {

        int[] testOne = {1, 5, 7, 8, 9, 11, 18, 19, 20, 25};
        System.out.println(findTarget(testOne,11));

    }
    public static int findTarget(int[] arr, int target){
        int low = 0;
        int high = arr.length -1;
        int t = 0;
        while(low < high){
            int mid = ( low + high)/2;
            if(arr[mid] < target){
                    low = mid +1;

            }else if(arr[mid] > target){
                    high = mid - 1;
            }else if(arr[mid] == target){
                t= mid;
                break;
            }
        }

        return t;
    }


}
